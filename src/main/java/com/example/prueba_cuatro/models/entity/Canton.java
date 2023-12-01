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
@Table(name="cantones" ,uniqueConstraints= {@UniqueConstraint(columnNames= {"nombre"})}) 
public class Canton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre_canton;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="provincia_id")
	private Provincia provincia;
	
	@OneToMany(mappedBy="cantones",cascade=CascadeType.ALL)
	private List<Parroquia> parroquias;
	
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Parroquia> getParroquias() {
		return parroquias;
	}

	public void setParroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_canton() {
		return nombre_canton;
	}

	public void setNombre_canton(String nombre_canton) {
		this.nombre_canton = nombre_canton;
	}
	
	
}
