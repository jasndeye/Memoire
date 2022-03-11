package com.example.memoire.modele;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class SourceFinancement implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idSource;
   private String nomBailleur;
   private double budget;
   private String typeFinancement;
   
   public SourceFinancement(String nomBailleur, double budget, String typeFinancement) {
    this.nomBailleur = nomBailleur;
    this.budget = budget;
    this.typeFinancement = typeFinancement;
   }

   public Integer getIdSource() {
        return idSource;
    }
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public String getTypeFinancement() {
        return typeFinancement;
    }
    public void setTypeFinancement(String typeFinancement) {
        this.typeFinancement = typeFinancement;
    }
    public String getNomBailleur() {
        return nomBailleur;
    }
    public void setNomBailleur(String nomBailleur) {
        this.nomBailleur = nomBailleur;
    }
    public void setIdSource(Integer idSource) {
        this.idSource = idSource;
    }
    
//    public java.util.Collection<NatureEconomique> natureEconomique;
   
}
