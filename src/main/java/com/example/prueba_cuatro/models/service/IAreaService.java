package com.example.prueba_cuatro.models.service;

import java.util.List;

import com.ista.springboot.web.app.models.entity.Area;


public interface IAreaService {

	public List<Area> findAll();
	
	public Area save(Area area);
	
	public Area findById(Long id);
	
	public void delete (Long id);
}
