package com.example.memoire.modele;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Tutelle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtutelle;
    private String libelle_Tutelle;
    private String nom_courte;
    
    public Tutelle(Integer idtutelle, String libelle_Tutelle, String nom_courte) {
        this.idtutelle = idtutelle;
        this.setLibelle_Tutelle(libelle_Tutelle);
        this.setNom_courte(nom_courte);
    }
    public String getNom_courte() {
        return nom_courte;
    }
    public void setNom_courte(String nom_courte) {
        this.nom_courte = nom_courte;
    }
    public String getLibelle_Tutelle() {
        return libelle_Tutelle;
    }
    public void setLibelle_Tutelle(String libelle_Tutelle) {
        this.libelle_Tutelle = libelle_Tutelle;
    }
   
}
