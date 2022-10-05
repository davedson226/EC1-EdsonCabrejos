package com.example.edsoncabrejos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edsoncabrejos.model.Universidad;
import com.example.edsoncabrejos.repository.UniversidadRepository;
@Service
public class UniversidadServiceImp implements UniversidadService {

	@Autowired
	private UniversidadRepository uniRe;
	
	@Override
	public void guardarU(Universidad universidad) {
		// TODO Auto-generated method stub
		uniRe.save(universidad);

	}

	@Override
	public void actualizarU(Universidad universidad) {
		// TODO Auto-generated method stub
		uniRe.saveAndFlush(universidad);

	}

	@Override
	public void eliminaru(Integer id) {
		// TODO Auto-generated method stub
		uniRe.deleteById(id);

	}

	@Override
	public List<Universidad> listarU() {
		// TODO Auto-generated method stub
		return uniRe.findAll();
	}

	@Override
	public Universidad obtenerU(Integer id) {
		// TODO Auto-generated method stub
		return uniRe.findById(id).orElse(null);
	}

}
