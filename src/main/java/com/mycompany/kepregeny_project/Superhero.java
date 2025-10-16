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

public class Superhero extends Character 
{
    // Attributes specific to Superheroes (and Villains)
    private String alias;
    private List<String> powers;
    private List<String> affiliations;
    

    public Superhero(String realName, String originStory, String alias) 
    {
        super(realName, originStory); // Calls the parent class constructor
        this.alias = alias;
        this.powers = new ArrayList<>();
        this.affiliations = new ArrayList<>();
    }
    
    @Override
    public String getDisplayName() 
    {
        return this.alias; // A superhero's display name is their alias
    }

    // Methods to add powers, affiliations, etc.
    public void addPower(String power) { this.powers.add(power); }
}
