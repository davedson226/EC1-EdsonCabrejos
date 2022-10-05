package com.example.edsoncabrejos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.edsoncabrejos.model.MallaCuricular;
import com.example.edsoncabrejos.service.MallaCuricularService;

@RestController
@RequestMapping("/malla/v1")
public class MallaController {

	
	@Autowired
	private  MallaCuricularService service;
	
	@RequestMapping (path="/listar",method = RequestMethod.GET)
	public ResponseEntity<List<MallaCuricular>> listar(){
		return new ResponseEntity<List<MallaCuricular>>(service.listarMalla(),HttpStatus.OK);
	}

	@RequestMapping (path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody MallaCuricular mallaCuricular){
		service.guardarMalla(mallaCuricular);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path="/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<MallaCuricular> obtenerPorId(@PathVariable Integer id){
		MallaCuricular mallaCuricular = service.obtenerMalla(id);
		
		if(mallaCuricular != null) {
			return new ResponseEntity<MallaCuricular>(mallaCuricular, HttpStatus.OK);
			
		}else {
			return new ResponseEntity<MallaCuricular>(HttpStatus.NOT_FOUND);

		}
	}

	@RequestMapping(path="/editar", method= RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody MallaCuricular mallaCuricular){
		
		MallaCuricular m = service.obtenerMalla(mallaCuricular.getIdMalla());
		if(m != null) {
			service.actualizarMalla(mallaCuricular);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
		
	@RequestMapping(path = "/eliminar/{id}")
	public ResponseEntity<Void>eliminar(@PathVariable Integer id){
		
		MallaCuricular mallaCuricular = service.obtenerMalla(id);
		
		if(mallaCuricular != null) {
			service.eliminarMalla(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	 
		}
	}
}
