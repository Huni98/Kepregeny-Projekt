/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kepregeny_project;

/**
 *
 * @author hunor
 */

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Kepregeny_Project 
{

    public static void main(String[] args) {
        System.out.println("--- Setting up the Comic Book Universe ---");

        // 1. Create Publishers and Writers
        Publisher marvel = new Publisher("Marvel Comics", "USA");
        Writer stanLee = new Writer("Stan Lee", "American");
        Writer steveDitko = new Writer("Steve Ditko", "American");

        // 2. Create Characters using Inheritance
        // Note: The Alignment is set automatically by the subclass constructor.
        Superhero spiderMan = new Superhero("Peter Parker", "Bitten by a radioactive spider.", "Spider-Man");
        Villain greenGoblin = new Villain("Norman Osborn", "Exposed to an experimental formula.", "Green Goblin");
        Civilian maryJane = new Civilian("Mary Jane Watson", "An aspiring actress and model.");
        
        System.out.println("Characters created: " + spiderMan.getDisplayName() + ", " + greenGoblin.getDisplayName() + ", " + maryJane.getDisplayName());

        // 3. Establish Character-to-Character Affiliations
        spiderMan.addReciprocalAffiliation(maryJane, "Love Interest");
        spiderMan.addReciprocalAffiliation(greenGoblin, "Arch-Nemesis");
        System.out.println("Character affiliations have been set.");
        System.out.println("----------------------------------------\n");


        // 4. Create a Comic Book
        ComicBook amazingFantasy15 = new ComicBook("Amazing Fantasy #15", "Superhero");

        // 5. Link Writers and Characters to the Comic Book
        amazingFantasy15.addWriter(stanLee);
        amazingFantasy15.addWriter(steveDitko);
        amazingFantasy15.addCharacter(spiderMan); // Adding a Superhero
        amazingFantasy15.addCharacter(greenGoblin); // Adding a Villain
        amazingFantasy15.addCharacter(maryJane); // Adding a Civilian

        // 6. Create a specific Edition for the Comic Book
        Edition firstPrinting = new Edition(
            "First Printing",
            new Date(), // Using today's date for simplicity
            "978-0785126330",
            marvel,
            amazingFantasy15
        );
        amazingFantasy15.addEdition(firstPrinting);


        // 7. --- Display the Results ---
        // Print all the information linked to our ComicBook object to prove it works.
        System.out.println("--- COMIC BOOK DETAILS ---");
        System.out.println("Title: " + amazingFantasy15.getTitle());
        System.out.println("Genre: " + amazingFantasy15.getGenre());

        // Display Writers
        System.out.println("\nWriters:");
        for (Writer writer : amazingFantasy15.getWriters()) {
            System.out.println("- " + writer.getName());
        }

        // Display Characters and their affiliations (demonstrates polymorphism and linking)
        System.out.println("\nFeatured Characters:");
        List<Character> characters = amazingFantasy15.getFeaturedCharacters();
        for (Character character : characters) {
            System.out.println("- " + character.getDisplayName() + " (Real Name: " + character.getRealName() + ")");
            
            // Display this character's affiliations
            Map<Character, String> affiliations = character.getAffiliations();
            if (!affiliations.isEmpty()) {
                System.out.println("  Affiliations:");
                for (Map.Entry<Character, String> entry : affiliations.entrySet()) {
                    System.out.println("    -> " + entry.getKey().getDisplayName() + " (" + entry.getValue() + ")");
                }
            }
        }
        
        // Display Edition Info
        System.out.println("\nEditions:");
        for (Edition edition : amazingFantasy15.getEditions()) {
            System.out.println("- " + edition.getEditionName() + " published by " + edition.getPublisher().getName());
        }
        System.out.println("--------------------------");
    }
}

