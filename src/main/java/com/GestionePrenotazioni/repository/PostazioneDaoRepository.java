package com.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Prenotazione;
import com.GestionePrenotazioni.model.Tipo;

public interface PostazioneDaoRepository extends CrudRepository<Postazione, Long> {
	
	public List<Prenotazione> findByTipo(Tipo tipo);

}
