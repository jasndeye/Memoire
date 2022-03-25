package com.example.memoire.controllor;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.Activitedao;
import com.example.memoire.modele.Activite;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ActiviteControllor {
    public Activitedao activite;
    //Enregistrer une activite
     @PostMapping(value = "/enregobjectif")
     public Activite enregistrerUnObject(@RequestBody Activite acti) throws IOException
      {
        return activite.save(acti);	 
      }
      //supprimer une activite
      @DeleteMapping(value = "/activite/delete/{id}")
      void deleteAction(@PathVariable Integer id) {
        activite.deleteById(id);
      }
        //lister tous les activites
        @GetMapping(value = "/listActivites")
        public List<Activite> listObjectif()  {
             List<Activite> liste = activite.findAll();
          
             return liste;
        }
      //recuperer une action par son id
      @GetMapping(path="/action/{id}")
        public Optional<Activite> getAction(@PathVariable Integer id ){
          
            Optional<Activite> obj = activite.findById(id);
  
              if(!obj.isPresent())  throw new EntityNotFoundException("Cette activite n'existe pas");
          return obj;
        }
      
  }