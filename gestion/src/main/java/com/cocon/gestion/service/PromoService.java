package com.cocon.gestion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocon.gestion.model.Promo;
import com.cocon.gestion.repository.PromoRepository;

@Service
public class PromoService {

	@Autowired
	private PromoRepository promoRepository;
	
	public Optional<Promo> findPromoById(Integer id){
		return promoRepository.findById(id);
	}
	
	public Iterable<Promo> findAllPromo(){
		return promoRepository.findAll(); 
	}
	
	public Promo savePromo(Promo promo) {
		return promoRepository.save(promo);
	}
	
	public void deletePromo(Promo promo) {
		promoRepository.delete(promo);
	}
}
