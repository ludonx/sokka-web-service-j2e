package com.sokka.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "joueurs")
public class Joueur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name ="idJoueur")
	private Long idJoueur;
	private String idStringJoueur;
	private String pseudoJoueur;
	private String nomJoueur;
	private String prenomJoueur;
	private Long scoreEloJoueur;
	private Long scoreFairPlayJoueur;

	private Date dateDebutJoueur;
	private Date dateFinJoueur;
	private Boolean estSupprimer;
	
	public Long getIdJoueur() {
		return idJoueur;
	}
	public void setIdJoueur(Long idJoueur) {
		this.idJoueur = idJoueur;
	}
	public String getIdStringJoueur() {
		return idStringJoueur;
	}
	public void setIdStringJoueur(String idStringJoueur) {
		this.idStringJoueur = idStringJoueur;
	}
	public String getPseudoJoueur() {
		return pseudoJoueur;
	}
	public void setPseudoJoueur(String pseudoJoueur) {
		this.pseudoJoueur = pseudoJoueur;
	}
	public String getNomJoueur() {
		return nomJoueur;
	}
	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}
	public String getPrenomJoueur() {
		return prenomJoueur;
	}
	public void setPrenomJoueur(String prenomJoueur) {
		this.prenomJoueur = prenomJoueur;
	}
	public Long getScoreEloJoueur() {
		return scoreEloJoueur;
	}
	public void setScoreEloJoueur(Long scoreEloJoueur) {
		this.scoreEloJoueur = scoreEloJoueur;
	}
	public Long getScoreFairPlayJoueur() {
		return scoreFairPlayJoueur;
	}
	public void setScoreFairPlayJoueur(Long scoreFairPlayJoueur) {
		this.scoreFairPlayJoueur = scoreFairPlayJoueur;
	}
	public Date getDateDebutJoueur() {
		return dateDebutJoueur;
	}
	public void setDateDebutJoueur(Date dateDebutJoueur) {
		this.dateDebutJoueur = dateDebutJoueur;
	}
	public Date getDateFinJoueur() {
		return dateFinJoueur;
	}
	public void setDateFinJoueur(Date dateFinJoueur) {
		this.dateFinJoueur = dateFinJoueur;
	}
	public Boolean getEstSupprimer() {
		return estSupprimer;
	}
	public void setEstSupprimer(Boolean estSupprimer) {
		this.estSupprimer = estSupprimer;
	}
	
	
	
	
	
}
