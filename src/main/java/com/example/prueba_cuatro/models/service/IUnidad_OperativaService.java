package com.example.prueba_cuatro.models.service;

import java.util.List;

import com.ista.springboot.web.app.models.entity.Unidad_Operativa;


public interface IUnidad_OperativaService {

	public List<Unidad_Operativa> findAll();
	
	public Unidad_Operativa save(Unidad_Operativa unidad_Operativa);
	
	public Unidad_Operativa findById(Long id);
	
	public void delete (Long id);
}
