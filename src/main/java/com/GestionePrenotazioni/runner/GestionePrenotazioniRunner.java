package com.GestionePrenotazioni.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.model.Edificio;
import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Prenotazione;
import com.GestionePrenotazioni.model.Tipo;
import com.GestionePrenotazioni.model.Utente;
import com.GestionePrenotazioni.service.EdificioService;
import com.GestionePrenotazioni.service.PostazioneService;
import com.GestionePrenotazioni.service.PrenotazioneService;
import com.GestionePrenotazioni.service.UtenteService;

@Component
public class GestionePrenotazioniRunner implements ApplicationRunner {
	
	@Autowired PrenotazioneService prenotazioneService;
	@Autowired PostazioneService postazioneService;
	@Autowired EdificioService edificioService;
	@Autowired UtenteService utenteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("PrenotazioneRunner is running...");
		
		// Creo le istanze
		Edificio e1 = new Edificio("Palazzo Uno", "Via G. Prati 5", "Roma");
		Edificio e2 = new Edificio("Palazzo Due", "Via G. Leopardi 20", "Milano");
		Postazione p1 = new Postazione("Postazione numero uno.", Tipo.SALARIUNIONI, 10, e1);
		Postazione p2 = new Postazione("Postazione numero due.", Tipo.PRIVATO, 5, e1);
		Postazione p3 = new Postazione("Postazione numero tre.", Tipo.OPENSPACE, 20, e2);
		Utente u1 = new Utente("mario1", "Mario Rossi", "mario.rossi@example.com");
		Utente u2 = new Utente("luigi2", "Luigi Verdi", "luigi.verdi@example.com");
		Prenotazione pr1 = new Prenotazione(LocalDate.of(2023, 3, 5), u1, p1);
		Prenotazione pr2 = new Prenotazione(LocalDate.of(2023, 3, 5), u2, p2);
		Prenotazione pr3 = new Prenotazione(LocalDate.of(2023, 3, 4), u2, p3);
		Prenotazione prNotValid = new Prenotazione(LocalDate.of(2023, 3, 6), u1, p2);
		
		// Inserisco le istanze nel DB
//		edificioService.insertEdificio(e1);
//		edificioService.insertEdificio(e2);
//		postazioneService.insertPostazione(p1);
//		postazioneService.insertPostazione(p2);
//		postazioneService.insertPostazione(p3);
//		utenteService.insertUtente(u1);
//		utenteService.insertUtente(u2);
//		prenotazioneService.insertPrenotazione(pr1);
//		prenotazioneService.insertPrenotazione(pr2);
//		prenotazioneService.insertPrenotazione(pr3);
		
		// Esempio di prenotazione non valida
//		prenotazioneService.insertPrenotazione(prNotValid);
		
		// Get utente by ID
//		Utente u = utenteService.getUtenteById("mario1");
//		System.out.println(u);
		
		// Get utenti by nome completo
//		List<Utente> lista = utenteService.getUtentiByNome("Luigi verdi");
		
		// Get utenti by parte del nome
//		List<Utente> lista = utenteService.getUtentiByNomeContaining("MARIO");
		
		// Get utenti by email
//		List<Utente> lista = utenteService.getUtentiByEmail("mario.rossi@example.com");
		
		// Get edifici by name
//		List<Edificio> lista = edificioService.getEdificiByNome("PALAZZO due");
		
		// Get edifici by città
//		List<Edificio> lista = edificioService.getEdificiByCitta("milano");
		
		// Get edifici by parte dell'indirizzo
//		List<Edificio> lista = edificioService.getEdificiByIndirizzoContains("prati");
		
		// Get All postazioni
//		List<Postazione> lista = postazioneService.getAllPostazioni();
		
		// Get postazione by tipo
//		List<Postazione> lista = postazioneService.getPostazioniByTipo(Tipo.PRIVATO);
		
		// Get postazione by città
//		List<Postazione> lista = postazioneService.getPostazioniByCitta("Roma");
		
		// Get postazione by tipo e città
//		List<Postazione> lista = postazioneService.getPostazioniByTipoAndCitta(Tipo.SALARIUNIONI, "roma");
		
		// Get postazione by numero massimo di occupanti
//		List<Postazione> lista = postazioneService.getPostazioniByMaxOccupantiBetween(10, 20);
		
		// Get postazione by nome edificio
//		List<Postazione> lista = postazioneService.getPostazioniByEdificio("Palazzo uno");
		
		// Get postazione by tipo e numero massimo di occupanti
//		List<Postazione> lista = postazioneService.getPostazioniByTipoAndMaxOccupantiBetween(Tipo.OPENSPACE, 15, 30);
		
		// Get all prenotazioni
//		List<Prenotazione> lista = prenotazioneService.getAllPrenotazioni();
		
		// Get prenotazioni by data
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByData(LocalDate.of(2023, 3, 6));
		
		// Get prenotazioni by postazione
//		Postazione postazId2 = postazioneService.getPostazioneById(2l);
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByPostazione(postazId2);
		
		// Get prenotazioni by utente
//		Utente utenteId2 = utenteService.getUtenteById("mario1");
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByUtente(utenteId2);
		
		// Get prenotazioni by username utente
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByUsername("luigi2");
		
		// Get prenotazioni by nome completo utente
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByNomeUtente("mario rossi");
		
		// Get prenotazioni by tipo postazione
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByTipoPostazione(Tipo.PRIVATO);
		
		// Get prenotazioni by edificio
//		Edificio edifUno = edificioService.getEdificioById("Palazzo Due");
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByEdificio(edifUno);
		
		// Get prenotazioni by nome edificio
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByNomeEdificio("palazzo uno");
		
		// Get prenotazioni by citta
//		List<Prenotazione> lista = prenotazioneService.getPrenotazioniByCitta("Milano");
		
		
		// Stampa lista
//		lista.forEach(p -> System.out.println(p));
		

	}

}
