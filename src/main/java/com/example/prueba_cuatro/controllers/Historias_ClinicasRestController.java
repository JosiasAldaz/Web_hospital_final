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

import com.example.prueba_cuatro.models.entity.Historias_Clinicas;
import com.example.prueba_cuatro.models.services.IHistorias_ClinicasService;

@RestController
@RequestMapping("/api")
public class Historias_ClinicasRestController {

	@Autowired
	private IHistorias_ClinicasService Historias_ClinicasService;
	
	@GetMapping("/historiasClinicas")
	private List<Historias_Clinicas> index(){
		return Historias_ClinicasService.findAll();
	}
	
	@GetMapping("/historiasClinicas/{id}")
	public Historias_Clinicas show(@PathVariable Long id) {
		
		return Historias_ClinicasService.findById(id);
	}
	
	@PostMapping("/historiasClinicas")
	@ResponseStatus(HttpStatus.CREATED)
	public Historias_Clinicas create(@RequestBody Historias_Clinicas Historias_Clinicas) {
		
		return Historias_ClinicasService.save(Historias_Clinicas);
	}
	
	@PutMapping("/historiasClinicas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Historias_Clinicas update(@RequestBody Historias_Clinicas Historias_Clinicas, @PathVariable Long id) {
		Historias_Clinicas Historias_ClinicasActual=Historias_ClinicasService.findById(id);
		Historias_ClinicasActual.setNombre_paciente(Historias_Clinicas.getNombre_paciente());
		Historias_ClinicasActual.setApellido_paciente(Historias_Clinicas.getApellido_paciente());
		Historias_ClinicasActual.setFecha_nacimiento_paciente(Historias_Clinicas.getFecha_nacimiento_paciente());
		return Historias_ClinicasService.save(Historias_ClinicasActual);
	}
	
	@DeleteMapping("/historiasClinicas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Historias_ClinicasService.delete(id);
		
	}
}
