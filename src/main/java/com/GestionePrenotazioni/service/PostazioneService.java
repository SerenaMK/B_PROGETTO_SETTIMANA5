package com.GestionePrenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Tipo;
import com.GestionePrenotazioni.repository.PostazioneDaoRepository;

@Service
public class PostazioneService {
	
	@Autowired
	PostazioneDaoRepository repo;
	
	public void insertPostazione(Postazione p) {
		repo.save(p);
		System.out.println("postazione added");
	}
	
	public Postazione getPostazioneById(Long id) {
		return repo.findById(id).get();
	}
	
	public void updatePostazione(Postazione p) {
		repo.save(p);
		System.out.println("postazione updated");
	}
	
	public void removePostazione(Postazione p) {
		repo.delete(p);
		System.out.println("postazione deleted");
	}
	
	public List<Postazione> getAllPostazioni() {
		return (List<Postazione>) repo.findAll();
	}
	
	public List<Postazione> getPostazioniByTipo(Tipo t) {
		return repo.findByTipo(t);
	}
	
	public List<Postazione> getPostazioniByCitta(String s) {
		return repo.findByEdificioCittaIgnoreCase(s);
	}
	
	public List<Postazione> getPostazioniByTipoAndCitta(Tipo t, String s) {
		return repo.findByTipoAndEdificioCittaIgnoreCase(t, s);
	}
	
	public List<Postazione> getPostazioniByMaxOccupantiBetween(int min, int max) {
		return repo.findByMaxOccupantiBetween(min, max);
	}
	
	public List<Postazione> getPostazioniByEdificio(String s) {
		return repo.findByEdificioNomeEdificioIgnoreCase(s);
	}
	
	public List<Postazione> getPostazioniByTipoAndMaxOccupantiBetween(Tipo t, int min, int max) {
		return repo.findByTipoAndMaxOccupantiBetween(t, min, max);
	}


}
