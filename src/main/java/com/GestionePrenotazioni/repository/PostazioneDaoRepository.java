package com.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.model.Postazione;
import com.GestionePrenotazioni.model.Tipo;

public interface PostazioneDaoRepository extends CrudRepository<Postazione, Long> {
	
	public List<Postazione> findByTipo(Tipo tipo);
	public List<Postazione> findByEdificioCittaIgnoreCase(String citta);
	public List<Postazione> findByTipoAndEdificioCittaIgnoreCase(Tipo tipo, String citta);
	public List<Postazione> findByMaxOccupantiBetween(int min, int max);
	public List<Postazione> findByEdificioNomeEdificioIgnoreCase(String nome_edificio);
	public List<Postazione> findByTipoAndMaxOccupantiBetween(Tipo tipo, int min, int max);

}
