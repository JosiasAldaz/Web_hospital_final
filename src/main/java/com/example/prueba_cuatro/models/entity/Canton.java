package com.example.prueba_cuatro.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name="canton" ,uniqueConstraints= {@UniqueConstraint(columnNames= {"nombre_canton"})})
public class Canton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_canton;
	
	private String nombre_canton;
	@Column(nullable = false)
	private Long id_provincias;

	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_canton")
	private List<Parroquia> parroquias;
	
	public Long getId_provincias() {
		return id_provincias;
	}

	public void setId_provincias(Long id_provincias) {
		this.id_provincias = id_provincias;
	}



	public List<Parroquia> getParroquias() {
		return parroquias;
	}

	public void setParroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}

	public Long getId_canton() {
		return id_canton;
	}

	public void setId_canton(Long id_canton) {
		this.id_canton = id_canton;
	}

	public String getNombre_canton() {
		return nombre_canton;
	}

	public void setNombre_canton(String nombre_canton) {
		this.nombre_canton = nombre_canton;
	}
	
	
}
