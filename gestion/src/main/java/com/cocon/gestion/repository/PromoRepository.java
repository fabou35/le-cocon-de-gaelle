package com.cocon.gestion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cocon.gestion.model.Promo;

@Repository
public interface PromoRepository extends CrudRepository<Promo, Integer>{

}
