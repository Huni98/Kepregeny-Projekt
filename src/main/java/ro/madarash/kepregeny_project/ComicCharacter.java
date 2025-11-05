/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.madarash.kepregeny_project;

/**
 *
 * @author hunor
 */
import java.util.ArrayList;
import java.util.HashMap; // Import HashMap
import java.util.List;
import java.util.Map; // Import Map

public abstract class ComicCharacter 
{
    private String realName;
    private String originStory;
    private List<ComicBook> comicBookAppearances;
    
    // This now tracks relationships to other characters
    private Map<ComicCharacter, String> characterAffiliations; 
    
    //Map to store the artists who created this character and their role
    private Map<Artist, String> creatorArtists;
    
    //Map to store the writers who created this character and their role
    private Map<Writer, String> creatorWriters;

    public ComicCharacter(String realName, String originStory) 
    {
        this.realName = realName;
        this.originStory = originStory;
        this.comicBookAppearances = new ArrayList<>();
        this.characterAffiliations = new HashMap<>();
        this.creatorArtists = new HashMap<>();
        this.creatorWriters = new HashMap<>();
    }
    
    /**
     * Adds a one-way affiliation from this character to another.
     * @param character The character to be affiliated with.
     * @param relationshipType A description of the relationship (e.g., "Ally").
     */
    public void addCharacterAffiliation(ComicCharacter character, String relationshipType) 
    {
        // We also check to make sure a character isn't being affiliated with itself
        if (this != character) 
        {
            this.characterAffiliations.put(character, relationshipType);
        }
    }

    /**
     * Creates a two-way (reciprocal) affiliation between two characters.
     * For example, if A is an "Ally" to B, B becomes an "Ally" to A.
     */
    public void addReciprocalCharacterAffiliation(ComicCharacter character, String relationshipType) 
    {
        this.addCharacterAffiliation(character, relationshipType); // A -> B
        character.addCharacterAffiliation(this, relationshipType); // B -> A
    }
    
    /**
     * NEW: Adds a creating artist to this character.
     * @param artist The artist who co-created the character.
     * @param role Their role (e.g., "Co-creator (Penciler)").
     */
    public void addCreator(Artist artist, String role) 
    {
        if (!this.creatorArtists.containsKey(artist)) 
        {
            this.creatorArtists.put(artist, role);
            
            artist.addCharacterCoCreated(this);
        }
    }
    
    /**
     * NEW: Adds a creating writer to this character. (Method Overload)
     * @param writer The writer who co-created the character.
     * @param role Their role (e.g., "Co-creator (Writer)").
     */
    public void addCreator(Writer writer, String role) 
    {
        if (!this.creatorWriters.containsKey(writer)) 
        {
            this.creatorWriters.put(writer, role);
            
            writer.addCharacterCoCreated(this);
        }
    }

    public void addAppearance(ComicBook comicBook) 
    {
        if (!this.comicBookAppearances.contains(comicBook)) 
        {
            this.comicBookAppearances.add(comicBook);
        }
    }
    
    public abstract String getDisplayName();

    
    public String getRealName() { return realName; }
    public List<ComicBook> getComicBookAppearances() { return comicBookAppearances; }
    public Map<ComicCharacter, String> getCharacterAffiliations() { return characterAffiliations; }
    public String getOrigin() { return originStory; }
    
    // Getter for the creators map
    public Map<Artist, String> getCreatorArtists() { return creatorArtists; }
    
    // Getter for the writer creators map
    public Map<Writer, String> getCreatorWriters() { return creatorWriters; }
    
    public void setOrigin(String originStory) { this.originStory = originStory; }
    // We also need to clear lists
    public void clearAppearances() { this.comicBookAppearances.clear(); }
    public void clearCreatorWriters() { this.creatorWriters.clear(); }
    public void clearCreatorArtists() { this.creatorArtists.clear(); }
    public void clearCharacterAffiliations() { this.characterAffiliations.clear(); }
}
