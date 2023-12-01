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

import com.ista.springboot.web.app.models.entity.Provincia;
import com.ista.springboot.web.app.models.services.IProvinciaService;


@RestController
@RequestMapping("/api")
public class ProvinciaRestController {
	
	@Autowired
	private IProvinciaService provinciaService;
	
	@GetMapping("/provincias")
	public List<Provincia> index(){
		return provinciaService.findAll();
		
	}
	
	@GetMapping("/provincias/{id}")
	public Provincia show(@PathVariable Long id) {
		
		return provinciaService.findById(id);
	}
	
	@PostMapping("/provincias")
	@ResponseStatus(HttpStatus.CREATED)
	public Provincia create(@RequestBody Provincia provincia) {
		
		return provinciaService.save(provincia);
	}
	
	@PutMapping("/provincias/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Provincia update(@RequestBody Provincia provincia, @PathVariable Long id) {
		Provincia provinciaActual=provinciaService.findById(id);
		provinciaActual.setNombre_provincia(provincia.getNombre_provincia());
		return provinciaService.save(provinciaActual);
	}
	
	@DeleteMapping("/provincias/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		provinciaService.delete(id);
		
	}
}
