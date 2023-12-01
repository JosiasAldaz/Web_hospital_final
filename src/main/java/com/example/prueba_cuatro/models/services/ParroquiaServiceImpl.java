package com.example.prueba_cuatro.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.prueba_cuatro.models.dao.IParroquiaDao;

import com.example.prueba_cuatro.models.entity.Parroquia;

@Service
public class ParroquiaServiceImpl implements IParroquiaService{

	@Autowired
	private IParroquiaDao ParroquiaDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Parroquia> findAll() {
		
		return (List<Parroquia>)ParroquiaDao.findAll();
	}

	@Override
	public Parroquia save(Parroquia parroquia) {
		
		return ParroquiaDao.save(parroquia);
	}

	@Override
	@Transactional (readOnly=true)
	public Parroquia findById(Long id) {
		
		return ParroquiaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		
	}

	
}
