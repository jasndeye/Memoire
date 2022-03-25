package com.example.memoire.controllor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.Servicedao;
import com.example.memoire.modele.Service;
@RestController
public class ServiceControllor {
    public Servicedao service;
    //Enregistrer un service
     @PostMapping(value = "/enregistrerTutelle")
     public Service enregistrerUnTutelle(@RequestBody Service serv) throws IOException
      {
        return service.save(serv);	 
      }
      //supprimer un service
      @DeleteMapping(value = "/service/delete/{id}")
      void deleteService(@PathVariable Integer id) {
        service.deleteById(id);
      }
        //lister tous les services
        @GetMapping(value = "/listeServices")
        public List<Service> listeService()  {
             List<Service> liste = service.findAll();
          
             return liste;
        }
      //recuperer un service par son id
      @GetMapping(path="/service/{id}")
        public Optional<Service> getAction(@PathVariable Integer id ){
          
            Optional<Service> obj = service.findById(id);
  
              if(!obj.isPresent())  throw new EntityNotFoundException("Cet service n'existe pas");
          return obj;
        }
      
  }
  
