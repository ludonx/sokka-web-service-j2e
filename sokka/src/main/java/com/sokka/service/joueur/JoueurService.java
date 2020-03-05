package com.sokka.service.joueur;

import java.util.List;

import com.sokka.model.Joueur;

public interface JoueurService {
	
	Joueur findJoueurById(Long id);
	List<Joueur> findAllJoueur();
	Joueur addJoueur(Joueur joueur);
	List<Joueur>  addJoueur(List<Joueur>  joueurs);
	
	List<Joueur> findJoueurEquipeById(Long id);
	
	Integer addJoueurToEquipe(Long idJoueur, Long idEquipe);
	
	boolean existsJoueurById(Long id);
}
