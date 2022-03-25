package com.example.memoire.controllor;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.Objectifdao;
import com.example.memoire.modele.Objectif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjectifControllor {
    @Autowired
	private Objectifdao objectif;

  //Enregistrer un Objectif
   @PostMapping(value = "/enregobjectif")
   public Object enregistrerUnObject(@RequestBody Objectif obj) throws IOException
    {
      return objectif.save(obj);	 
    }
    //supprimer un Objectif
    @DeleteMapping(value = "/objectif/delete/{id}")
    void deleteObjectif(@PathVariable Integer id) {
        objectif.deleteById(id);
    }
      //lister tous les Objectifs
  	@GetMapping(value = "/listObjectifs")
  	public List<Objectif> listObjectif()  {
		   List<Objectif> liste = objectif.findAll();
		
		   return liste;
  	}
    //recuperer un Objectif par son id
    @GetMapping(path="/Objectif/{id}")
  	public Optional<Objectif> getObjectif(@PathVariable Integer id ){
		
		  Optional<Objectif> obj = objectif.findById(id);

	        if(!obj.isPresent())  throw new EntityNotFoundException("Cette Objectif n'existe pas");
		return obj;
  	}
    
}
