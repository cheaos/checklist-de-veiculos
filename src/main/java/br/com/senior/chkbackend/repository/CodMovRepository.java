package br.com.senior.chkbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.senior.chkbackend.model.CODMOV;

public interface CodMovRepository extends CrudRepository<CODMOV, Integer> {
	
	@Query("Select s from CODMOV s   "+
			   " where s.nrPlaca         = ?1 "+			   
			   "   and s.inTipoMovimento = ?2 "+
			   "   and InOrigemCadastro  = 1  "+
			   "   and DtFechamento is null"+
			   " order by s.dtMovimento desc")
		public List<CODMOV> buscaNrplacaOpAberta(String nrPlaca, Integer inTipoMovimento);	

}
