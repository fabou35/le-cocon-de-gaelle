package com.cocon.gestion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocon.gestion.model.Achat;
import com.cocon.gestion.repository.AchatRepository;

@Service
public class AchatService {

	@Autowired
	private AchatRepository achatRepository;
	
	public Optional<Achat> findAchatById(Integer id) {
		return achatRepository.findById(id);
	}
	
	public Iterable<Achat> findAllAchats(){
		return achatRepository.findAll();
	}
	
	public Achat saveAchat(Achat achat) {
		return achatRepository.save(achat);
	}
	
	public void deleteAchat(Achat achat) {
		achatRepository.delete(achat);
	}
}
