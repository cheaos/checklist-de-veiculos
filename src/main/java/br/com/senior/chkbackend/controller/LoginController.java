package br.com.senior.chkbackend.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.chkbackend.domain.Login;
import br.com.senior.chkbackend.domain.dto.LoginBean;
import br.com.senior.chkbackend.domain.dto.UsuarioBean;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private Login login;

	@PostMapping(path="")
	@CrossOrigin(origins = "*")
	public LoginBean login(@RequestBody UsuarioBean user, HttpServletResponse response) throws Exception {
		return login.validaUsuario(user, response);
	}

}
