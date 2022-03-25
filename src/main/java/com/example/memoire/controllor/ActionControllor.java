package com.example.memoire.controllor;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.Actiondao;
import com.example.memoire.modele.Action;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionControllor {
    public Actiondao action;
  //Enregistrer une action
   @PostMapping(value = "/enregobjectif")
   public Action enregistrerUnObject(@RequestBody Action act) throws IOException
    {
      return action.save(act);	 
    }
    //supprimer une action
    @DeleteMapping(value = "/action/delete/{id}")
    void deleteAction(@PathVariable Integer id) {
        action.deleteById(id);
    }
      //lister tous les actions
  	@GetMapping(value = "/listObjectifs")
  	public List<Action> listObjectif()  {
		   List<Action> liste = action.findAll();
		
		   return liste;
  	}
    //recuperer une action par son id
    @GetMapping(path="/action/{id}")
  	public Optional<Action> getAction(@PathVariable Integer id ){
		
		  Optional<Action> obj = action.findById(id);

	        if(!obj.isPresent())  throw new EntityNotFoundException("Cette action n'existe pas");
		return obj;
  	}
    
}
