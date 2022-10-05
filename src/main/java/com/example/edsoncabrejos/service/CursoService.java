package com.example.edsoncabrejos.service;

import java.util.List;

import com.example.edsoncabrejos.model.Curso;

public interface CursoService {

	void guardarCur(Curso curso);
	void actualizaCur(Curso curso);
	void eliminarCur (Integer id);
	List<Curso> listarCur();
	Curso obtenerCur(Integer id);
}
