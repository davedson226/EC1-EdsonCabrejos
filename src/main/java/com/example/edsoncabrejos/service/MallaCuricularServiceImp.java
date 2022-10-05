package com.example.edsoncabrejos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edsoncabrejos.model.MallaCuricular;
import com.example.edsoncabrejos.repository.MallaCuricularRepository;
@Service
public class MallaCuricularServiceImp implements MallaCuricularService {

	@Autowired
	private MallaCuricularRepository mallaRe;
	
	@Override
	public void guardarMalla(MallaCuricular mallaCuricular) {
		// TODO Auto-generated method stub
		mallaRe.save(mallaCuricular);

	}

	@Override
	public void actualizarMalla(MallaCuricular mallaCuricular) {
		// TODO Auto-generated method stub
		mallaRe.saveAndFlush(mallaCuricular);

	}

	@Override
	public void eliminarMalla(Integer id) {
		// TODO Auto-generated method stub
		mallaRe.deleteById(id);

	}

	@Override
	public List<MallaCuricular> listarMalla() {
		// TODO Auto-generated method stub
		return mallaRe.findAll();
	}

	@Override
	public MallaCuricular obtenerMalla(Integer id) {
		// TODO Auto-generated method stub
		return mallaRe.findById(id).orElse(null);
	}

}
