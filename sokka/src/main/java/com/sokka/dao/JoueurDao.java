package com.sokka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sokka.model.Joueur;

public interface JoueurDao extends JpaRepository<Joueur,Long>{
	
	//public Joueur findJoueurByIdString(String id);

}

//public interface JoueurDao extends CrudRepository<Joueur,Long>{
//	
//
//}