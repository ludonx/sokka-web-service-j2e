package com.sokka.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sokka.model.Joueur;

@Repository
public interface JoueurDao extends JpaRepository<Joueur,Long>{
	
	//public Joueur findJoueurByIdString(String id);
	
	@Query(value = "SELECT * FROM joueur WHERE idJoueur IN ( SELECT idJoueur FROM equipe_joueur WHERE idEquipe = ?1 ) ", nativeQuery = true)
	List<Joueur> findJoueurEquipeByID_Dao(Long id);
	
	@Modifying
	@Query(value = "INSERT INTO equipe_joueur values ( 1, 1 ) ", nativeQuery = true)
	List<Joueur> addJoueurToEquipe_Dao(Long idJoueur, Long idEquipe);

}

//public interface JoueurDao extends CrudRepository<Joueur,Long>{
//	
//
//}