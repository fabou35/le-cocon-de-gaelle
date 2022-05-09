package com.cocon.gestion.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vente")
public class Vente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vente_id")
	private Integer id;
	
	@Column(name = "categorie")
	private String categorie;
	
	@Column(name = "nom_produit")
	private String nomProduit;
	
	@Column(name = "client_id")
	private Integer idClient;
	
	@Column(name = "date_vente")
	private Date dateVente;
	
	@Column(name = "tarif_vente")
	private float tarifVente;
	
	@Column(name = "promo_id")
	private Integer idPromo;
	
	@Column(name = "type_paiement")
	private String typePaiement;

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

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public float getTarifVente() {
		return tarifVente;
	}

	public void setTarifVente(float tarifVente) {
		this.tarifVente = tarifVente;
	}

	public Integer getIdPromo() {
		return idPromo;
	}

	public void setIdPromo(Integer idPromo) {
		this.idPromo = idPromo;
	}

	public String getTypePaiement() {
		return typePaiement;
	}

	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
	}

	public Vente(Integer id, String categorie, String nomProduit, Integer idClient, Date dateVente, float tarifVente,
			Integer idPromo, String typePaiement) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.nomProduit = nomProduit;
		this.idClient = idClient;
		this.dateVente = dateVente;
		this.tarifVente = tarifVente;
		this.idPromo = idPromo;
		this.typePaiement = typePaiement;
	}
	
	
}
