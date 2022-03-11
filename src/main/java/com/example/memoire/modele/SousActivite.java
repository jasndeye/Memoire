package com.example.memoire.modele;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class SousActivite implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSousActivite;
    private String libelleSousActivite;
    private double CoutSousActivite;
    public Activite activite;

    public SousActivite(String libelleSousActivite, double coutSousActivite, Activite activite) {
        this.libelleSousActivite = libelleSousActivite;
        CoutSousActivite = coutSousActivite;
        this.activite = activite;
     }
    // public java.util.Collection<SourceFinancement> sourceFinancement;
    public Integer getIdSousActivite() {
        return idSousActivite;
    }
    public double getCoutSousActivite() {
        return CoutSousActivite;
    }
    public void setCoutSousActivite(double coutSousActivite) {
        this.CoutSousActivite = coutSousActivite;
    }
    public String getLibelleSousActivite() {
        return libelleSousActivite;
    }
    public void setLibelleSousActivite(String libelleSousActivite) {
        this.libelleSousActivite = libelleSousActivite;
    }
    public void setIdSousActivite(Integer idSousActivite) {
        this.idSousActivite = idSousActivite;
    }
    public Activite getActivite() {
        return activite;
    }
    public void setActivite(Activite activite) {
        this.activite = activite;
    }
}
