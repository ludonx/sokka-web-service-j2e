package com.sokka.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "equipes")
public class Equipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idEquipe;
	private String idStringEquipe;
	private String nomEquipe;
	private Boolean estDispoPourMatch;

	private Date dateDebutEquipe;
	private Date dateFinEquipe;
	private Boolean estSupprimer;
	
	
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
	public Date getDateDebutEquipe() {
		return dateDebutEquipe;
	}
	public void setDateDebutEquipe(Date dateDebutEquipe) {
		this.dateDebutEquipe = dateDebutEquipe;
	}
	public Date getDateFinEquipe() {
		return dateFinEquipe;
	}
	public void setDateFinEquipe(Date dateFinEquipe) {
		this.dateFinEquipe = dateFinEquipe;
	}
	public Boolean getEstSupprimer() {
		return estSupprimer;
	}
	public void setEstSupprimer(Boolean estSupprimer) {
		this.estSupprimer = estSupprimer;
	}
	
	

}
