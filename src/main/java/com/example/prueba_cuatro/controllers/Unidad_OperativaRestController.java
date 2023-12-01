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

import com.example.prueba_cuatro.models.entity.Unidad_Operativa;
import com.example.prueba_cuatro.models.services.IUnidad_OperativaService;

@RestController
@RequestMapping("/api")
public class Unidad_OperativaRestController {
	
	@Autowired
	private IUnidad_OperativaService Unidad_OperativaService;
	
	@GetMapping("/unidades_operativas")
	private List<Unidad_Operativa> index(){
		return Unidad_OperativaService.findAll();
	}
	
	@GetMapping("/unidades_operativas/{id}")
	public Unidad_Operativa show(@PathVariable Long id) {
		
		return Unidad_OperativaService.findById(id);
	}
	
	@PostMapping("/unidades_operativas")
	@ResponseStatus(HttpStatus.CREATED)
	public Unidad_Operativa create(@RequestBody Unidad_Operativa Unidad_Operativa) {
		
		return Unidad_OperativaService.save(Unidad_Operativa);
	}
	
	@PutMapping("/unidades_operativas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Unidad_Operativa update(@RequestBody Unidad_Operativa Unidad_Operativa, @PathVariable Long id) {
		Unidad_Operativa Unidad_OperativaActual=Unidad_OperativaService.findById(id);
		Unidad_OperativaActual.setNombre_unidad_operativa(Unidad_Operativa.getNombre_unidad_operativa());
		return Unidad_OperativaService.save(Unidad_OperativaActual);
	}
	
	@DeleteMapping("/unidades_operativas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Unidad_OperativaService.delete(id);
		
	}
}
