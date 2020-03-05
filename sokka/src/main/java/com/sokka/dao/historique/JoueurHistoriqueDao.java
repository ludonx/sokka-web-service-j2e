package com.sokka.dao.historique;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sokka.model.historique.JoueurHistorique;

@Repository
public interface JoueurHistoriqueDao extends JpaRepository<JoueurHistorique,Long>{
	
}
