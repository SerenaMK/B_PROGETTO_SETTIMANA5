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
		
		// Prova di prenotazione non valida
//		prenotazioneService.insertPrenotazione(prNotValid);
		
		// Get by ID
//		Utente u = utenteService.getUtenteById("mario1");
//		System.out.println(u);
		
		// Get All
//		List<Postazione> lista = postazioneService.getAllPostazioni();
		
		// Get postazione by tipo
//		List<Postazione> lista = postazioneService.getPostazioniByTipo(Tipo.PRIVATO);
		
		// Get postazione by città
//		List<Postazione> lista = postazioneService.getPostazioniByCitta("Roma");
		
		// Get postazione by tipo e città
		List<Postazione> lista = postazioneService.getPostazioniByTipoAndCitta(Tipo.SALARIUNIONI, "Roma");
		
		lista.forEach(p -> System.out.println(p));
		
		

	}

}
