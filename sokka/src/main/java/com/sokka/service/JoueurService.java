package com.sokka.service;

import java.util.List;

import com.sokka.model.Joueur;

public interface JoueurService {
	
	Joueur findJoueurById(Long id);
	List<Joueur> findAllJoueur();
	Joueur addJoueur(Joueur joueur);

}
