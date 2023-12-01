package com.example.prueba_cuatro.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.prueba_cuatro.models.entity.Historias_Clinicas;

import com.example.prueba_cuatro.models.dao.IHistorias_ClinicasDao;

@Service
public class Historias_ClinicasServiceImpl implements IHistorias_ClinicasService{

	@Autowired
	private IHistorias_ClinicasDao Historias_ClinicasDao;

	@Override
	@Transactional(readOnly=true)
	public List<Historias_Clinicas> findAll() {
		
		return (List<Historias_Clinicas>)Historias_ClinicasDao.findAll();
	}

	@Override
	public Historias_Clinicas save(Historias_Clinicas historias_Clinicas) {
		// TODO Auto-generated method stub
		return Historias_ClinicasDao.save(historias_Clinicas);
	}

	@Override
	@Transactional(readOnly=true)
	public Historias_Clinicas findById(Long id) {
		
		return Historias_ClinicasDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
