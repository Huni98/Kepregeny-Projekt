/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.madarash.kepregeny_project;

/**
 *
 * @author hunor
 */
import java.util.Date;

public class Edition 
{
    private String editionName;
    private Date publicationDate;
    private String isbn;
    private Publisher publisher;
    private ComicBook comicBook;

    public Edition(String editionName, Date publicationDate, String isbn, Publisher publisher, ComicBook comicBook) 
    {
        this.editionName = editionName;
        this.publicationDate = publicationDate;
        this.isbn = isbn;
        this.publisher = publisher;
        this.comicBook = comicBook;
    }

    public String getEditionName() 
    {
        return editionName;
    }

    public Publisher getPublisher() 
    {
        return publisher;
    }

    public ComicBook getComicBook() 
    {
        return comicBook;
    }
}
