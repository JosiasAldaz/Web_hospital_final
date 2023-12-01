package com.example.prueba_cuatro.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.prueba_cuatro.models.dao.IAreaDao;
import com.example.prueba_cuatro.models.entity.Area;

@Service
public class AreaServiceImpl implements IAreaService{

	@Autowired
	private IAreaDao AreaDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Area> findAll() {
		
		return (List<Area>)AreaDao.findAll();
	}

	@Override
	public Area save(Area area) {
		
		return AreaDao.save(area);
	}

	@Override
	@Transactional (readOnly=true)
	public Area findById(Long id) {
		
		return AreaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional 
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
