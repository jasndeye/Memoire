package com.example.memoire.controllor;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.Resultatdao;
import com.example.memoire.modele.Resultat;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultatControllor {
    public Resultatdao resultat;
//Enregistrer un resultat
@PostMapping(value = "/resultat")
public Resultat enregistrerUnObject(@RequestBody Resultat result) throws IOException
 {
   return resultat.save(result);	 
 }
 //supprimer un resultat
 @DeleteMapping(value = "/action/delete/{id}")
 void deleteAction(@PathVariable Integer id) {
    resultat.deleteById(id);
 }
   //lister tous les resultat
   @GetMapping(value = "/listObjectifs")
   public List<Resultat> listObjectif()  {
        List<Resultat> liste = resultat.findAll();
     
        return liste;
   }
 //recuperer un resultat par son id
 @GetMapping(path="/resultat/{id}")
   public Optional<Resultat> getResultat(@PathVariable Integer id ){
     
       Optional<Resultat> obj = resultat.findById(id);

         if(!obj.isPresent())  throw new EntityNotFoundException("Cet resultat n'existe pas");
     return obj;
   }
 
}

