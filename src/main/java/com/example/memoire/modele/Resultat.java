package com.example.memoire.modele;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Resultat implements Serializable{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idResultat;
    private String libelleResultat;
    public Action action;
    
    public Resultat( String libelleResultat, Action action) {
        this.libelleResultat = libelleResultat;
        this.action = action;
    }

    public Action getAction() {
       return action;
    }

    public String getLibelleResultat() {
        return libelleResultat;
    }

    public Integer getIdResultat() {
        return idResultat;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setLibelleResultat(String libelleResultat) {
        this.libelleResultat = libelleResultat;
    }

    public void setIdResultat(Integer idResultat) {
        this.idResultat = idResultat;
    }
    
 
 }