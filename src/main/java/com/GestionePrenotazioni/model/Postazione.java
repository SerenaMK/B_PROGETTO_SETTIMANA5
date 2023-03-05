package com.GestionePrenotazioni.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazione")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Postazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codice;
	@Column(nullable=false)
	private String descrizione;
	@Column(nullable=false)
	private Tipo tipo;
	@Column(nullable=false)
	private int maxOccupanti;
	
	@ManyToOne
	@JoinColumn(name="nomeEdificio")
	private Edificio edificio;
	
	@OneToMany(mappedBy = "postazione")
	private List<Prenotazione> prenotazioni;
	public void addPostazione(Prenotazione p) {
		if(prenotazioni==null) prenotazioni=new ArrayList<Prenotazione>();
		prenotazioni.add(p);
	}
	
	public Postazione(String descrizione, Tipo tipo, int maxOccupanti, Edificio edificio) {
		super();
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.maxOccupanti = maxOccupanti;
		this.edificio = edificio;
	}

	@Override
	public String toString() {
		return "Postazione [codice=" + codice + ", descrizione=" + descrizione + ", tipo=" + tipo + ", maxOccupanti="
				+ maxOccupanti + ", edificio=" + edificio + "]";
	}

}
