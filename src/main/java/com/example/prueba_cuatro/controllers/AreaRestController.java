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

import com.example.prueba_cuatro.models.entity.Area;
import com.example.prueba_cuatro.models.services.IAreaService;

@RestController
@RequestMapping("/api")
public class AreaRestController {

	@Autowired
	private IAreaService areaService;
	
	@GetMapping("/areas")
	private List<Area> index(){
		return areaService.findAll();
	}
	
	@GetMapping("/areas/{id}")
	public Area show(@PathVariable Long id) {
		
		return areaService.findById(id);
	}
	
	@PostMapping("/areas")
	@ResponseStatus(HttpStatus.CREATED)
	public Area create(@RequestBody Area area) {
		
		return areaService.save(area);
	}
	
	@PutMapping("/areas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Area update(@RequestBody Area area, @PathVariable Long id) {
		Area areaActual=areaService.findById(id);
		areaActual.setNombre_area(area.getNombre_area());
		return areaService.save(areaActual);
	}
	
	@DeleteMapping("/areas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		areaService.delete(id);
		
	}
}
