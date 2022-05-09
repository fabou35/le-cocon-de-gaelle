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
@Table(name = "prestation")
public class Prestation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prestation_id")
	private Integer id;
	
	@NotBlank(message = "Ne peut être vide")
	@Column(name = "categorie")
	private String categorie;
	
	@NotBlank(message = "Ne peut être vide")
	@Column(name = "prestation")
	private String prestation;
	
	@Column(name = "client_id")
	private Integer idClient;
	
	@NotBlank(message = "Ne peut être vide")
	@Column(name = "date_prestation")
	private Date datePrestation;
	
	@NotBlank(message = "Ne peut être vide")
	@Column(name = "tarif_prestation")
	private float tarifPrestation;
	
	@Column(name = "promo_id")
	private Integer idPromo;
	
	@NotBlank(message = "Ne peut être vide")
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

	public String getPrestation() {
		return prestation;
	}

	public void setPrestation(String prestation) {
		this.prestation = prestation;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public Date getDatePrestation() {
		return datePrestation;
	}

	public void setDatePrestation(Date datePrestation) {
		this.datePrestation = datePrestation;
	}

	public float getTarifPrestation() {
		return tarifPrestation;
	}

	public void setTarifPrestation(float tarifPrestation) {
		this.tarifPrestation = tarifPrestation;
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

	public Prestation(Integer id, String categorie, String prestation, Integer idClient, Date datePrestation,
			float tarifPrestation, Integer idPromo, String typePaiement) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.prestation = prestation;
		this.idClient = idClient;
		this.datePrestation = datePrestation;
		this.tarifPrestation = tarifPrestation;
		this.idPromo = idPromo;
		this.typePaiement = typePaiement;
	}
	
	
}
