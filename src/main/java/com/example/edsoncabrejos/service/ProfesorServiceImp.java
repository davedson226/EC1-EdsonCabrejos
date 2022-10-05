package com.example.edsoncabrejos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.edsoncabrejos.repository.ProfesorRepository;
import com.example.edsoncabrejos.model.Profesor;
@Service
public class ProfesorServiceImp implements ProfesorService {

	@Autowired
	private ProfesorRepository profeRe;
	
	@Override
	public void guardarPro(Profesor profesor) {
		// TODO Auto-generated method stub
		profeRe.save(profesor);

	}

	@Override
	public void actualizaPro(Profesor profesor) {
		// TODO Auto-generated method stub
		profeRe.saveAndFlush(profesor);

	}

	@Override
	public void eliminarPro(Integer id) {
		// TODO Auto-generated method stub
		profeRe.deleteById(id);

	}

	@Override
	public List<Profesor> listarPro() {
		// TODO Auto-generated method stub
		return profeRe.findAll();
	}

	@Override
	public Profesor obtenerPro(Integer id) {
		// TODO Auto-generated method stub
		return profeRe.findById(null).orElse(null);
	}

}
