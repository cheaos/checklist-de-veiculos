package br.com.senior.chkbackend.domain.dto;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ImagemBean {

	private String dsNomeArquivo;
	private Integer cdEmpresa;
	private Integer cdSequencia;	
	private Integer inTipoMovimento;
	private String dsUsuario;
	private String dsObservacao;
	private LocalDateTime dtMovimentacao;
	private byte[] imgComprovante;
	private String dsDiretorio;
	private String erro;	
	
}
