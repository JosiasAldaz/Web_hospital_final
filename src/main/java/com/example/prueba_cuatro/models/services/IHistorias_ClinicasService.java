package com.example.prueba_cuatro.models.services;

import java.util.List;

import com.example.prueba_cuatro.models.entity.Historias_Clinicas;


public interface IHistorias_ClinicasService {
	
	public List<Historias_Clinicas> findAll();
	
	public Historias_Clinicas save(Historias_Clinicas historias_Clinicas);
	
	public Historias_Clinicas findById(Long id);
	
	public void delete (Long id);
}
