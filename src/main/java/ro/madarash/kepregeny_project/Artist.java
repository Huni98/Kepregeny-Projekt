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
import java.util.List;

public class Artist 
{
    private String name;
    private String nationality;
    private List<ComicBook> comicBooksWorkedOn;
    private List<Character> charactersCoCreated;

    public Artist(String name, String nationality) 
    {
        this.name = name;
        this.nationality = nationality;
        this.comicBooksWorkedOn = new ArrayList<>();
        this.charactersCoCreated = new ArrayList<>();
    }

    /**
     * Adds a comic book to this artist's work history.
     * This method is typically called by the ComicBook class to ensure a two-way link.
     */
    public void addComicBook(ComicBook comicBook) 
    {
        if (!this.comicBooksWorkedOn.contains(comicBook)) 
        {
            this.comicBooksWorkedOn.add(comicBook);
        }
    }
    
    /**
     * Links a character this artist co-created.
     * This method is typically called by the Character class to ensure a two-way link.
     */
    public void addCharacterCoCreated(Character character)
    {
        if (!this.charactersCoCreated.contains(character)) 
        {
            this.charactersCoCreated.add(character);
        }
    }

    // --- Getters ---
    public String getName() 
    {
        return name;
    }

    public List<ComicBook> getComicBooksWorkedOn() 
    {
        return comicBooksWorkedOn;
    }
    
    public List<Character> getCharactersCoCreated() 
    {
        return charactersCoCreated;
    }
}

