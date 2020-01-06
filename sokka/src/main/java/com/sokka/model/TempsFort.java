package com.sokka.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tempsfort")
public class TempsFort implements Serializable{
	 private static final long serialVersionUID = 1L;
	 
	@Id
    @ManyToOne
    @JoinColumn(name = "idJoueur")
	private Joueur idJoueur;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "idMatch")
	/*@JoinColumns({
		  @JoinColumn(name = "idMatch"),
		  @JoinColumn(name = "equipeDomicile"),
		  @JoinColumn(name = "equipeExterieur"),
		  @JoinColumn(name = "meilleurJoueur"),
		  @JoinColumn(name = "terrain")
	})*/
	private Match idMatch;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "idAction")
	private Action idAction;
	
	private Long minute;

	public Long getMinute() {
		return minute;
	}

	public void setMinute(Long minute) {
		this.minute = minute;
	}
	
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TempsFort)) return false;
        TempsFort that = (TempsFort) o;
        return Objects.equals(idJoueur.getIdJoueur(), that.idJoueur.getIdJoueur()) &&
        		Objects.equals(idMatch.getIdMatch(), that.idMatch.getIdMatch()) &&
                Objects.equals(idAction.getIdAction(), that.idAction.getIdAction()) &&
                Objects.equals(minute, that.minute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJoueur.getIdJoueur(), idMatch.getIdMatch(), idAction.getIdAction(), minute);
    }
	
	

}
