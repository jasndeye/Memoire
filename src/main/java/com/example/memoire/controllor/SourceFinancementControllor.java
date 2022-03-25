package com.example.memoire.controllor;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.SourceFinancementdao;
import com.example.memoire.modele.SourceFinancement;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SourceFinancementControllor {

    
    public SourceFinancementdao sourceFinancement;
    //Enregistrer une source de Financement
     @PostMapping(value = "/enregistrerFinancement")
     public SourceFinancement enregistrerUnTutelle(@RequestBody SourceFinancement sf) throws IOException
      {
        return sourceFinancement.save(sf);	 
      }
      //supprimer une source de Financement
      @DeleteMapping(value = "/sourceFinancement/delete/{id}")
      void deleteFinancement(@PathVariable Integer id) {
        sourceFinancement.deleteById(id);
      }
        //lister tous les sources de Financement
        @GetMapping(value = "/listeFinancement")
        public List<SourceFinancement> listeFinancement()  {
             List<SourceFinancement> liste = sourceFinancement.findAll();
          
             return liste;
        }
      //recuperer une source de Financement par son id
      @GetMapping(path="/sourceFinancement/{id}")
        public Optional<SourceFinancement> getAction(@PathVariable Integer id ){
          
            Optional<SourceFinancement> obj = sourceFinancement.findById(id);
  
              if(!obj.isPresent())  throw new EntityNotFoundException("Cette source de Financement n'existe pas");
          return obj;
        }
      
  }
  