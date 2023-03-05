package com.GestionePrenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.model.Edificio;
import com.GestionePrenotazioni.repository.EdificioDaoRepository;

@Service
public class EdificioService {
	
	@Autowired
	EdificioDaoRepository repo;
	
	public void insertEdificio(Edificio e) {
		repo.save(e);
		System.out.println("edificio added");
	}
	
	public Edificio getEdificioById(String id) {
		return repo.findById(id).get();
	}
	
	public void updateEdificio(Edificio e) {
		repo.save(e);
		System.out.println("edificio updated");
	}
	
	public void removeEdificio(Edificio e) {
		repo.delete(e);
		System.out.println("edificio deleted");
	}
	
	public List<Edificio> getAllEdifici() {
		return (List<Edificio>) repo.findAll();
	}

}
