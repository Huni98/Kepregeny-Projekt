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

public class ComicBook 
{
    
    private String title;
    private String genre;
    private List<Writer> writers;
    private List<Edition> editions;
    private List<Artist> artists;
    // This list can hold Superhero, Villain, and Civilian objects!
    private List<ComicCharacter> featuredCharacters;
    

    public ComicBook(String title, String genre) 
    {
        this.title = title;
        this.genre = genre;
        this.writers = new ArrayList<>();
        this.editions = new ArrayList<>();
        this.featuredCharacters = new ArrayList<>();
        this.artists = new ArrayList<>();
    }

    // This single method works for any character type
    public void addCharacter(ComicCharacter character) 
    {
        if (!this.featuredCharacters.contains(character)) 
        {
            this.featuredCharacters.add(character);
            character.addAppearance(this);
        }
    }

    
    public List<ComicCharacter> getFeaturedCharacters() 
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setWriters(List<Writer> writers) {
        this.writers = writers;
    }

    public void setEditions(List<Edition> editions) {
        this.editions = editions;
    }

    public void setFeaturedCharacters(List<ComicCharacter> featuredCharacters) {
        this.featuredCharacters = featuredCharacters;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
    
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public List<Writer> getWriters() { return writers; }
    public List<Edition> getEditions() { return editions; }
    
    
    // NEW: Getter for the artists list
    public List<Artist> getArtists() { return artists; }
    
    public void addArtist(Artist artist) 
    {
        if (!this.artists.contains(artist)) 
        {
            this.artists.add(artist);
            // Also update the artist's work history
            artist.addComicBook(this);
        }
    }
    
    public void clearWriters() { this.writers.clear(); }
    public void clearArtists() { this.artists.clear(); }
    public void clearCharacters() { this.featuredCharacters.clear(); }
}
