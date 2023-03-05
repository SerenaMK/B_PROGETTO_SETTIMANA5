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
		return repo.findByEdificioCitta(s);
	}
	
	public List<Postazione> getPostazioniByTipoAndCitta(Tipo t, String s) {
		return repo.findByTipoAndEdificioCitta(t, s);
	}


}
