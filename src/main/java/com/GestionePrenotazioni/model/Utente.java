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
@Table(name = "utente")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Utente {
	
	@Id
	private String username;
	@Column(nullable=false)
	private String nomeCompleto;
	@Column(nullable=false)
	private String email;
	
	@OneToMany(mappedBy = "utente")
	private List<Prenotazione> prenotazioni;
	public void addPrenotazione(Prenotazione p) {
		if(prenotazioni==null) prenotazioni=new ArrayList<Prenotazione>();
		prenotazioni.add(p);
	}
	
	public Utente(String username, String nomeCompleto, String email) {
		super();
		this.username = username;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Utente [username=" + username + ", nomeCompleto=" + nomeCompleto + ", email=" + email + "]";
	}

}
