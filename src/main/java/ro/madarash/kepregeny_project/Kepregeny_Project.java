/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ro.madarash.kepregeny_project;

/**
 *
 * @author hunor
 */
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Kepregeny_Project {

    public static void main(String[] args) {
        System.out.println("--- Setting up Marvel Comics Test Scenario ---");

        // 1. Create Publisher
        Publisher marvel = new Publisher("Marvel Comics", "USA");

        // 2. Create Writers and Artists
        // These are the ORIGINAL CREATORS for the *characters*
        Writer stanLee = new Writer("Stan Lee", "American");
        Artist steveDitko = new Artist("Steve Ditko", "American");

        // These are the creative team for a *specific comic book issue*
        Writer danSlott = new Writer("Dan Slott", "American");
        Artist humbertoRamos = new Artist("Humberto Ramos", "Mexican");

        // 3. Create Characters
        Superhero spiderMan = new Superhero("Peter Parker", "Bitten by a radioactive spider.", "Spider-Man");
        Villain greenGoblin = new Villain("Norman Osborn", "Exposed to an experimental formula.", "Green Goblin");
        Civilian maryJane = new Civilian("Mary Jane Watson", "Aspiring actress and model.");

        // 4. Link Original Creators to Characters
        spiderMan.addCreator(stanLee, "Co-creator (Writer)");
        spiderMan.addCreator(steveDitko, "Co-creator (Artist)");

        greenGoblin.addCreator(stanLee, "Co-creator (Writer)");
        greenGoblin.addCreator(steveDitko, "Co-creator (Artist)");

        maryJane.addCreator(stanLee, "Co-creator (Writer)");

        System.out.println("Characters created and original creators assigned.");

        // 5. Establish ComicCharacter-to-ComicCharacter Affiliations
        spiderMan.addReciprocalCharacterAffiliation(greenGoblin, "Arch-Nemesis");
        spiderMan.addReciprocalCharacterAffiliation(maryJane, "Ally / Spouse");
        System.out.println("Character affiliations have been set.");
        System.out.println("----------------------------------------\n");

        // 6. Create a Comic Book
        ComicBook asm700 = new ComicBook("The Amazing Spider-Man #700", "Superhero");

        // 7. Link Writers and Artists *to that specific comic book*
        asm700.addWriter(danSlott);
        asm700.addArtist(humbertoRamos); // Penciler
        // In a real app, you might add more artists for inking, coloring, etc.

        // 8. Link Characters that appear in the comic
        asm700.addCharacter(spiderMan);
        asm700.addCharacter(greenGoblin); // Assuming he makes an appearance
        asm700.addCharacter(maryJane);

        // 9. Create a specific Edition for the Comic Book
        Edition asm700Edition = new Edition(
                "Standard Cover (2012)",
                new Date(), // Placeholder date
                "B00A85LI8A", // Example ASIN/ISBN
                marvel,
                asm700
        );
        asm700.addEdition(asm700Edition);

        // 10. --- Display the Results ---
        System.out.println("--- COMIC BOOK DETAILS ---");
        System.out.println("Title: " + asm700.getTitle());

        // Display Writers *for this issue*
        System.out.println("\nCreative Team for this Comic Book:");
        for (Writer writer : asm700.getWriters()) {
            System.out.println("- Writer: " + writer.getName());
        }

        // Display Artists *for this issue*
        for (Artist artist : asm700.getArtists()) {
            System.out.println("- Artist: " + artist.getName());
        }

        // Display Characters *in this issue*
        System.out.println("\nFeatured Characters in this Comic:");
        for (ComicCharacter character : asm700.getFeaturedCharacters()) {
            System.out.println("- " + character.getDisplayName());

            // --- Display Original Creators for the ComicCharacter ---
            Map<Writer, String> creatorWriters = character.getCreatorWriters();
            Map<Artist, String> creatorArtists = character.getCreatorArtists();

            if (!creatorWriters.isEmpty() || !creatorArtists.isEmpty()) {
                System.out.println("  (Original Creators):");

                // Display writer-creators
                for (Map.Entry<Writer, String> entry : creatorWriters.entrySet()) {
                    System.out.println("    -> " + entry.getKey().getName() + " (" + entry.getValue() + ")");
                }

                // Display artist-creators
                for (Map.Entry<Artist, String> entry : creatorArtists.entrySet()) {
                    System.out.println("    -> " + entry.getKey().getName() + " (" + entry.getValue() + ")");
                }
            }

            // Display *this character's* affiliations
            Map<ComicCharacter, String> affiliations = character.getCharacterAffiliations();
            if (!affiliations.isEmpty()) {
                System.out.println("  (Affiliations):");
                for (Map.Entry<ComicCharacter, String> entry : affiliations.entrySet()) {
                    System.out.println("    -> " + entry.getKey().getDisplayName() + " (" + entry.getValue() + ")");
                }
            }
        }
        System.out.println("--------------------------");
    }
}
