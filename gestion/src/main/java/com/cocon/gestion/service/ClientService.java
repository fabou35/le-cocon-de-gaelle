package com.cocon.gestion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocon.gestion.model.Client;
import com.cocon.gestion.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public Iterable<Client> findAllClients(){
		return clientRepository.findAll();
	}
	
	public Optional<Client> findClientById(Integer id) {
		return clientRepository.findById(id);
	}
	
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}
	
	public void deleteClient(Client client) {
		clientRepository.delete(client);
	}
}
