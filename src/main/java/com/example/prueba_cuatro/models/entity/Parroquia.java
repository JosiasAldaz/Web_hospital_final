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
@Table(name="parroquias") 
public class Parroquia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre_parroquia;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="canton_id")
	private Canton cantones;
	
	@OneToMany(mappedBy="parroquias",cascade=CascadeType.ALL)
	private List<Area> areas;

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_parroquia() {
		return nombre_parroquia;
	}

	public void setNombre_parroquia(String nombre_parroquia) {
		this.nombre_parroquia = nombre_parroquia;
	}

	public Canton getCantones() {
		return cantones;
	}

	public void setCantones(Canton cantones) {
		this.cantones = cantones;
	}
	
	
}
