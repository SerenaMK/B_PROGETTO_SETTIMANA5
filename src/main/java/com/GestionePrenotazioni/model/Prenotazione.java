package com.GestionePrenotazioni.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prenotazione", uniqueConstraints={
		@UniqueConstraint(columnNames = {"data", "username"})
})
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name="username")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name="postazione")
	private Postazione postazione;

	public Prenotazione(LocalDate data, Utente utente, Postazione postazione) {
		super();
		this.data = data;
		this.utente = utente;
		this.postazione = postazione;
	}
	
	

}
