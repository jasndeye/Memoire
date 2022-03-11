package com.example.memoire.modele;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Action implements Serializable{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idAction;
   private String libelleAction;
   public Objectif objectif;
    
    public Action(String libelleAction, Objectif objectif) {

        this.libelleAction = libelleAction;
        this.objectif = objectif;
    }
    public Integer getIdAction() {
        return idAction;
    }
    public String getLibelleAction() {
        return libelleAction;
    }

    public void setLibelleAction(String libelleAction) {
        this.libelleAction = libelleAction;
    }

    public void setIdAction(Integer idAction) {
        this.idAction = idAction;
    }
   

}
