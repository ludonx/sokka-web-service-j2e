package com.sokka.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "joueur")
public class Joueur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name ="idJoueur")
	private Long idJoueur;
	
	private String emailJoueur;
	private String pwdJoueur;
	
	private String idStringJoueur;
	private String pseudoJoueur;
	private String nomJoueur;
	private String prenomJoueur;
	
	private Long scoreEloJoueur;
	private Long scoreFairPlayJoueur;

	private Date dateDebutJoueur;
	private Date dateFinJoueur;
	private Boolean estSupprimer;
	
	
	@ManyToMany(mappedBy = "joueurs")
	private Set<Equipe> equipes = new HashSet<>();
	
	
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joueur(String emailJoueur, String pwdJoueur, String idStringJoueur, String pseudoJoueur, String nomJoueur,
			String prenomJoueur, Long scoreEloJoueur, Long scoreFairPlayJoueur, Date dateDebutJoueur,
			Date dateFinJoueur, Boolean estSupprimer) {
		super();
		this.emailJoueur = emailJoueur;
		this.pwdJoueur = pwdJoueur;
		this.idStringJoueur = idStringJoueur;
		this.pseudoJoueur = pseudoJoueur;
		this.nomJoueur = nomJoueur;
		this.prenomJoueur = prenomJoueur;
		this.scoreEloJoueur = scoreEloJoueur;
		this.scoreFairPlayJoueur = scoreFairPlayJoueur;
		this.dateDebutJoueur = dateDebutJoueur;
		this.dateFinJoueur = dateFinJoueur;
		this.estSupprimer = estSupprimer;
	}
	
	public Long getIdJoueur() {
		return idJoueur;
	}
	public void setIdJoueur(Long idJoueur) {
		this.idJoueur = idJoueur;
	}
	
	public String getEmailJoueur() {
		return emailJoueur;
	}
	public void setEmailJoueur(String emailJoueur) {
		this.emailJoueur = emailJoueur;
	}
	
	public String getPwdJoueur() {
		return pwdJoueur;
	}
	public void setPwdJoueur(String pwdJoueur) {
		this.pwdJoueur = pwdJoueur;
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
