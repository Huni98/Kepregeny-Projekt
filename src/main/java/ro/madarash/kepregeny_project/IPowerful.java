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
    
    List<String> getPowers();
    
    void addPower(String power);
    
    void clearPowers();
}
