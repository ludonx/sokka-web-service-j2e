package com.sokka.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "equipe")
public class Equipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEquipe;
	private String idStringEquipe;
	private String nomEquipe;
	private Boolean estDispoPourMatch;

	private Boolean estSupprime;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
    joinColumns = { @JoinColumn(name = "idEquipe") },
    inverseJoinColumns = { @JoinColumn(name = "idJoueur") })
	private Set<Joueur> joueurs = new HashSet<>();
	
	@OneToMany(mappedBy = "idEquipe", cascade = CascadeType.ALL)
    private Set<EquipeCategorie> equipeCategorie;
	
	@OneToMany(mappedBy = "equipeDomicile", cascade = CascadeType.ALL)
    private Set<Match> matchEquipeDomicile;
	
	@OneToMany(mappedBy = "equipeExterieur", cascade = CascadeType.ALL)
    private Set<Match> matchEquipeExterieur;

	public void addJoueur(Joueur joueur) {
		joueurs.add(joueur);
	}
	

	public Long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getIdStringEquipe() {
		return idStringEquipe;
	}
	public void setIdStringEquipe(String idStringEquipe) {
		this.idStringEquipe = idStringEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public Boolean getEstDispoPourMatch() {
		return estDispoPourMatch;
	}
	public void setEstDispoPourMatch(Boolean estDispoPourMatch) {
		this.estDispoPourMatch = estDispoPourMatch;
	}

	public Boolean getestSupprime() {
		return estSupprime;
	}
	public void setestSupprime(Boolean estSupprime) {
		this.estSupprime = estSupprime;
	}


	public Set<Joueur> getJoueurs() {
		return joueurs;
	}


	public void setJoueurs(Set<Joueur> joueurs) {
		this.joueurs = joueurs;
	}


	public Set<EquipeCategorie> getEquipeCategorie() {
		return equipeCategorie;
	}


	public void setEquipeCategorie(Set<EquipeCategorie> equipeCategorie) {
		this.equipeCategorie = equipeCategorie;
	}
	
	

}
