package com.tutoria.onetoone02.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
public class Ciudadano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private String name;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable (name = "vacunacion", 
	joinColumns = @JoinColumn (name = "ciudadano_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn (name = "vacuna_id", referencedColumnName = "id"))
	private Vacuna vacuna;

	public Ciudadano() {
	}

	public Ciudadano(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vacuna getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}
	
	public void deleteVacuna () {
		this.getVacuna().setCiudadano(null);
		this.setVacuna(null);
	}

}
