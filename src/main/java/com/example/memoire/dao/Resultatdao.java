package com.example.memoire.dao;

import com.example.memoire.modele.Resultat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Resultatdao extends JpaRepository <Resultat,Integer> {
    
}
