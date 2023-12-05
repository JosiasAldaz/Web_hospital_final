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
@Table(name="Unidad_Operativa" ,uniqueConstraints= {@UniqueConstraint(columnNames= {"nombre_unidad_operativa"})})
public class Unidad_Operativa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_unidad_operativa;
	private String nombre_unidad_operativa;
	private Long id_area;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_unidad_operativa")
	private List<Registro_Parte_Diario> registro_parte_diario;

	public List<Registro_Parte_Diario> getRegistro_parte_diario() {
		return registro_parte_diario;
	}

	public void setRegistro_parte_diario(List<Registro_Parte_Diario> registro_parte_diario) {
		this.registro_parte_diario = registro_parte_diario;
	}


	public Long getId_unidad_operativa() {
		return id_unidad_operativa;
	}

	public void setId_unidad_operativa(Long id_unidad_operativa) {
		this.id_unidad_operativa = id_unidad_operativa;
	}

	public String getNombre_unidad_operativa() {
		return nombre_unidad_operativa;
	}

	public void setNombre_unidad_operativa(String nombre_unidad_operativa) {
		this.nombre_unidad_operativa = nombre_unidad_operativa;
	}

	public Long getId_area() {
		return id_area;
	}

	public void setId_area(Long id_area) {
		this.id_area = id_area;
	}

	
	
}
