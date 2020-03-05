package com.sokka.model.historique;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sokka.model.Joueur;

@Entity
@Table(name = "joueur_historique")
public class JoueurHistorique {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long idJoueur;
	
	private String emailJoueur;
	private String pwdJoueur;
	
	private String idStringJoueur;
	private String pseudoJoueur;
	private String nomJoueur;
	private String prenomJoueur;
	
	private Long scoreEloJoueur;
	private Long scoreFairPlayJoueur;

	private Boolean estSupprime;
	
	private Date dateModification;

	
	public JoueurHistorique() {
		super();
	}

	public JoueurHistorique(Joueur joueur) {
		super();
		this.idJoueur = joueur.getIdJoueur();
		this.emailJoueur = joueur.getEmailJoueur();
		this.pwdJoueur = joueur.getPwdJoueur();
		this.idStringJoueur = joueur.getIdStringJoueur();
		this.pseudoJoueur = joueur.getPseudoJoueur();
		this.nomJoueur = joueur.getNomJoueur();
		this.prenomJoueur = joueur.getPrenomJoueur();
		this.scoreEloJoueur = joueur.getScoreEloJoueur();
		this.scoreFairPlayJoueur = joueur.getScoreFairPlayJoueur();
		this.estSupprime = joueur.getestSupprime();
		this.dateModification = new Date();
	}
	public JoueurHistorique(Long idJoueur, String emailJoueur, String pwdJoueur, String idStringJoueur,
			String pseudoJoueur, String nomJoueur, String prenomJoueur, Long scoreEloJoueur, Long scoreFairPlayJoueur,
			Boolean estSupprime) {
		super();
		this.idJoueur = idJoueur;
		this.emailJoueur = emailJoueur;
		this.pwdJoueur = pwdJoueur;
		this.idStringJoueur = idStringJoueur;
		this.pseudoJoueur = pseudoJoueur;
		this.nomJoueur = nomJoueur;
		this.prenomJoueur = prenomJoueur;
		this.scoreEloJoueur = scoreEloJoueur;
		this.scoreFairPlayJoueur = scoreFairPlayJoueur;
		this.estSupprime = estSupprime;
		this.dateModification = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Boolean getEstSupprime() {
		return estSupprime;
	}

	public void setEstSupprime(Boolean estSupprime) {
		this.estSupprime = estSupprime;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}
	
	
}
