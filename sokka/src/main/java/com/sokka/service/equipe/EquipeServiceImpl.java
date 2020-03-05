package com.sokka.service.equipe;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sokka.dao.EquipeDao;
import com.sokka.model.Equipe;

@Service
public class EquipeServiceImpl implements  EquipeService {

	
	
	private final EquipeDao equipeDao;
	
	
	public EquipeServiceImpl(EquipeDao equipeDao) {
		super();
		this.equipeDao = equipeDao;
	}

	@Override
	public Equipe findEquipeById(Long id) {
		return equipeDao.findById(id).get();
	}

	@Override
	public List<Equipe> findAllEquipe() {
		return equipeDao.findAll();
	}

	@Override
	public Equipe addEquipe(Equipe Equipe) {
		return equipeDao.save(Equipe);
	}

	@Override
	public List<Equipe> addEquipe(List<Equipe> Equipes) {
		return equipeDao.saveAll(Equipes);
	}

	@Override
	public boolean existsEquipeById(Long id) {
		return equipeDao.existsById(id);
	}


	

}
