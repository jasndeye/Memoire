package com.example.memoire.modele;


import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Objectif implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idObjectif;
    private String libelleObjectif;
//    public Action[] actions;
    public Programme programme;
    public Objectif(){}
    public Objectif(String libelleObjectif, Programme programme) {
      
        this.libelleObjectif = libelleObjectif;
        this.programme = programme;
     } 

    public Integer getIdObjectif() {
        return idObjectif;
    }

    public String getLibelleObjectif() {
        return libelleObjectif;
    }
    public void setLibelleObjectif(String libelleObjectif) {
        this.libelleObjectif = libelleObjectif;
    }
    public void setIdObjectif(Integer idObjectif) {
        this.idObjectif = idObjectif;
    }

}