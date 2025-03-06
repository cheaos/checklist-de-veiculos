package br.com.senior.chkbackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.senior.chkbackend.model.GTCFV;

public interface GtcFichaRepository extends JpaRepository<GTCFV, Integer> {	
	
	//**somente historicos que tenham permissão para foto**
	@Query(nativeQuery=true,
			value="SELECT a.nrFicha, a.cdEmpresa FROM GTCFV a "+
		   " WHERE a.nrFicha = ?2" +		   
		   "   AND a.cdEmpresa = ?1 ")
	public Optional<GTCFV> getFicha(Integer cdEmpresa, Integer nrFicha);
	
}
