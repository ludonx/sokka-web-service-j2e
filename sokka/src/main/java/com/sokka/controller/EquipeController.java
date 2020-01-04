package com.sokka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sokka.model.Equipe;
import com.sokka.service.equipe.EquipeService;

@RestController
@RequestMapping(path = EquipeController.BASE_URL )
public class EquipeController {
	
	public static final String BASE_URL = "/sokka/api/v1/services/equipe";
	public static final String PathGetAllEquipes = "/all";
	public static final String PathGetEquipeByID = "/{id}";
	public static final String PathAddEquipe = "/add";
	
	
	@Autowired
	private EquipeService equipeService;

	public EquipeController(EquipeService equipeService) {
		super();
		this.equipeService = equipeService;
	}
	
	@GetMapping(path=EquipeController.PathGetAllEquipes)
	public List<Equipe> getAllEquipe(){
		return equipeService.findAllEquipe();
	}
	
	@GetMapping(path=EquipeController.PathGetEquipeByID)
	public Equipe getEquipeById(@PathVariable Long id){
		return equipeService.findEquipeById(id);
	}
	
	@PostMapping(path=EquipeController.PathAddEquipe)
	@ResponseStatus(HttpStatus.CREATED)
	public Equipe addEquipe(@RequestBody Equipe Equipe) {
		return equipeService.addEquipe(Equipe);
		
	}
	

}
