package com.cocon.gestion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "client_id")
	private Integer id;
	
	@NotBlank(message = "Le nom est obligatoire")
	@Column(name = "nom")
	private String nom;
	
	@NotBlank(message = "Le prénom est obligatoire")
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "telephone")
	private int telephone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Client(Integer id, @NotBlank(message = "Le nom est obligatoire") String nom,
			@NotBlank(message = "Le prénom est obligatoire") String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Client(Integer id, @NotBlank(message = "Le nom est obligatoire") String nom,
			@NotBlank(message = "Le prénom est obligatoire") String prenom, int telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}
	
	
}
