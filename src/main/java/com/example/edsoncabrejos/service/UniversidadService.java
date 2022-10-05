package com.example.edsoncabrejos.service;

import java.util.List;

import com.example.edsoncabrejos.model.Universidad;

public interface UniversidadService {
	
	void guardarU(Universidad universidad);
	void actualizarU(Universidad universidad);
	void eliminaru (Integer id);
	List<Universidad> listarU();
	Universidad obtenerU(Integer id);
}
