package br.com.senior.chkbackend.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.chkbackend.domain.programacaoOperacao;
import br.com.senior.chkbackend.domain.dto.ProgOperacaoBean;

@RestController
@RequestMapping("/ProgOperacao")
public class ProgramacaoOperacaoController {

	@Autowired
	private programacaoOperacao programacaooperacao;

	@PostMapping(path="")
	public ProgOperacaoBean ficha(@RequestBody ProgOperacaoBean progB, HttpServletResponse response) throws Exception{
		return programacaooperacao.buscaOperacao(progB, response);
	}
}
