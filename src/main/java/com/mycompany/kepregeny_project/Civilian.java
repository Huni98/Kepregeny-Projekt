/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kepregeny_project;

/**
 *
 * @author hunor
 */
public class Civilian extends Character 
{

    public Civilian(String realName, String originStory) 
    {
        super(realName, originStory);
    }
    
    @Override
    public String getDisplayName() 
    {
        return getRealName(); 
    }
}
