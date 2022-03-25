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
    private String nomCourt;
    private Float budget;
    private String description;
    private Date dateDebut;
    private Date dateFin;

    public Programme(){}
    public Programme(Integer idProgramme,String libelleProgrammer,String nomCourt, String description, Float budget, Date dateDebut, Date dateFin) 
    {
        this.idProgramme = idProgramme;
        this.libelleProgrammer = libelleProgrammer;
        this.nomCourt = nomCourt;
        this.description = description;
        this.budget = budget;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getLibelleProgramme() {
        return libelleProgrammer;
    }
    public void setLibelleProgramme(String libelleProgramme) {
        this.libelleProgrammer = libelleProgramme;
    }
    public String getNomCourt() {
        return nomCourt;
    }
    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
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
    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

}
