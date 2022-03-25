package com.example.memoire.controllor;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.NatureEconomiquedao;
import com.example.memoire.modele.NatureEconomique;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class NatureEconomiqueContollor {
        public NatureEconomiquedao nature;
        //Enregistrer une NatureEconomique
         @PostMapping(value = "/enregobjectif")
         public NatureEconomique enregistrerNatureEconomique(@RequestBody NatureEconomique ne) throws IOException
          {
            return nature.save(ne);	 
          }
          //supprimer une NatureEconomique
          @DeleteMapping(value = "/nature/delete/{id}")
          void deleteNature(@PathVariable Integer id) {
            nature.deleteById(id);
          }
            //lister tous les NatureEconomique
            @GetMapping(value = "/listeNatureEconomique")
            public List<NatureEconomique> listNature()  {
                 List<NatureEconomique> liste = nature.findAll();
              
                 return liste;
            }
          //recuperer une NatureEconomique par son id
          @GetMapping(path="/action/{id}")
            public Optional<NatureEconomique> getNatureEconomique(@PathVariable Integer id ){
              
                Optional<NatureEconomique> obj = nature.findById(id);
      
                  if(!obj.isPresent())  throw new EntityNotFoundException("Cette NatureEconomique n'existe pas");
              return obj;
            }
    }
    
