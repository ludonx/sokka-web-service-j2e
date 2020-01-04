package com.sokka.service.joueur;

import java.util.List;

import com.sokka.model.Joueur;

public interface JoueurService {
	
	Joueur findJoueurById(Long id);
	List<Joueur> findAllJoueur();
	Joueur addJoueur(Joueur joueur);
	
	List<Joueur> findAllJoueurEquipeById(Long id);

}
