package com.example.prueba_cuatro.models.services;

import java.util.List;

import com.example.prueba_cuatro.models.entity.Provincia;


public interface IProvinciaService {
	
	public List<Provincia> findAll();
	
	public Provincia save(Provincia provincia);
	
	public Provincia findById(Long id);
	
	public void delete (Long id);
}
