package com.example.edsoncabrejos.service;

import java.util.List;

import com.example.edsoncabrejos.model.MallaCuricular;

public interface MallaCuricularService {
	
	void guardarMalla(MallaCuricular mallaCuricular);
	void actualizarMalla(MallaCuricular mallaCuricular);
	void eliminarMalla (Integer id);
	List<MallaCuricular> listarMalla();
	MallaCuricular obtenerMalla(Integer id);
}
