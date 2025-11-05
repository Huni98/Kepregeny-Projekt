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

public class Superhero extends ComicCharacter 
{
    
    private String alias;
    private List<String> powers;
    private List<String> affiliations;
    

    public Superhero(String realName, String originStory, String alias) 
    {
        super(realName, originStory); 
        this.alias = alias;
        this.powers = new ArrayList<>();
        this.affiliations = new ArrayList<>();
    }
    
    @Override
    public String getDisplayName() 
    {
        return this.alias; // A superhero's display name is their alias
    }
    
    public List<String> getPowers() {
        return this.powers;
    }

    // Methods to add powers, affiliations, etc.
    public void addPower(String power) { this.powers.add(power); }
    
    // --- ADD THESE TWO METHODS ---
    public void addAffiliation(String teamName) {
        this.affiliations.add(teamName);
    }
    
    public List<String> getAffiliations() {
        return this.affiliations;
    }
    
    public void setAlias(String alias) { this.alias = alias; }
    public void clearPowers() { this.powers.clear(); }
}
