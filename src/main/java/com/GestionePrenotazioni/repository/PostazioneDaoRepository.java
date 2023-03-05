package com.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Tipo;

public interface PostazioneDaoRepository extends CrudRepository<Postazione, Long> {
	
	public List<Postazione> findByTipo(Tipo tipo);
//	@Query(value = "SELECT * FROM postazione INNER JOIN edificio on postazione.nome_edificio = edificio.nome_edificio")
	public List<Postazione> findByEdificioCitta(String citta);
	public List<Postazione> findByTipoAndEdificioCitta(Tipo tipo, String citta);

}
