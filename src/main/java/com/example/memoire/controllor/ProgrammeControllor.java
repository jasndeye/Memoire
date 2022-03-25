package com.example.memoire.controllor;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;

import com.example.memoire.dao.Programmedao;
import com.example.memoire.modele.Programme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
// @CrossOrigin("*")
public class ProgrammeControllor {
  @Autowired
	private Programmedao pg;

  //Enregistrer un nouveau programme
   @PostMapping(value = "/enreg_prod")
   public Programme enregistrerUnProgramme(@RequestBody Programme programme) throws IOException
    {
      return pg.save(programme);	 
    }
    //supprimer un programme
    @DeleteMapping(value = "/programme/delete/{idProgramme}")
    void deleteProgrammeByNomProd(@PathVariable Integer idProgramme) {
        pg.deleteById(idProgramme);
    }
      //lister tous les programmes
  	@GetMapping(value = "/listProgrammes")
  	public List<Programme> listProgrammes()  {
		   List<Programme> listEmployee = pg.findAll();
		
		   return listEmployee;
  	}
    //recuperer un programme par son nomCourt
    @GetMapping(path="/programme/{idProgramme}")
  	public Optional<Programme> getEtudiant(@PathVariable Integer idProgramme ){
		
		  Optional<Programme> prg = pg.findById(idProgramme);

	        if(!prg.isPresent())  throw new EntityNotFoundException("Le programme correspondant au numeroEtudiant : "
	                                                                      + idProgramme + " n'existe pas");
		return prg;
  	}
    
}
