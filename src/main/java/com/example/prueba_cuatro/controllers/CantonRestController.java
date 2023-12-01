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

import com.example.prueba_cuatro.models.entity.Canton;

import com.example.prueba_cuatro.models.services.ICantonService;

@RestController
@RequestMapping("/api")
public class CantonRestController {

	@Autowired
	private ICantonService cantonService;
	
	@GetMapping("/cantones")
	private List<Canton> index(){
		return cantonService.findAll();
	}
	
	@GetMapping("/cantones/{id}")
	public Canton show(@PathVariable Long id) {
		
		return cantonService.findById(id);
	}
	
	@PostMapping("/cantones")
	@ResponseStatus(HttpStatus.CREATED)
	public Canton create(@RequestBody Canton canton) {
		
		return cantonService.save(canton);
	}
	
	@PutMapping("/cantones/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Canton update(@RequestBody Canton canton, @PathVariable Long id) {
		Canton cantonActual=cantonService.findById(id);
		cantonActual.setNombre_canton(canton.getNombre_canton());
		return cantonService.save(cantonActual);
	}
	
	@DeleteMapping("/cantones/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		cantonService.delete(id);
		
	}
}
