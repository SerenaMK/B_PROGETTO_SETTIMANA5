package com.GestionePrenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.model.Prenotazione;
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

}
