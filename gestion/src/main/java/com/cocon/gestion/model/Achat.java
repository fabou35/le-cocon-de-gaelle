package com.cocon.gestion.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "achat")
public class Achat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "achat_id")
	private Integer id;
	
	@NotBlank(message = "Ne peut pas être vide")
	@Column(name = "categorie")
	private String categorie;
	
	@NotBlank(message = "Ne peut pas être vide")
	@Column(name = "fournisseur")
	private String fournisseur;
	
	@Column(name = "description")
	private String description;
	
	@NotBlank(message = "Ne peut pas être vide")
	@Column(name = "date_achat")
	private Date dateAchat;
	
	@NotBlank(message = "Ne peut pas être vide")
	@Column(name = "prix_achat")
	private float prixAchat;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public float getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	public Achat(Integer id, @NotBlank(message = "Ne peut pas être vide") String categorie,
			@NotBlank(message = "Ne peut pas être vide") String fournisseur, String description,
			@NotBlank(message = "Ne peut pas être vide") Date dateAchat,
			@NotBlank(message = "Ne peut pas être vide") float prixAchat) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.fournisseur = fournisseur;
		this.description = description;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
	}

	public Achat(Integer id, @NotBlank(message = "Ne peut pas être vide") String categorie,
			@NotBlank(message = "Ne peut pas être vide") String fournisseur,
			@NotBlank(message = "Ne peut pas être vide") Date dateAchat,
			@NotBlank(message = "Ne peut pas être vide") float prixAchat) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.fournisseur = fournisseur;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
	}
	
	
}
