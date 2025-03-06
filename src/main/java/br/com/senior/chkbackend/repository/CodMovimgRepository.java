package br.com.senior.chkbackend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.senior.chkbackend.model.CODMOVIMG;

public interface CodMovimgRepository extends CrudRepository<CODMOVIMG, Integer> {

	@Query(nativeQuery=true,
			value="SELECT COALESCE(MAX(cdSeqImag),0) as cdSeqImag FROM CODMOVIMG"+
				  " WHERE cdSequencia = ?2"+
				  " AND cdEmpresa = ?1")	
	public Integer buscaSequencia(Integer cdEmpresa, Integer cdSequencia);	
}
