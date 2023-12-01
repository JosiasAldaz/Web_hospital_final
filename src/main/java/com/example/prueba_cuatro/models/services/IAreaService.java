package com.example.prueba_cuatro.models.services;

import java.util.List;

import com.example.prueba_cuatro.models.entity.Area;


public interface IAreaService {

	public List<Area> findAll();
	
	public Area save(Area area);
	
	public Area findById(Long id);
	
	public void delete (Long id);
}
