package com.example.prueba_cuatro.models.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="Registro_Parte_Diario")
public class Registro_Parte_Diario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_parte_diario;
	
	
	private Date fecha_registro;
	private Long numero_visita;
	private Double peso_paciente;
	private Double talla_paciente;
	private Long cedula_NroHistoriaClinica;
	private Long id_unidad_operativa;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	

	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public Long getNumero_visita() {
		return numero_visita;
	}
	public void setNumero_visita(Long numero_visita) {
		this.numero_visita = numero_visita;
	}
	public Double getPeso_paciente() {
		return peso_paciente;
	}
	public void setPeso_paciente(Double peso_paciente) {
		this.peso_paciente = peso_paciente;
	}
	public Double getTalla_paciente() {
		return talla_paciente;
	}
	public void setTalla_paciente(Double talla_paciente) {
		this.talla_paciente = talla_paciente;
	}
	public Long getId_parte_diario() {
		return id_parte_diario;
	}
	public void setId_parte_diario(Long id_parte_diario) {
		this.id_parte_diario = id_parte_diario;
	}
	public Long getCedula_NroHistoriaClinica() {
		return cedula_NroHistoriaClinica;
	}
	public void setCedula_NroHistoriaClinica(Long cedula_NroHistoriaClinica) {
		this.cedula_NroHistoriaClinica = cedula_NroHistoriaClinica;
	}
	public Long getId_unidad_operativa() {
		return id_unidad_operativa;
	}
	public void setId_unidad_operativa(Long id_unidad_operativa) {
		this.id_unidad_operativa = id_unidad_operativa;
	}

	
}
