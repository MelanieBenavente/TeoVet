/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teovet;

/**
 *
 * @author dks
 */
public class Patient {
    int id;
    String name; 
    String dateBorn; 
    
    public Patient (int id, String name, String dateBorn){
        this.id = id;
        this.name = name;
        this.dateBorn = dateBorn;
        
    }
}
