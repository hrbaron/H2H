package com.ofbox.davivienda.h2h.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofbox.davivienda.h2h.dto.InfoCodigoBancoRequest;
import com.ofbox.davivienda.h2h.dto.InfoCodigoBancoResponse;
import com.ofbox.davivienda.h2h.repositories.IBSCodigosBancoRepository;

@RestController
@RequestMapping("GestionCodigosBanco")
public class GestionCodigosBancoController {

	@Autowired
	private IBSCodigosBancoRepository codigosBancoRepository; 
	
	@PostMapping(path = "CrearCodigoBanco")
	public ResponseEntity<?> crearCodigoBanco(@RequestBody InfoCodigoBancoRequest infoCodigoBancoRequest) {
		InfoCodigoBancoResponse response = new InfoCodigoBancoResponse();
		response.setCodigo(HttpStatus.OK.value());
		response.setDescripcion(
				"Eñ codigo Banco " + infoCodigoBancoRequest.getCodigoBanco() + " ha sido creado correctamente ");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping(path = "ConsultarCodigoBanco")
	public ResponseEntity<?> consultarCodigoBanco() {
		return new ResponseEntity<>(codigosBancoRepository.findAll(), HttpStatus.OK);
	}

	@PostMapping(path = "ConsultarRedOperacionPorCodBanco")
	public ResponseEntity<?> consultarRedOperacionPorCodBanco(
			@RequestBody InfoCodigoBancoRequest infoCodigoBancoRequest) {
		InfoCodigoBancoResponse response = new InfoCodigoBancoResponse();
		response.setCodigo(HttpStatus.OK.value());
		response.setDescripcion(
				"Eñ codigo Banco " + infoCodigoBancoRequest.getCodigoBanco() + " ha sido consultado correctamente ");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping(path = "ActualizarCodigoBanco")
	public ResponseEntity<?> actualizarCodigoBanco(@RequestBody InfoCodigoBancoRequest infoCodigoBancoRequest) {
		InfoCodigoBancoResponse response = new InfoCodigoBancoResponse();
		response.setCodigo(HttpStatus.OK.value());
		response.setDescripcion(
				"Eñ codigo Banco " + infoCodigoBancoRequest.getCodigoBanco() + " ha sido actualizado correctamente ");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@DeleteMapping(path = "InactivarCodigoBanco")
	public ResponseEntity<?> inactivarCodigoBanco(@RequestBody InfoCodigoBancoRequest infoCodigoBancoRequest) {
		InfoCodigoBancoResponse response = new InfoCodigoBancoResponse();
		response.setCodigo(HttpStatus.OK.value());
		response.setDescripcion(
				"El codigo Banco " + infoCodigoBancoRequest.getCodigoBanco() + " ha sido inactivado correctamente ");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
