package com.luan.clinicasradar.repository;

import com.luan.clinicasradar.domain.EstabelecimentoInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoInfoRepository extends JpaRepository<EstabelecimentoInfo, String> {

    @Query(value = "select * from estabelecimento_info where situacao is null limit 1",nativeQuery = true)
    EstabelecimentoInfo findOneBeforeJob();

}
