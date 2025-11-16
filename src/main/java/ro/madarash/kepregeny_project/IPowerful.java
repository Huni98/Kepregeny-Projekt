/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ro.madarash.kepregeny_project;

import java.util.List;

/**
 *
 * @author hunor
 */
public interface IPowerful {
    
    /**
     * Gets the list of powers for this character.
     * @return A List of strings describing the powers.
     */
    List<String> getPowers();
    
    /**
     * Adds a power to the character's list.
     * @param power A string description of the power.
     */
    void addPower(String power);
    
    /**
     * Clears all powers from the character's list.
     */
    void clearPowers();
}
