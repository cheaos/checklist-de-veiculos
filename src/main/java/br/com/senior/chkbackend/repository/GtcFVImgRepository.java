package br.com.senior.chkbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.senior.chkbackend.model.GTCFVIMG;
import br.com.senior.chkbackend.model.GTCFVIMGId;

@Repository
public interface GtcFVImgRepository extends JpaRepository<GTCFVIMG, GTCFVIMGId> {

	@Query(nativeQuery=true,
			value="SELECT COALESCE(MAX(cdSequencia),0) as cdSequencia FROM GTCFVimg"+
				  " WHERE nrFicha = ?2"+
				  " AND cdEmpresa = ?1")	
	public Integer buscaSequencia(Integer cdEmpresa, Integer nrFicha);
	
}
