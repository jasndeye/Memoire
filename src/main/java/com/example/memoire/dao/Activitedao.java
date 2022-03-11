package com.example.memoire.dao;

import com.example.memoire.modele.Activite;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Activitedao extends JpaRepository<Activite,Integer>{
    
}
