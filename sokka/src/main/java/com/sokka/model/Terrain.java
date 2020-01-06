package com.sokka.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "terrain")
public class Terrain {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTerrain;
	
	private String nomTerrain;
	
	private String numeroDeVoie;
	private String libelle;
	private Long ville;
	private Long codePostal;
	private String autreInfo;
	
	private String typeTerrain;
	private Long dimensionLongueur; 
	private Long dimensionLargeur; 
	
	private Date dateDebutTerrain;
	private Date dateFinTerrain;
	private Boolean estSupprimer;
	
	@OneToMany(mappedBy = "terrain", cascade = CascadeType.ALL)
    private Set<Match> match;
	
	public Long getIdTerrain() {
		return idTerrain;
	}
	public void setIdTerrain(Long idTerrain) {
		this.idTerrain = idTerrain;
	}
	public String getNomTerrain() {
		return nomTerrain;
	}
	public void setNomTerrain(String nomTerrain) {
		this.nomTerrain = nomTerrain;
	}
	public String getNumeroDeVoie() {
		return numeroDeVoie;
	}
	public void setNumeroDeVoie(String numeroDeVoie) {
		this.numeroDeVoie = numeroDeVoie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Long getVille() {
		return ville;
	}
	public void setVille(Long ville) {
		this.ville = ville;
	}
	public Long getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(Long codePostal) {
		this.codePostal = codePostal;
	}
	public String getAutreInfo() {
		return autreInfo;
	}
	public void setAutreInfo(String autreInfo) {
		this.autreInfo = autreInfo;
	}
	public String getTypeTerrain() {
		return typeTerrain;
	}
	public void setTypeTerrain(String typeTerrain) {
		this.typeTerrain = typeTerrain;
	}
	public Long getDimensionLongueur() {
		return dimensionLongueur;
	}
	public void setDimensionLongueur(Long dimensionLongueur) {
		this.dimensionLongueur = dimensionLongueur;
	}
	public Long getDimensionLargeur() {
		return dimensionLargeur;
	}
	public void setDimensionLargeur(Long dimensionLargeur) {
		this.dimensionLargeur = dimensionLargeur;
	}
	public Date getDateDebutTerrain() {
		return dateDebutTerrain;
	}
	public void setDateDebutTerrain(Date dateDebutTerrain) {
		this.dateDebutTerrain = dateDebutTerrain;
	}
	public Date getDateFinTerrain() {
		return dateFinTerrain;
	}
	public void setDateFinTerrain(Date dateFinTerrain) {
		this.dateFinTerrain = dateFinTerrain;
	}
	public Boolean getEstSupprimer() {
		return estSupprimer;
	}
	public void setEstSupprimer(Boolean estSupprimer) {
		this.estSupprimer = estSupprimer;
	}
	
	
	

}
