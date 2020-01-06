package com.sokka.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "actions") // because action may be a key word in mysql
public class Action {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAction;
	private String nomAction;
	
	@OneToMany(mappedBy = "idAction", cascade = CascadeType.ALL)
    private Set<TempsFort> tempsFort;
	
	public Long getIdAction() {
		return idAction;
	}
	public void setIdAction(Long idAction) {
		this.idAction = idAction;
	}
	public String getNomAction() {
		return nomAction;
	}
	public void setNomAction(String nomAction) {
		this.nomAction = nomAction;
	}
	
	

}
