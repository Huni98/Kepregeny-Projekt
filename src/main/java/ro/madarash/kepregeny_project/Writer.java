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

public class Writer {

    private String name;
    private String nationality;
    private List<ComicBook> comicBooks;
    private List<ComicCharacter> charactersCoCreated;

    public Writer(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.comicBooks = new ArrayList<>();
        this.charactersCoCreated = new ArrayList<>();
    }

    public void addComicBook(ComicBook comicBook) {
        this.comicBooks.add(comicBook);
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

    public List<ComicBook> getComicBooks() {
        return comicBooks;
    }

    public List<ComicCharacter> getCharactersCoCreated() {
        return charactersCoCreated;
    }

}
