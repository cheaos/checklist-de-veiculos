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
public class GTCFVId implements Serializable{
	
	@Column(name = "CdEmpresa")
	private Integer cdEmpresa;
	
	@Column(name = "NrFicha")
	private Integer nrFicha;

}
