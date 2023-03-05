package com.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.model.Edificio;

public interface EdificioDaoRepository extends CrudRepository<Edificio, String> {
	
	public List<Edificio> findByNomeEdificioIgnoreCase(String nomeEdificio);
	public List<Edificio> findByCittaIgnoreCase(String citta);
	public List<Edificio> findByIndirizzoContainsIgnoreCase(String indirizzo);

}
