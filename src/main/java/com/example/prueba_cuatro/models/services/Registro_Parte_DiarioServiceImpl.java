package com.example.prueba_cuatro.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.prueba_cuatro.models.dao.IRegistro_Parte_DiarioDao;
import com.example.prueba_cuatro.models.entity.Registro_Parte_Diario;

@Service
public class Registro_Parte_DiarioServiceImpl implements IRegistro_Parte_DiarioService{

	@Autowired
	private IRegistro_Parte_DiarioDao Registro_Parte_DiarioDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Registro_Parte_Diario> findAll() {
		
		return (List<Registro_Parte_Diario>)Registro_Parte_DiarioDao.findAll();
	}

	@Override
	public Registro_Parte_Diario save(Registro_Parte_Diario registro_Parte_Diario) {
		
		return Registro_Parte_DiarioDao.save(registro_Parte_Diario);
	}

	@Override
	@Transactional (readOnly=true)
	public Registro_Parte_Diario findById(Long id) {
		
		return Registro_Parte_DiarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional 
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}


}
