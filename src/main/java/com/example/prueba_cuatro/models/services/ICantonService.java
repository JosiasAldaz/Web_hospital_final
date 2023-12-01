package com.example.prueba_cuatro.models.services;

import java.util.List;

import com.example.prueba_cuatro.models.entity.Canton;

public interface ICantonService {

	public List<Canton> findAll();
	
	public Canton save(Canton canton);
	
	public Canton findById(Long id);
	
	public void delete(Long id);
}
