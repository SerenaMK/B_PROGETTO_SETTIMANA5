package com.GestionePrenotazioni.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.model.Edificio;
import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Prenotazione;
import com.GestionePrenotazioni.model.Tipo;
import com.GestionePrenotazioni.model.Utente;

public interface PrenotazioneDaoRepository extends CrudRepository<Prenotazione, Long> {
	
	public List<Prenotazione> findByData(LocalDate data);
	public List<Prenotazione> findByPostazione(Postazione postazione);
	public List<Prenotazione> findByUtente(Utente utente);
	public List<Prenotazione> findByUtenteUsername(String username);
	public List<Prenotazione> findByUtenteNomeCompletoIgnoreCase(String nomeCompleto);
	public List<Prenotazione> findByPostazioneTipo(Tipo tipo);
	public List<Prenotazione> findByPostazioneEdificio(Edificio edificio);
	public List<Prenotazione> findByPostazioneEdificioNomeEdificioIgnoreCase(String nomeEdificio);
	public List<Prenotazione> findByPostazioneEdificioCittaIgnoreCase(String citta);

}
