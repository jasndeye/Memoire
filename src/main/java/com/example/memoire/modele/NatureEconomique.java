package com.example.memoire.modele;
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class NatureEconomique implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idnature;
    private String libelleNature;

    public NatureEconomique(Integer idNature, String libelleNature) {
        this.idnature = idNature;
        this.setLibelleNature(libelleNature);
    }
    public String getLibelleNature() {
        return libelleNature;
    }
    public void setLibelleNature(String libelleNature) {
        this.libelleNature = libelleNature;
    }
}
