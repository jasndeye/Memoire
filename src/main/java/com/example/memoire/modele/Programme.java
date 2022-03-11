package com.example.memoire.modele;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Programme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idprogramme")
    private Integer idProgramme;
    private String libelleProgrammer;
    private float budget;
    private String description;
    private Date dateDebut;
    // public Objectif[] objectifs;

    public Programme(String libelleProgramme, String description, Float budget, Date date) {
      
        this.libelleProgrammer = libelleProgramme;
        this.description = description;
        this.budget = budget;
        this.dateDebut=date;
    }
    

    public Date getDateDebut() {
        return dateDebut;
    }


    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }


    public Programme(){

    }

    public String getLibelleProgramme() {
        return libelleProgrammer;
    }

    public void setLibelleProgramme(String libelleProgramme) {
        this.libelleProgrammer = libelleProgramme;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

}
