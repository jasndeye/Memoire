package com.example.memoire.controllor;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.Tutelledao;
import com.example.memoire.modele.Tutelle;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutelleControllor {
    
    public Tutelledao tutelle;
    //Enregistrer un tutelle
     @PostMapping(value = "/enregistrerTutelle")
     public Tutelle enregistrerUnTutelle(@RequestBody Tutelle tutel) throws IOException
      {
        return tutelle.save(tutel);	 
      }
      //supprimer un tutelle
      @DeleteMapping(value = "/tutelle/delete/{id}")
      void deleteTutelle(@PathVariable Integer id) {
        tutelle.deleteById(id);
      }
        //lister tous les tutelles
        @GetMapping(value = "/listeTutelles")
        public List<Tutelle> listeTutelle()  {
             List<Tutelle> liste = tutelle.findAll();
          
             return liste;
        }
      //recuperer un tutelle par son id
      @GetMapping(path="/tutelle/{id}")
        public Optional<Tutelle> getAction(@PathVariable Integer id ){
          
            Optional<Tutelle> obj = tutelle.findById(id);
  
              if(!obj.isPresent())  throw new EntityNotFoundException("Cet tutelle n'existe pas");
          return obj;
        }
      
  }
  