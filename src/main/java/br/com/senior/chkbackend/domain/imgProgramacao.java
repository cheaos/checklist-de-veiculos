package br.com.senior.chkbackend.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import br.com.senior.chkbackend.domain.dto.ImagemBean;
import br.com.senior.chkbackend.model.CODMOVIMG;
import br.com.senior.chkbackend.model.CODMOVIMGId;
import br.com.senior.chkbackend.repository.CodMovimgRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class imgProgramacao {

	@Value("${diretorio:C:/temp}")
	private String diretorio;
	
	@Autowired
	private CodMovimgRepository codmovimgrep;
	
	final StopWatch watch = new StopWatch();	
	
	public ImagemBean gravaImgProgramacao(ImagemBean imagemBean, HttpServletResponse response) throws Exception {
		try {
			try {						
				log.info("**gravaImgProgramacao**");
				
				//Busca diretório
				ImagemBean resp = geraImgDir(imagemBean, response);
				if (resp.getErro() == null) {
					CODMOVIMGId imgid = new CODMOVIMGId();
					imgid.setCdEmpresa(imagemBean.getCdEmpresa());
					imgid.setCdSequencia(imagemBean.getCdSequencia());
					Integer seq = codmovimgrep.buscaSequencia(imagemBean.getCdEmpresa(), imagemBean.getCdSequencia());									
					imgid.setCdSeqImag(seq+1);				
					CODMOVIMG img = new CODMOVIMG();
									
					img.setDsOrigem("CODWEB");
					img.setInTipoMovimento(resp.getInTipoMovimento());				
					img.setDsNomeArquivo(resp.getDsNomeArquivo());				
					img.setDsDiretorio(resp.getDsDiretorio());
					img.setDsUsuario(resp.getDsUsuario());
					img.setDsObservacao(resp.getDsObservacao());
					img.setDtMovimentacao(resp.getDtMovimentacao());							
					img.setPk(imgid);
					codmovimgrep.save(img);
				}
				return resp;
			} catch (Exception e) {
				log.trace("ERRO gravaImgManifesto " + e.getMessage());
				throw new Exception(e.getMessage());
			}			
		} finally {
            
		}
	}	
	
	public ImagemBean geraImgDir(ImagemBean imagemBean, HttpServletResponse response) {
		SimpleDateFormat formatar = new SimpleDateFormat("dd-MM-yyyy");		
		String dataFormatada = formatar.format(Calendar.getInstance().getTime());
		String operacao = imagemBean.getCdSequencia().toString();
		File dirDiario = new File(String.format("%4$s%1$s%2$s%3$s%4$s", diretorio, File.separator, dataFormatada,"\\"));
		
		ImagemBean result = new ImagemBean();								
		try {								
			if (!dirDiario.exists()) {				
				log.info("Criando Pasta Diária");					
				dirDiario.mkdir();
			}
			
			File dirDiario1 = new File(String.format("%4$s%1$s%2$s%3$s%4$s%5$s", diretorio, File.separator, dataFormatada,"\\", operacao));
			
			if (!dirDiario1.exists()) {				
				log.info("Criando Pasta Diária de operacao");					
				dirDiario1.mkdir();
			}
			
			File file = new File(dirDiario1 + "\\" + imagemBean.getDsNomeArquivo());				
			OutputStream os = new FileOutputStream(file);			
			os.write(imagemBean.getImgComprovante());
			os.close();
			result.setCdEmpresa(imagemBean.getCdEmpresa());
			result.setCdSequencia(imagemBean.getCdSequencia());
			result.setDsNomeArquivo(imagemBean.getDsNomeArquivo());
			result.setDsDiretorio(file.toString());
			result.setInTipoMovimento(imagemBean.getInTipoMovimento());
			result.setDsUsuario(imagemBean.getDsUsuario());
			result.setDsObservacao(imagemBean.getDsObservacao());
			result.setDtMovimentacao(LocalDateTime.now());
			return result;
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			result.setErro("Não foi possível gravar! dirDiario " + e.getMessage());
			log.info("**Não foi possível gravar! dirDiario **");			
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}			
		
		return result;
	}	
}
