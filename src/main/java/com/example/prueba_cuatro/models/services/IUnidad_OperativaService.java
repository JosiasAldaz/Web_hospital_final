package com.example.prueba_cuatro.models.services;

import java.util.List;

import com.example.prueba_cuatro.models.entity.Unidad_Operativa;


public interface IUnidad_OperativaService {

	public List<Unidad_Operativa> findAll();
	
	public Unidad_Operativa save(Unidad_Operativa unidad_Operativa);
	
	public Unidad_Operativa findById(Long id);
	
	public void delete (Long id);
}
