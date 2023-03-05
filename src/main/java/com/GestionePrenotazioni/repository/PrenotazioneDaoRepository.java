package com.GestionePrenotazioni.repository;

import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.model.Prenotazione;

public interface PrenotazioneDaoRepository extends CrudRepository<Prenotazione, Long> {
	
//	@Query(value = "SELECT * FROM prenotazione INNER JOIN postazione on prenotazione.postazione = postazione.codice WHERE postazione.tipo = :tipo")
//	public List<Prenotazione> findByTipo(Tipo tipo);
//	public List<Prenotazione> findByCitta(String citta);
//	public List<Prenotazione> findByTipoAndCitta(Tipo tipo, String citta);

}
