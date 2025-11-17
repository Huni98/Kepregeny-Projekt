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

public class Artist {

    private String name;
    private String nationality;
    private List<ComicBook> comicBooksWorkedOn;
    private List<ComicCharacter> charactersCoCreated;

    public Artist(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.comicBooksWorkedOn = new ArrayList<>();
        this.charactersCoCreated = new ArrayList<>();
    }

    /**
     * Adds a comic book to this artist's work history. This method is typically
     * called by the ComicBook class to ensure a two-way link.
     */
    public void addComicBook(ComicBook comicBook) {
        if (!this.comicBooksWorkedOn.contains(comicBook)) {
            this.comicBooksWorkedOn.add(comicBook);
        }
    }

    /**
     * Links a character this artist co-created. This method is typically called
     * by the Character class to ensure a two-way link.
     */
    public void addCharacterCoCreated(ComicCharacter character) {
        if (!this.charactersCoCreated.contains(character)) {
            this.charactersCoCreated.add(character);
        }
    }

    // --- Getters ---
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<ComicBook> getComicBooksWorkedOn() {
        return comicBooksWorkedOn;
    }

    public List<ComicCharacter> getCharactersCoCreated() {
        return charactersCoCreated;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
