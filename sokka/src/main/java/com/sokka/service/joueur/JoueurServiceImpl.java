package com.sokka.service.joueur;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sokka.dao.JoueurDao;
import com.sokka.model.Joueur;


@Service
public class JoueurServiceImpl implements JoueurService{
	
	private final JoueurDao joueurDao;
	
	public JoueurServiceImpl(JoueurDao joueurDao) {
		super();
		this.joueurDao = joueurDao;
	}

	@Override
	public Joueur findJoueurById(Long id) {
		
		return joueurDao.findById(id).get();
	}
	 
	@Override
	public List<Joueur> findAllJoueur(){
		return joueurDao.findAll();
		//return (List<Joueur> )joueurDao.findAll(); -> if CrudRepository
	}

	@Override
	public Joueur addJoueur(Joueur joueur) {
		return joueurDao.save(joueur);
	}
	
	@Override
	public List<Joueur> findJoueurEquipeById(Long id) {
		//List<Joueur> joueurs = joueurDao.findJoueurEquipeByID_Dao(id);
		return joueurDao.findJoueurEquipeById_Dao(id);
	}

	@Override
	public Integer addJoueurToEquipe(Long idJoueur, Long idEquipe) {
		
		return joueurDao.addJoueurToEquipe_Dao(idJoueur,idEquipe);
	}

}
