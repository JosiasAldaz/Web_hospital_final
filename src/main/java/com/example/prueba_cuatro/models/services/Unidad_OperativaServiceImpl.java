package com.example.prueba_cuatro.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.prueba_cuatro.models.dao.IUnidad_OperativaDao;

import com.example.prueba_cuatro.models.entity.Unidad_Operativa;

@Service
public class Unidad_OperativaServiceImpl implements IUnidad_OperativaService{

	@Autowired
	private IUnidad_OperativaDao Unidad_OperativaDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Unidad_Operativa> findAll() {
		
		return (List<Unidad_Operativa>)Unidad_OperativaDao.findAll();
	}

	@Override
	public Unidad_Operativa save(Unidad_Operativa unidad_Operativa) {
		
		return Unidad_OperativaDao.save(unidad_Operativa);
	}

	@Override
	@Transactional (readOnly=true)
	public Unidad_Operativa findById(Long id) {
		
		return Unidad_OperativaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional 
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
