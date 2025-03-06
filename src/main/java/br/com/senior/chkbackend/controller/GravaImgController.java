package br.com.senior.chkbackend.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.chkbackend.domain.imgProgramacao;
import br.com.senior.chkbackend.domain.dto.ImagemBean;

@RestController
@RequestMapping("/gravaimg")
public class GravaImgController {

	@Autowired
	private imgProgramacao img;

	@PostMapping(path = "")
	public ImagemBean gravaimg(@RequestBody ImagemBean imagemBean, HttpServletResponse response) throws Exception {
		return img.gravaImgProgramacao(imagemBean, response);
	}

}
