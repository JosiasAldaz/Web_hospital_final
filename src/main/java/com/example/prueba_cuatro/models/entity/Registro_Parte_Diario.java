package com.example.prueba_cuatro.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="registros_partes_diario") 
public class Registro_Parte_Diario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Date fecha_registro;
	private Long numero_visita;
	private Double peso_paciente;
	private Double talla_paciente;
	
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="historias_clinicas_id")
	private Historias_Clinicas historias_clinicas;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="unidades_opertivas_id")
	
	private Unidad_Operativa unidades_operativas;
	
	public Historias_Clinicas getHistorias_clinicas() {
		return historias_clinicas;
	}
	public void setHistorias_clinicas(Historias_Clinicas historias_clinicas) {
		this.historias_clinicas = historias_clinicas;
	}
	public Unidad_Operativa getUnidad_opertivas() {
		return unidades_operativas;
	}
	public void setUnidad_opertivas(Unidad_Operativa unidades_operativas) {
		this.unidades_operativas = unidades_operativas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
}
