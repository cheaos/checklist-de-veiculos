package br.com.senior.chkbackend.domain;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import br.com.senior.chkbackend.domain.dto.ProgOperacaoBean;
import br.com.senior.chkbackend.model.CODMOV;
import br.com.senior.chkbackend.repository.CodMovRepository;
import br.com.senior.chkbackend.repository.CodMovimgRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class programacaoOperacao {

	@Autowired
	private CodMovRepository codmovrepository;

	@Autowired
	private CodMovimgRepository codmovimgrep;		
	
	final StopWatch watch = new StopWatch();

	
	public ProgOperacaoBean buscaOperacao(ProgOperacaoBean progB, HttpServletResponse response) throws Exception {
		try {
			try {
				log.info("------ buscaOperacao ------");
				List<CODMOV> codmov = codmovrepository.buscaNrplacaOpAberta(progB.getNrPlaca(), progB.getInTipoOperacao());
				log.info("progB " +progB);			
				ProgOperacaoBean result = new ProgOperacaoBean();									
				if (codmov.isEmpty()) {
					result.setErro("Operação não encontrada!");
					log.info("------ Operação não encontrada! ------");				
					response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				} else {							
					Integer seq = codmovimgrep.buscaSequencia(codmov.get(0).getPk().getCdEmpresa(), codmov.get(0).getPk().getCdSequencia());				
					result.setCdEmpresa(codmov.get(0).getPk().getCdEmpresa());
					result.setCdSequencia(codmov.get(0).getPk().getCdSequencia());
					result.setNrPlaca(codmov.get(0).getNrPlaca());
					result.setInTipoOperacao(codmov.get(0).getInTipoMovimento());
					result.setCdSeqIMG(seq+1);				
				}				

				return result;			
			} catch (Exception e) {
				log.info("ERRO buscaOperacao " + e.getMessage());
				throw new Exception(e.getMessage());
			}

		} finally {           
            
		}
			
	}
}
