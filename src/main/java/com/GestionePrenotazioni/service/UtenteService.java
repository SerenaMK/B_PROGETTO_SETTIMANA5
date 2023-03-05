package com.GestionePrenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.model.Utente;
import com.GestionePrenotazioni.repository.UtenteDaoRepository;

@Service
public class UtenteService {
	
	@Autowired
	UtenteDaoRepository repo;
	
	public void insertUtente(Utente u) {
		repo.save(u);
		System.out.println("utente added");
	}
	
	public Utente getUtenteById(String id) {
		return repo.findById(id).get();
	}
	
	public void updateUtente(Utente u) {
		repo.save(u);
		System.out.println("utente updated");
	}
	
	public void removeUtente(Utente u) {
		repo.delete(u);
		System.out.println("utente deleted");
	}
	
	public List<Utente> getAllUtenti() {
		return (List<Utente>) repo.findAll();
	}
	
	public List<Utente> getUtentiByNome(String s) {
		return repo.findByNomeCompletoIgnoreCase(s);
	}
	
	public List<Utente> getUtentiByEmail(String s) {
		return repo.findByEmail(s);
	}
	
	public List<Utente> getUtentiByNomeContaining(String s) {
		return repo.findByNomeCompletoContainingIgnoreCase(s);
	}

}
