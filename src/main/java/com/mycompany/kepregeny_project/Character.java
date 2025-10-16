/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kepregeny_project;

/**
 *
 * @author hunor
 */
import java.util.ArrayList;
import java.util.HashMap; // Import HashMap
import java.util.List;
import java.util.Map; // Import Map

public abstract class Character 
{
    private String realName;
    private String originStory;
    private List<ComicBook> comicBookAppearances;
    
    // This now tracks relationships to other characters
    private Map<Character, String> affiliations; 

    public Character(String realName, String originStory) 
    {
        this.realName = realName;
        this.originStory = originStory;
        this.comicBookAppearances = new ArrayList<>();
        this.affiliations = new HashMap<>(); // Initialize as a HashMap
    }
    
    /**
     * Adds a one-way affiliation from this character to another.
     * @param character The character to be affiliated with.
     * @param relationshipType A description of the relationship (e.g., "Ally").
     */
    public void addAffiliation(Character character, String relationshipType) 
    {
        // We also check to make sure a character isn't being affiliated with itself
        if (this != character) 
        {
            this.affiliations.put(character, relationshipType);
        }
    }

    /**
     * Creates a two-way (reciprocal) affiliation between two characters.
     * For example, if A is an "Ally" to B, B becomes an "Ally" to A.
     */
    public void addReciprocalAffiliation(Character character, String relationshipType) 
    {
        this.addAffiliation(character, relationshipType); // A -> B
        character.addAffiliation(this, relationshipType); // B -> A
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
    public Map<Character, String> getAffiliations() { return affiliations; } 
}
