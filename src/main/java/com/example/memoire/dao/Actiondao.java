package com.example.memoire.dao;

import com.example.memoire.modele.Action;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Actiondao extends JpaRepository<Action,Integer>{
    
}
