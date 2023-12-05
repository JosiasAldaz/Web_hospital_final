package com.example.prueba_cuatro.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="areas") 
public class Area implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_area;
	private Long id_parroquias;
	private String nombre_area;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_area")
	
	
	private List<Parroquia> parroquias;


	public Long getId_area() {
		return id_area;
	}


	public void setId_area(Long id_area) {
		this.id_area = id_area;
	}


	public String getNombre_area() {
		return nombre_area;
	}


	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}


	public Long getId_parroquias() {
		return id_parroquias;
	}


	public void setId_parroquias(Long id_parroquias) {
		this.id_parroquias = id_parroquias;
	}


	public List<Parroquia> getParroquias() {
		return parroquias;
	}


	public void setParroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}
	
	
}
