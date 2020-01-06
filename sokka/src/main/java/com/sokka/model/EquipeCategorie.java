package com.sokka.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipe_categorie")
public class EquipeCategorie implements Serializable {
	 private static final long serialVersionUID = 1L;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "idCategorie")
	private Categorie idCategorie;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "idEquipe")
	private Equipe idEquipe;
	
	
	private Long ScoreEloEquipe;
	private Long ScroreFairPlayEquipe;
	
	
	public Long getScoreEloEquipe() {
		return ScoreEloEquipe;
	}
	public void setScoreEloEquipe(Long scoreEloEquipe) {
		ScoreEloEquipe = scoreEloEquipe;
	}
	public Long getScroreFairPlayEquipe() {
		return ScroreFairPlayEquipe;
	}
	public void setScroreFairPlayEquipe(Long scroreFairPlayEquipe) {
		ScroreFairPlayEquipe = scroreFairPlayEquipe;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EquipeCategorie)) return false;
        EquipeCategorie that = (EquipeCategorie) o;
        return Objects.equals(idEquipe.getIdEquipe(), that.idEquipe.getIdEquipe()) &&
                Objects.equals(idCategorie.getIdCategorie(), that.idCategorie.getIdCategorie()) &&
                Objects.equals(ScoreEloEquipe, that.ScoreEloEquipe)&&
                Objects.equals(ScroreFairPlayEquipe, that.ScroreFairPlayEquipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipe.getIdEquipe(), idCategorie.getIdCategorie(), ScoreEloEquipe,ScroreFairPlayEquipe);
    }
	
	

}
