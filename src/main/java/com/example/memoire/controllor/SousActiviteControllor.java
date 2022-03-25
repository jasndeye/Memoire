package com.example.memoire.controllor;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.SousActivitedao;
import com.example.memoire.modele.SousActivite;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SousActiviteControllor {
    public SousActivitedao sousActivite;
    //Enregistrer une SousActivite
     @PostMapping(value = "/enregistrer/sousActivite")
     public SousActivite enregistrerSousActivite(@RequestBody SousActivite sousacti) throws IOException
      {
        return sousActivite.save(sousacti);	 
      }
      //supprimer une sousActivite
      @DeleteMapping(value = "/sousActivite/delete/{id}")
      void deleteSousActivite(@PathVariable Integer id) {
        sousActivite.deleteById(id);
      }
        //lister tous les sous_Activites
        @GetMapping(value = "/listSousActivites")
        public List<SousActivite> listSousActivite()  {
             List<SousActivite> liste = sousActivite.findAll();
          
             return liste;
        }
      //recuperer une sousActivite par son id
      @GetMapping(path="/sousActivite/{id}")
        public Optional<SousActivite> getSousActivite(@PathVariable Integer id ){
          
            Optional<SousActivite> obj = sousActivite.findById(id);
  
              if(!obj.isPresent())  throw new EntityNotFoundException("Cette Sous Activite n'existe pas");
          return obj;
        }
}
