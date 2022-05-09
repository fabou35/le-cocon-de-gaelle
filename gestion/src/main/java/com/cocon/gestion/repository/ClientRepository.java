package com.cocon.gestion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cocon.gestion.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{

}
