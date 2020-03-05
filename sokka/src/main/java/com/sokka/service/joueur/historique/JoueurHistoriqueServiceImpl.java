package com.sokka.service.joueur.historique;

import org.springframework.stereotype.Service;

import com.sokka.dao.historique.JoueurHistoriqueDao;
import com.sokka.model.historique.JoueurHistorique;


@Service
public class JoueurHistoriqueServiceImpl implements JoueurHistoriqueService{

	private final JoueurHistoriqueDao joueurHistoriqueDao;
	
	

	
	public JoueurHistoriqueServiceImpl(JoueurHistoriqueDao joueurHistoriqueDao) {
		super();
		this.joueurHistoriqueDao = joueurHistoriqueDao;
	}




	@Override
	public JoueurHistorique addJoueurHistorique(JoueurHistorique joueurHistorique) {
		return joueurHistoriqueDao.save(joueurHistorique);
	}

}
