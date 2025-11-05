/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.madarash.kepregeny_project;

/**
 *
 * @author hunor
 */
public class Civilian extends ComicCharacter 
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
