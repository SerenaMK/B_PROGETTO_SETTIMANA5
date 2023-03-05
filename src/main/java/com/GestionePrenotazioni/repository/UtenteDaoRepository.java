package com.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.model.Utente;

public interface UtenteDaoRepository extends CrudRepository<Utente, String> {
	
	public List<Utente> findByNomeCompletoIgnoreCase(String nomeCompleto);
	public List<Utente> findByEmail(String email);
	public List<Utente> findByNomeCompletoContainingIgnoreCase(String nome);

}
