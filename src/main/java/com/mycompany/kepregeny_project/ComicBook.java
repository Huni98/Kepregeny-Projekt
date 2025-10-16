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
import java.util.List;

public class ComicBook 
{
    
    private String title;
    private String genre;
    private List<Writer> writers;
    private List<Edition> editions;
    // This list can hold Superhero, Villain, and Civilian objects!
    private List<Character> featuredCharacters;

    public ComicBook(String title, String genre) 
    {
        this.title = title;
        this.genre = genre;
        this.writers = new ArrayList<>();
        this.editions = new ArrayList<>();
        this.featuredCharacters = new ArrayList<>();
    }

    // This single method works for any character type
    public void addCharacter(Character character) 
    {
        if (!this.featuredCharacters.contains(character)) 
        {
            this.featuredCharacters.add(character);
            character.addAppearance(this);
        }
    }

    
    public List<Character> getFeaturedCharacters() 
    {
        return featuredCharacters;
    }
    // ... other getters and methods
    public void addWriter(Writer writer) {
        this.writers.add(writer);
    }

    public void addEdition(Edition edition) {
        this.editions.add(edition);
    }
    
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public List<Writer> getWriters() { return writers; }
    public List<Edition> getEditions() { return editions; }
    
}
