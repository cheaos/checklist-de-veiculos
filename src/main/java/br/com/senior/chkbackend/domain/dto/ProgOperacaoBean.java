package br.com.senior.chkbackend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProgOperacaoBean {
	
	public ProgOperacaoBean() {
	}
	
	private String nrPlaca;
	private Integer inTipoOperacao;	
	private Integer cdEmpresa;
	private Integer cdSequencia;
	private Integer cdSeqIMG;
	private String erro;
}
