/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.madarash.kepregeny_project;

import java.util.Date;

/**
 *
 * @author hunor
 */
public class Publisher {

    private String name;
    private String country;
    private Date foundationYear;

    public Publisher(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Publisher(String name, String country, Date foundationYear) {
        this.name = name;
        this.country = country;
        this.foundationYear = foundationYear;
    }

    public Date getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(Date foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
