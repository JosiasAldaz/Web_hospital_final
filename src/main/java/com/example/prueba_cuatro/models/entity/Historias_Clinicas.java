package com.example.prueba_cuatro.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="historias_clinicas") 
public class Historias_Clinicas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre_paciente;
	private String apellido_paciente;
	private Date fecha_nacimiento_paciente;
	
	@OneToMany(mappedBy="historias_clinicas",cascade=CascadeType.ALL)
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
	public String getNombre_paciente() {
		return nombre_paciente;
	}
	public void setNombre_paciente(String nombre_paciente) {
		this.nombre_paciente = nombre_paciente;
	}
	public String getApellido_paciente() {
		return apellido_paciente;
	}
	public void setApellido_paciente(String apellido_paciente) {
		this.apellido_paciente = apellido_paciente;
	}
	public Date getFecha_nacimiento_paciente() {
		return fecha_nacimiento_paciente;
	}
	public void setFecha_nacimiento_paciente(Date fecha_nacimiento_paciente) {
		this.fecha_nacimiento_paciente = fecha_nacimiento_paciente;
	}
	
	
	
}
