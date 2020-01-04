package com.sokka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sokka.model.Equipe;

@Repository
public interface EquipeDao extends JpaRepository<Equipe,Long>{

}
