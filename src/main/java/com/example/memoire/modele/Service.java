package com.example.memoire.modele;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Service implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idservice;
    private String libelleService;
    private String nom_courte;
    public Service(Integer idservice, String libelleService, String nom_courte) {
        this.idservice = idservice;
        this.libelleService = libelleService;
        this.setNom_courte(nom_courte);
    }
    public String getNom_courte() {
        return nom_courte;
    }
    public void setNom_courte(String nom_courte) {
        this.nom_courte = nom_courte;
    }
    public String getLibelleService() {
        return libelleService;
    }
    public void setLibelleService(String libelleService) {
        this.libelleService = libelleService;
    }
}
