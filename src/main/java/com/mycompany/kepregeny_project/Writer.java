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

public class Writer 
{
    private String name;
    private String nationality;
    private List<ComicBook> comicBooks;

    public Writer(String name, String nationality) 
    {
        this.name = name;
        this.nationality = nationality;
        this.comicBooks = new ArrayList<>();
    }

    public void addComicBook(ComicBook comicBook) 
    {
        this.comicBooks.add(comicBook);
    }

    // Getters and Setters
    public String getName() 
    {
        return name;
    }

    public List<ComicBook> getComicBooks() 
    {
        return comicBooks;
    }
}
