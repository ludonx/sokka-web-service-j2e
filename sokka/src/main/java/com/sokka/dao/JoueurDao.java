package com.sokka.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sokka.model.Joueur;

@Repository
public interface JoueurDao extends JpaRepository<Joueur,Long>{
	
	//public Joueur findJoueurByIdString(String id);
	
	@Query(value = "SELECT * FROM joueur WHERE idJoueur IN ( SELECT idJoueur FROM equipe_joueur WHERE idEquipe = ?1 ) ", nativeQuery = true)
	List<Joueur> findJoueurEquipeById_Dao(Long id);
	
	@Modifying
	@Query(value = "INSERT INTO equipe_joueur (idJoueur, idEquipe) values ( :idJoueur , :idEquipe ) ", nativeQuery = true)
	@Transactional
	Integer addJoueurToEquipe_Dao(@Param("idJoueur") Long idJoueur, @Param("idEquipe") Long idEquipe);

}

//public interface JoueurDao extends CrudRepository<Joueur,Long>{
//	
//
//}