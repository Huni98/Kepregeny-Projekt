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

public class Villain extends Character 
{
    private String alias;
    private List<String> powers;
    private List<String> affiliations;
    

    public Villain(String realName, String originStory, String alias) 
    {
        super(realName, originStory);
        this.alias = alias;
        this.powers = new ArrayList<>();
        this.affiliations = new ArrayList<>();
    }

    @Override
    public String getDisplayName() 
    {
        return this.alias;
    }
}
