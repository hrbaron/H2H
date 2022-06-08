package com.ofbox.davivienda.h2h.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoCodigoBancoRequest {
	
	private String nombreBanco;
	private String codigoBanco;
	private Long codigoUni;
	private Long redOperacion;
	private Long codigoTransfer;
	private String valdacion;

}
