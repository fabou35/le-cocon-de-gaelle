package com.cocon.gestion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocon.gestion.model.Vente;
import com.cocon.gestion.repository.VenteRepository;

@Service
public class VenteService {
	
	@Autowired
	private VenteRepository venteRepository;
	
	public Optional<Vente> findVenteById(Integer id){
		return venteRepository.findById(id);
	}
	
	public Iterable<Vente> findAllVente(){
		return venteRepository.findAll();
	}
	
	public Vente saveVente(Vente vente) {
		return venteRepository.save(vente);
	}
	
	public void deleteVente(Vente vente) {
		venteRepository.delete(vente);
	}
}
