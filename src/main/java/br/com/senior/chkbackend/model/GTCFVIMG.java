package br.com.senior.chkbackend.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "GTCFVimg")
@NoArgsConstructor
public class GTCFVIMG {
	
	@EqualsAndHashCode.Include
	@ToString.Include
	@EmbeddedId
	@NonNull
	private GTCFVIMGId pk;
	
	@Column(name="DsNomeArquivo")
	private String dsNomeArquivo;
	
	@Column(name="DsCaminhoArquivo")
	private String dsCaminhoArquivo;

	@Column(name="CdOcorrencia")
	private Integer cdOcorrencia;
	
	@Column(name="DsOcorrencia")
	private String dsOcorrencia;	
	
}
