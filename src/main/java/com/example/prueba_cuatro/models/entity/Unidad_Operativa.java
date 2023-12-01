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
@Table(name="unidades_operativas") 
public class Unidad_Operativa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre_unidad_operativa;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="area_id")
	private Area area;
	
	@OneToMany(mappedBy="unidades_operativas",cascade=CascadeType.ALL)
	private List<Registro_Parte_Diario> registro_parte_diario;

	public List<Registro_Parte_Diario> getRegistro_parte_diario() {
		return registro_parte_diario;
	}

	public void setRegistro_parte_diario(List<Registro_Parte_Diario> registro_parte_diario) {
		this.registro_parte_diario = registro_parte_diario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_unidad_operativa() {
		return nombre_unidad_operativa;
	}

	public void setNombre_unidad_operativa(String nombre_unidad_operativa) {
		this.nombre_unidad_operativa = nombre_unidad_operativa;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	
}
