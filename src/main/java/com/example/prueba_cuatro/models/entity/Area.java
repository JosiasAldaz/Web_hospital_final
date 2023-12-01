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
	private Long id;
	
	private String nombre_area;
	
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="parroquia_id")
	private Parroquia parroquia;

	@OneToMany(mappedBy="areas",cascade=CascadeType.ALL)
	private List<Unidad_Operativa> unidades_operativas;
	
	public List<Unidad_Operativa> getUnidades_operativas() {
		return unidades_operativas;
	}


	public void setUnidades_operativas(List<Unidad_Operativa> unidades_operativas) {
		this.unidades_operativas = unidades_operativas;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre_area() {
		return nombre_area;
	}


	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}


	public Parroquia getParroquia() {
		return parroquia;
	}


	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}
	
	
	
}
