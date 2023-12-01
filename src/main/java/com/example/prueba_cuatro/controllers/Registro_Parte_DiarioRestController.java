package com.example.prueba_cuatro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_cuatro.models.entity.Registro_Parte_Diario;
import com.example.prueba_cuatro.models.services.IRegistro_Parte_DiarioService;

@RestController
@RequestMapping("/api")
public class Registro_Parte_DiarioRestController {
	@Autowired
	private IRegistro_Parte_DiarioService Registro_Parte_DiarioService;
	
	@GetMapping("/registros")
	private List<Registro_Parte_Diario> index(){
		return Registro_Parte_DiarioService.findAll();
	}
	
	@GetMapping("/registros/{id}")
	public Registro_Parte_Diario show(@PathVariable Long id) {
		
		return Registro_Parte_DiarioService.findById(id);
	}
	
	@PostMapping("/registros")
	@ResponseStatus(HttpStatus.CREATED)
	public Registro_Parte_Diario create(@RequestBody Registro_Parte_Diario Registro_Parte_Diario) {
		
		return Registro_Parte_DiarioService.save(Registro_Parte_Diario);
	}
	
	@PutMapping("/registros/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Registro_Parte_Diario update(@RequestBody Registro_Parte_Diario Registro_Parte_Diario, @PathVariable Long id) {
		Registro_Parte_Diario Registro_Parte_DiarioActual=Registro_Parte_DiarioService.findById(id);
		Registro_Parte_DiarioActual.setFecha_registro(Registro_Parte_Diario.getFecha_registro());
		Registro_Parte_DiarioActual.setNumero_visita(Registro_Parte_DiarioActual.getNumero_visita());
		Registro_Parte_DiarioActual.setPeso_paciente(Registro_Parte_DiarioActual.getPeso_paciente());
		Registro_Parte_DiarioActual.setTalla_paciente(Registro_Parte_DiarioActual.getTalla_paciente());
		return Registro_Parte_DiarioService.save(Registro_Parte_DiarioActual);
	}
	
	@DeleteMapping("/registros/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Registro_Parte_DiarioService.delete(id);
		
	}
}
