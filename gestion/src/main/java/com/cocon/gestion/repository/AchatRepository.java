package com.cocon.gestion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cocon.gestion.model.Achat;

@Repository
public interface AchatRepository extends CrudRepository<Achat, Integer>{

}
