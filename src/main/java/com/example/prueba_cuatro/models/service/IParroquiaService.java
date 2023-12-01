package com.example.prueba_cuatro.models.service;

import java.util.List;

import com.ista.springboot.web.app.models.entity.Parroquia;


public interface IParroquiaService {

	public List<Parroquia> findAll();
	
	public Parroquia save(Parroquia parroquia);
	
	public Parroquia findById(Long id);
	
	public void delete (Long id);
}
