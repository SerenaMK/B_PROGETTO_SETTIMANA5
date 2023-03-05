package com.GestionePrenotazioni.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "edificio")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Edificio {
	
	@Id
	private String nomeEdificio;
	@Column(nullable=false)
	private String indirizzo;
	@Column(nullable=false)
	private String citta;
	
	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postazioni;
	public void addPostazione(Postazione p) {
		if(postazioni==null) postazioni=new ArrayList<Postazione>();
		postazioni.add(p);
	}
	
	public Edificio(String nome_edificio, String indirizzo, String citta) {
		super();
		this.nomeEdificio = nome_edificio;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}

	@Override
	public String toString() {
		return "Edificio [nome_edificio=" + nomeEdificio + ", indirizzo=" + indirizzo + ", citta=" + citta + "]";
	}
	
	

}
