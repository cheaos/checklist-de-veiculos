package br.com.senior.chkbackend.model;

import java.time.LocalDateTime;

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
@Table(name = "CODMOVIMG")
@NoArgsConstructor
public class CODMOVIMG {

	@EqualsAndHashCode.Include
	@ToString.Include
	@EmbeddedId
	@NonNull
	private CODMOVIMGId pk;
	
	@Column(name="DsOrigem")
	private String dsOrigem;	
	
	@Column(name="InTipoMovimento")
	private Integer inTipoMovimento;
	
	@Column(name="DsNomeArquivo")
	private String dsNomeArquivo;

	@Column(name="DsDiretorio")
	private String dsDiretorio;
	
	@Column(name="DsUsuario")
	private String dsUsuario;	

	@Column(name="DsObservacao")
	private String dsObservacao;
	
	@Column(name="DtMovimentacao")
	private LocalDateTime dtMovimentacao;		
	
}
