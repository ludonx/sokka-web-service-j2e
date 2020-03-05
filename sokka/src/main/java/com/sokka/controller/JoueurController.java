package com.sokka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sokka.model.Joueur;
import com.sokka.model.historique.JoueurHistorique;
import com.sokka.service.joueur.JoueurService;
import com.sokka.service.joueur.historique.JoueurHistoriqueService;

@RestController
@RequestMapping(path = JoueurController.BASE_URL )
public class JoueurController {
	
	public static final String BASE_URL = "/sokka/api/v1/services/joueur";
	public static final String PathGetAllJoueurs = "/all";
	public static final String PathGetJoueurByID = "/{id}";
	public static final String PathAddJoueur = "/add";
	public static final String PathAddListJoueur = "/add/list";
	
	
	public static final String PathAddJoueurToEquipe = "/equipe/add";//"/joueur/add/{idJoueur},{idEquipe}";
	public static final String PathGetAllJoueurEquipes = "/equipe/{id}";

	public static final String PathUpdateJoueur = "/update";
	
	@Autowired
	private JoueurService joueurService;
	@Autowired
	private JoueurHistoriqueService joueurHistoriqueService;

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
	@GetMapping(path=JoueurController.PathGetAllJoueurEquipes)
	public List<Joueur> getAllJoueurEquipe(@PathVariable Long id){
		return joueurService.findJoueurEquipeById(id);
	}
	
	@PostMapping(path=JoueurController.PathAddJoueur)
	@ResponseStatus(HttpStatus.CREATED)
	public Joueur addJoueur(@RequestBody Joueur joueur) {
		return joueurService.addJoueur(joueur);
	}
	
	@PostMapping(path=JoueurController.PathAddListJoueur)
	@ResponseStatus(HttpStatus.CREATED)
	public List<Joueur> addListJoueur(@RequestBody List<Joueur> joueurs) {
		return joueurService.addJoueur(joueurs);
	}
	
	@PostMapping(path=JoueurController.PathAddJoueurToEquipe)
	@ResponseStatus(HttpStatus.CREATED)
	public String addJoueurToEquipe(@RequestParam(name = "idJoueur")String idJoueurString,@RequestParam("idEquipe")String idEquipeString) {
		Long idJoueur = Long.parseLong(idJoueurString) ;
		Long idEquipe = Long.parseLong(idEquipeString) ;
		String msg; 
		Integer res = joueurService.addJoueurToEquipe(idJoueur,idEquipe);
		if(res == 1 )msg = "le Joueur d'id : " + idJoueurString + " a été ajouté à l'équipe d'id : " + idEquipeString ;
		else msg = "Ajout Impossible !";
		return msg;
	}
	
	@PutMapping(path=JoueurController.PathUpdateJoueur)
	@ResponseStatus(HttpStatus.CREATED)
	public String updateJoueur(@RequestBody Joueur joueur) {
		String msg = "Le joueur d'id [" +joueur.getIdJoueur() +"] n'existe pas !"; 
		if(joueurService.existsJoueurById(joueur.getIdJoueur())) {
			// on fait une sauvegarde avant de modifier
			JoueurHistorique joueurHistorique = new JoueurHistorique(joueur);
			joueurHistoriqueService.addJoueurHistorique(joueurHistorique);
			
			joueurService.addJoueur(joueur);
			msg = "Modification effectuée !";
		}
		return msg;
	}

}
