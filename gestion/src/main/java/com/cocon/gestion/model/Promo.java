package com.cocon.gestion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "promo")
public class Promo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "promo_id")
	private Integer id;
	
	@Column(name = "type_promo")
	private String typePromo;
	
	@Column(name = "montant_promo")
	private float montantPromo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypePromo() {
		return typePromo;
	}

	public void setTypePromo(String typePromo) {
		this.typePromo = typePromo;
	}

	public float getMontantPromo() {
		return montantPromo;
	}

	public void setMontantPromo(float montantPromo) {
		this.montantPromo = montantPromo;
	}

	public Promo(Integer id, String typePromo, float montantPromo) {
		super();
		this.id = id;
		this.typePromo = typePromo;
		this.montantPromo = montantPromo;
	}
}
