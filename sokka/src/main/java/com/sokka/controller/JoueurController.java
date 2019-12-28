package com.sokka.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sokka.model.Joueur;
import com.sokka.service.JoueurService;

@RestController
@RequestMapping(path = JoueurController.BASE_URL )
public class JoueurController {
	
	public static final String BASE_URL = "/sokka/api/v1/services";
	public static final String PathGetAllJoueurs = "/joueur/all";
	public static final String PathGetJoueurByID = "/joueur/{id}";
	public static final String PathAddJoueur = "/joueur/add";
	
	//@Autowired
	//private JoueurService joueurService;
	private final JoueurService joueurService;

	public JoueurController(JoueurService joueurService) {
		super();
		this.joueurService = joueurService;
	}
	
	@GetMapping(path=JoueurController.PathGetAllJoueurs)
	public List<Joueur> getAllJoueurs(){
		return joueurService.findAllJoueur();
	}
	
	@GetMapping(path=JoueurController.PathGetJoueurByID)
	public Joueur getJoueurById(@PathVariable Long id){
		return joueurService.findJoueurById(id);
	}
	
	@PostMapping(path=JoueurController.PathAddJoueur)
	@ResponseStatus(HttpStatus.CREATED)
	public Joueur addJoueur(@RequestBody Joueur joueur) {
		return joueurService.addJoueur(joueur);
		
		/*{
			"idStringJoueur":"12355",
			"pseudoJoueur":"new",
			"nomJoueur":"new",
			"prenomJoueur":"j1Prenom",
			"scoreEloJoueur":3,
			"scoreFairPlayJoueur":3,
			"dateDebutJoueur":"2019-12-27T23:50:58.000+0000",
			"dateFinJoueur":null,
			"estSupprimer":false
		}*/
	}

}
