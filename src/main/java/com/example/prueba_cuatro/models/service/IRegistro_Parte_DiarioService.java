package com.example.prueba_cuatro.models.service;

import java.util.List;

import com.ista.springboot.web.app.models.entity.Registro_Parte_Diario;



public interface IRegistro_Parte_DiarioService {

	public List<Registro_Parte_Diario> findAll();
	
	public Registro_Parte_Diario save(Registro_Parte_Diario registro_Parte_Diario);
	
	public Registro_Parte_Diario findById(Long id);
	
	public void delete (Long id);
}
