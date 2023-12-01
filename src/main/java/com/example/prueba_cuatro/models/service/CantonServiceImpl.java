package com.example.prueba_cuatro.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.web.app.models.dao.ICantonDao;
import com.ista.springboot.web.app.models.entity.Canton;


public class CantonServiceImpl implements ICantonService{
	
	@Autowired
	private ICantonDao CantonDao;

	@Override
	@Transactional (readOnly=true)
	public List<Canton> findAll() {
		
		return (List<Canton>)CantonDao.findAll();
	}

	@Override
	public Canton save(Canton canton) {
		
		return CantonDao.save(canton);
	}

	@Override
	@Transactional (readOnly=true)
	public Canton findById(Long id) {
		
		return CantonDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		
	}

}
