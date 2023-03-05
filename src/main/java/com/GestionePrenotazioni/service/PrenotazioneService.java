package com.GestionePrenotazioni.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.model.Edificio;
import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Prenotazione;
import com.GestionePrenotazioni.model.Tipo;
import com.GestionePrenotazioni.model.Utente;
import com.GestionePrenotazioni.repository.PrenotazioneDaoRepository;

@Service
public class PrenotazioneService {
	
	@Autowired
	PrenotazioneDaoRepository repo;
	
	public void insertPrenotazione(Prenotazione p) {
		repo.save(p);
		System.out.println("prenotazione added");
	}
	
	public Prenotazione getPrenotazioneById(Long id) {
		return repo.findById(id).get();
	}
	
	public void updatePrenotazione(Prenotazione p) {
		repo.save(p);
		System.out.println("prenotazione updated");
	}
	
	public void removePrenotazione(Prenotazione p) {
		repo.delete(p);
		System.out.println("prenotazione deleted");
	}
	
	public List<Prenotazione> getAllPrenotazioni() {
		return (List<Prenotazione>) repo.findAll();
	}
	
	public List<Prenotazione> getPrenotazioniByData(LocalDate data) {
		return repo.findByData(data);
	}
	
	public List<Prenotazione> getPrenotazioniByPostazione(Postazione p) {
		return repo.findByPostazione(p);
	}
	
	public List<Prenotazione> getPrenotazioniByUtente(Utente u) {
		return repo.findByUtente(u);
	}
	
	public List<Prenotazione> getPrenotazioniByUsername(String s) {
		return repo.findByUtenteUsername(s);
	}
	
	public List<Prenotazione> getPrenotazioniByNomeUtente(String s) {
		return repo.findByUtenteNomeCompletoIgnoreCase(s);
	}
	
	public List<Prenotazione> getPrenotazioniByTipoPostazione(Tipo t) {
		return repo.findByPostazioneTipo(t);
	}
	
	public List<Prenotazione> getPrenotazioniByEdificio(Edificio e) {
		return repo.findByPostazioneEdificio(e);
	}
	
	public List<Prenotazione> getPrenotazioniByNomeEdificio(String s) {
		return repo.findByPostazioneEdificioNomeEdificioIgnoreCase(s);
	}
	
	public List<Prenotazione> getPrenotazioniByCitta(String s) {
		return repo.findByPostazioneEdificioCittaIgnoreCase(s);
	}
	

}
