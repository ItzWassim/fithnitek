/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Reclamation {
    private int id ;
    private String typereclamation;
    private String message ;
    private int idutilisateur ;

    public Reclamation() {
    }

    public Reclamation(int id, String typereclamation, String message, int idutilisateur) {
        this.id = id;
        this.typereclamation = typereclamation;
        this.message = message;
        this.idutilisateur = idutilisateur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTypereclamation() {
        return typereclamation;
    }

    public void setTypereclamation(String typereclamation) {
        this.typereclamation = typereclamation;
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
}
 
