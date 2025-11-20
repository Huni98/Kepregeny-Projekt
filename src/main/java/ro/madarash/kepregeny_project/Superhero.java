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

public class Superhero extends ComicCharacter implements IPowerful {

    private String alias;
    private List<String> powers;
    private List<String> affiliations;

    public Superhero(String realName, String originStory, String alias) {
        super(realName, originStory);
        this.alias = alias;
        this.powers = new ArrayList<>();
        this.affiliations = new ArrayList<>();
    }

    @Override
    public String getDisplayName() {
        return this.alias;
    }

    @Override
    public List<String> getPowers() {
        return this.powers;
    }

    
    @Override
    public void addPower(String power) {
        this.powers.add(power);
    }

    public void addAffiliation(String teamName) {
        this.affiliations.add(teamName);
    }

    public List<String> getAffiliations() {
        return this.affiliations;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public void clearPowers() {
        this.powers.clear();
    }
}
