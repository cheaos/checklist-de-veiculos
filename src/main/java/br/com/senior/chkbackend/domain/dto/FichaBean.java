package br.com.senior.chkbackend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class FichaBean {
	
	public FichaBean() {}
	
	@NonNull
	private Integer nrFicha;
	@NonNull	
	private Integer cdEmpresa;	
	private Integer cdSequencia;
	private Integer cdOcorrencia;
	private String dsOcorrencia;
	private String erro;
}
