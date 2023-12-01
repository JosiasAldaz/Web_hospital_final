package com.example.prueba_cuatro.models.service;

import java.util.List;

import com.ista.springboot.web.app.models.entity.Provincia;



public interface IProvinciaService {
	
	public List<Provincia> findAll();
	
	public Provincia save(Provincia provincia);
	
	public Provincia findById(Long id);
	
	public void delete (Long id);
}
