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
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="Parroquia" ,uniqueConstraints= {@UniqueConstraint(columnNames= {"nombre_parroquia"})})
public class Parroquia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_parroquias;
	private String nombre_parroquia;
	private Long canton_id;
	

	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_parroquias")
	
	private List<Canton> cantones;


	public Long getId_parroquias() {
		return id_parroquias;
	}

	public void setId_parroquias(Long id_parroquias) {
		this.id_parroquias = id_parroquias;
	}

	public String getNombre_parroquia() {
		return nombre_parroquia;
	}

	public void setNombre_parroquia(String nombre_parroquia) {
		this.nombre_parroquia = nombre_parroquia;
	}

	public Long getCanton_id() {
		return canton_id;
	}

	public void setCanton_id(Long canton_id) {
		this.canton_id = canton_id;
	}

	public List<Canton> getCantones() {
		return cantones;
	}

	public void setCantones(List<Canton> cantones) {
		this.cantones = cantones;
	}
	
	
}
