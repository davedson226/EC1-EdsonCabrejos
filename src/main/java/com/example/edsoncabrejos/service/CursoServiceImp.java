package com.example.edsoncabrejos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edsoncabrejos.model.Curso;
import com.example.edsoncabrejos.repository.CursoRepository;
@Service
public class CursoServiceImp implements CursoService {

	
	@Autowired
	private CursoRepository cursoRe;
	
	@Override
	public void guardarCur(Curso curso) {
		// TODO Auto-generated method stub
		cursoRe.save(curso);

	}

	@Override
	public void actualizaCur(Curso curso) {
		// TODO Auto-generated method stub
		cursoRe.saveAndFlush(curso);
		

	}

	@Override
	public void eliminarCur(Integer id) {
		// TODO Auto-generated method stub
		cursoRe.deleteById(id);

	}

	@Override
	public List<Curso> listarCur() {
		// TODO Auto-generated method stub
		return cursoRe.findAll();
	}

	@Override
	public Curso obtenerCur(Integer id) {
		// TODO Auto-generated method stub
		return cursoRe.findById(id).orElse(null);
	}

}
