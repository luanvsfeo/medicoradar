package com.luan.clinicasradar.repository;

import com.luan.clinicasradar.domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento,String> {

    @Query(value = " SELECT * FROM estabelecimento where cd_operadora  = :cd_operadora AND cd_plano = :cd_plano",nativeQuery = true)
    Collection<Estabelecimento> buscarEstabelecimentosPorCdPLanoECdOperadora(@Param("cd_operadora") String cdOperadora, @Param("cd_plano") String cdPlano);
}