package br.com.senior.chkbackend.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "CODMOV")
@NoArgsConstructor
@RequiredArgsConstructor
public class CODMOV {
	
	@EqualsAndHashCode.Include
	@ToString.Include
	@EmbeddedId
	@NonNull
	private CODMOVId pk;
	
	@Column(name="Nrplaca")
	private String nrPlaca;	

	@Column(name="DtFechamento")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtFechamento;
	
	@Column(name="dsUsuarioFechamento", length = 10)
	private String dsUsuarioFechamento;

	@ToString.Include
	@Column(name="InTipoMovimento")
	private Integer inTipoMovimento; 

	@Column(name="InOrigemCadastro")
	private Integer inOrigemCadastro;

	@Column(name="CdGrupoConferente")
	private Integer cdGrupoConferente;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DtMovimento")
	private Calendar dtMovimento;
	
}
