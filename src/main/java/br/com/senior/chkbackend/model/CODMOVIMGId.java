package br.com.senior.chkbackend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CODMOVIMGId implements Serializable{

	@Column(name = "CdSequencia")
	private Integer cdSequencia;
	
	@Column(name = "CdEmpresa")
	private Integer cdEmpresa;		

	@Column(name = "CdSeqImag")
	private Integer cdSeqImag;		
}
