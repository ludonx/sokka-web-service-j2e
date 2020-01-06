package com.sokka.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "matchs") // because match may be a key word in mysql
public class Match implements Serializable{
	 private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMatch;

	private String nomMatch;
	private Long dureeMatch;
	private Long typeMatch;
	private Long dateMatch;
	private Long nombreButEquipeA;
	private Long nombreButEquipeB;
	
	//@Id because we can have the same values (same equipeA vs equipeB ...)
    @ManyToOne
    @JoinColumn(name = "idEquipeDomicile")
	private Equipe equipeDomicile;
	//@Id
    @ManyToOne
    @JoinColumn(name = "idEquipeExterieur")
	private Equipe equipeExterieur;
	//@Id
    @ManyToOne
    @JoinColumn(name = "idMeilleurJoueur")
	private Joueur meilleurJoueur;
	//@Id
    @ManyToOne
    @JoinColumn(name = "idTerrain")
	private Terrain terrain;
	
	@OneToMany(mappedBy = "idMatch", cascade = CascadeType.ALL)
    private Set<TempsFort> tempsFort;

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Match)) return false;
        Match that = (Match) o;
        return Objects.equals(equipeDomicile.getIdEquipe(), that.equipeDomicile.getIdEquipe()) &&
        		Objects.equals(equipeExterieur.getIdEquipe(), that.equipeExterieur.getIdEquipe()) &&
        		Objects.equals(meilleurJoueur.getIdJoueur(), that.meilleurJoueur.getIdJoueur()) &&
        		Objects.equals(terrain.getIdTerrain(), that.terrain.getIdTerrain()) &&
                Objects.equals(idMatch, that.idMatch)&&
                Objects.equals(nomMatch, that.nomMatch)&&
                Objects.equals(dureeMatch, that.dureeMatch)&&
                Objects.equals(typeMatch, that.typeMatch)&&
                Objects.equals(dateMatch, that.dateMatch)&&
                Objects.equals(nombreButEquipeA, that.nombreButEquipeA)&&
                Objects.equals(nombreButEquipeB, that.nombreButEquipeB);
                //Objects.equals(tempsFort, that.tempsFort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipeDomicile.getIdEquipe(),
        		equipeExterieur.getIdEquipe(),
        		meilleurJoueur.getIdJoueur(),
        		terrain.getIdTerrain(),
        		idMatch,nomMatch,dureeMatch,typeMatch,dateMatch,nombreButEquipeA,nombreButEquipeB);
    }
	
	
	
	
	public Long getIdMatch() {
		return idMatch;
	}
	public void setIdMatch(Long idMatch) {
		this.idMatch = idMatch;
	}
	public String getNomMatch() {
		return nomMatch;
	}
	public void setNomMatch(String nomMatch) {
		this.nomMatch = nomMatch;
	}
	public Long getDureeMatch() {
		return dureeMatch;
	}
	public void setDureeMatch(Long dureeMatch) {
		this.dureeMatch = dureeMatch;
	}
	public Long getTypeMatch() {
		return typeMatch;
	}
	public void setTypeMatch(Long typeMatch) {
		this.typeMatch = typeMatch;
	}
	public Long getDateMatch() {
		return dateMatch;
	}
	public void setDateMatch(Long dateMatch) {
		this.dateMatch = dateMatch;
	}
	public Long getNombreButEquipeA() {
		return nombreButEquipeA;
	}
	public void setNombreButEquipeA(Long nombreButEquipeA) {
		this.nombreButEquipeA = nombreButEquipeA;
	}
	public Long getNombreButEquipeB() {
		return nombreButEquipeB;
	}
	public void setNombreButEquipeB(Long nombreButEquipeB) {
		this.nombreButEquipeB = nombreButEquipeB;
	}
	
	
	
	

}
