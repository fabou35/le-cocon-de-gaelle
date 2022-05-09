package com.cocon.gestion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cocon.gestion.model.Vente;

@Repository
public interface VenteRepository extends CrudRepository<Vente, Integer>{

}
