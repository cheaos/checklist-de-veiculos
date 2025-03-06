package br.com.senior.chkbackend.domain.dto;


import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoginBean {
	
	@NonNull
	private String dsUsuario;
	
	private String error;
	
	public static LoginBean get(UsuarioBean usuario) {
		return new LoginBean(usuario.getDsUsuario());
	}
	
}
