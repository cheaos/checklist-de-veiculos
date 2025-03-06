package br.com.senior.chkbackend.domain;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.internal.SessionImpl;
import org.springframework.stereotype.Component;

import br.com.senior.chkbackend.domain.dto.LoginBean;
import br.com.senior.chkbackend.domain.dto.UsuarioBean;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class Login {

	@PersistenceContext
    private EntityManager em;
	
	private Integer criptografa(String dsSenha) {
		Integer peso = 1;
		Integer nrSenhaCripto  = 0;
		for(Byte c: dsSenha.toUpperCase().getBytes()) {
			nrSenhaCripto += c.byteValue()*peso;
			peso++;
		}
		return nrSenhaCripto*100;
	}

	public LoginBean validaUsuario(UsuarioBean user, HttpServletResponse response) throws Exception{
		try {
			log.trace("* validaUsuario *");			
			String dialeto = ((SessionImpl) em.getDelegate()).getSessionFactory().getJdbcServices().getDialect().getClass().getSimpleName(); 
			String operador = ".";
			if (dialeto.equals("SQLServer2012Dialect")) {
				operador = "..";
			}
			
			Query query = em.createNativeQuery("select NrSenha from softrancfg"+operador+"sofusu where DsApelido = :dsApelido");	
			query.setParameter("dsApelido", user.getDsUsuario());
			Integer resultSenha = (Integer)query.getSingleResult();		
			if (resultSenha.equals(criptografa(user.getNrSenha()))){
				UsuarioBean usuario = new UsuarioBean();
				usuario.setDsUsuario(user.getDsUsuario());
				usuario.setNrSenha(user.getNrSenha());
				LoginBean result = LoginBean.get(usuario); 					 
				return result;
				}
			else {	 
				LoginBean result = new LoginBean("");
				result.setError("Usuario ou Senha Invalido!");
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				return result;
			}
						
		} catch (Exception e) {
			log.trace("ERRO validaUsuario" + e.getMessage());
			throw new Exception(e.getMessage());
		}

	}
}

