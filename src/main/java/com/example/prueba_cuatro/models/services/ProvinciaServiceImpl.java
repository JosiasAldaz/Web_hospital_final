package com.example.prueba_cuatro.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.prueba_cuatro.models.dao.IProvinciaDao;
import com.example.prueba_cuatro.models.entity.Provincia;

@Service
public class ProvinciaServiceImpl implements IProvinciaService{

	@Autowired
	private IProvinciaDao ProvinciaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Provincia> findAll() {
		
		return (List<Provincia>)ProvinciaDao.findAll();
	}

	@Override
	public Provincia save(Provincia provincia) {
		
		return ProvinciaDao.save(provincia);
	}

	@Override
	@Transactional(readOnly=true)
	public Provincia findById(Long id) {
		
		return ProvinciaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}


	
}
