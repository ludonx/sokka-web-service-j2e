package com.sokka;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sokka.model.Joueur;
import com.sokka.service.joueur.JoueurService;

@SpringBootApplication
public class SokkaApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(SokkaApplication.class, args);
	}
//	@Autowired
//	private JoueurService joueurService;
//	public void run(String... args) {
//        // Create a couple of data 
//		Long scoreEloJoueur = (long) 1500;
//		Long scoreFairPlayJoueur = (long) 1000;
//		
//		Joueur j1 = new Joueur(
//				"joueur1@sokka.fr","pwd1","springBoot",
//				"pseudo1","joueur1","prenom1",
//				scoreEloJoueur,scoreFairPlayJoueur,
//				new Date(),null,false);
//		
//		joueurService.addJoueur(j1);
//    }

}
