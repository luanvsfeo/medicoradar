package com.luan.clinicasradar.repository;

import com.luan.clinicasradar.domain.EstabelecimentoInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EstabelecimentoInfoRepository extends JpaRepository<EstabelecimentoInfo, String> {

    @Query(value = "select * from clinicasradar.estabelecimento_info where situacao is null limit 1",nativeQuery = true)
    EstabelecimentoInfo findOneBeforeCnpjJob();

    @Query(value = "select * from clinicasradar.estabelecimento_info where latitude is null and situacao like 'ATIVA' and cnpj not in ('53894218000101','51102697000142') limit 1",nativeQuery = true)
    EstabelecimentoInfo findOneBeforeCoordsJob();

    @Query(value = "select * from clinicasradar.estabelecimento_info where cnpj in (SELECT cd_cnpj_estb_saude FROM clinicasradar.estabelecimento where cd_plano = :cd_plano and cd_operadora = :cd_operadora)",nativeQuery = true)
    Collection<EstabelecimentoInfo> findAllAfterJobByCdOperadoraAndCdPlano(@Param("cd_operadora") String cdOperadora, @Param("cd_plano") String cdPlano);
}
