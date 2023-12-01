package com.example.prueba_cuatro.models.service;

import java.util.List;

import com.ista.springboot.web.app.models.entity.Canton;

public interface ICantonService {

	public List<Canton> findAll();
	
	public Canton save(Canton canton);
	
	public Canton findById(Long id);
	
	public void delete(Long id);
}
