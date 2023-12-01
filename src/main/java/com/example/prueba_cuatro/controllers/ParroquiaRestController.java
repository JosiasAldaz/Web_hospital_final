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

import com.example.prueba_cuatro.models.entity.Parroquia;
import com.example.prueba_cuatro.models.services.IParroquiaService;

@RestController
@RequestMapping("/api")
public class ParroquiaRestController {
	@Autowired
	private IParroquiaService parroquiaService;
	
	@GetMapping("/parroquias")
	private List<Parroquia> index(){
		return parroquiaService.findAll();
	}
	
	@GetMapping("/parroquias/{id}")
	public Parroquia show(@PathVariable Long id) {
		
		return parroquiaService.findById(id);
	}
	
	@PostMapping("/parroquias")
	@ResponseStatus(HttpStatus.CREATED)
	public Parroquia create(@RequestBody Parroquia parroquia) {
		
		return parroquiaService.save(parroquia);
	}
	
	@PutMapping("/parroquias/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Parroquia update(@RequestBody Parroquia parroquia, @PathVariable Long id) {
		Parroquia parroquiaActual=parroquiaService.findById(id);
		parroquiaActual.setNombre_parroquia(parroquia.getNombre_parroquia());
		return parroquiaService.save(parroquiaActual);
	}
	
	@DeleteMapping("/parroquias/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		parroquiaService.delete(id);
		
	}
}
