package com.example.prueba_cuatro.models.service;

import java.util.List;

import com.example.prueba_cuatro.models.entity.Historias_Clinicas;


public interface IHistoriasClinicasService {
	
	public List<Historias_Clinicas> findAll();
	
	public Historias_Clinicas save(Historias_Clinicas historias_Clinicas);
	
	public Historias_Clinicas findById(Long id);
	
	public void delete (Long id);
}
