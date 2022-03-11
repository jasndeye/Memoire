package com.example.memoire.modele;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Activite implements Serializable{
    
     // public ResponsableActivite responsable;
    // public java.util.Collection<SourceFinancement> sourceFinancement;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idActivite;
    private String libelleActivite;
    private double coutTotalActivite;
    public Resultat resultat;

    public Activite(String libelleActivite, double coutTotalActivite, Resultat resultat) {
        this.libelleActivite = libelleActivite;
        this.coutTotalActivite = coutTotalActivite;
        this.resultat = resultat;
    }
   
    public String getLibelleActivite() {
        return libelleActivite;
    }
    public Integer getIdActivite() {
        return idActivite;
    }
    public void setIdActivite(Integer idActivite) {
        this.idActivite = idActivite;
    }
    public double getCoutTotalActivite() {
        return coutTotalActivite;
    }
    public void setCoutTotalActivite(double coutTotalActivite) {
        this.coutTotalActivite = coutTotalActivite;
    }
    public void setLibelleActivite(String libelleActivite) {
        this.libelleActivite = libelleActivite;
    }
    public Resultat getResultat() {
        return resultat;
    }
    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }
}
