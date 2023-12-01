package com.example.prueba_cuatro.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.prueba_cuatro.models.dao.ICantonDao;
import com.example.prueba_cuatro.models.entity.Canton;

@Service
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
