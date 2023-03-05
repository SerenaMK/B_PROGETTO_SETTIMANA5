package com.GestionePrenotazioni.repository;

import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.model.Utente;

public interface UtenteDaoRepository extends CrudRepository<Utente, String> {

}
