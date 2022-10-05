package com.example.edsoncabrejos.service;

import java.util.List;

import com.example.edsoncabrejos.model.Profesor;

public interface ProfesorService {

	void guardarPro(Profesor profesor);
	void actualizaPro(Profesor profesor);
	void eliminarPro (Integer id);
	List<Profesor> listarPro();
	Profesor obtenerPro(Integer id);
}
