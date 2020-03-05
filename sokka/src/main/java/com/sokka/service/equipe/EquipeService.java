package com.sokka.service.equipe;

import java.util.List;

import com.sokka.model.Equipe;

public interface EquipeService {
	
	Equipe findEquipeById(Long id);
	List<Equipe> findAllEquipe();
	Equipe addEquipe(Equipe Equipe);
	List<Equipe> addEquipe(List<Equipe> Equipes);
	
	boolean existsEquipeById(Long id);
	
}
