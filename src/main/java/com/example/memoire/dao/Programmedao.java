package com.example.memoire.dao;

import com.example.memoire.modele.Programme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Programmedao extends JpaRepository<Programme,Integer> {
    
}
