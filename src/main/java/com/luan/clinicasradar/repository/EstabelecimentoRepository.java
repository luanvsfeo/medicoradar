package com.luan.clinicasradar.repository;

import com.luan.clinicasradar.domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento,String> {

    @Query(value = " SELECT * FROM estabelecimento",nativeQuery = true)
    Collection<Estabelecimento> buscarEstabelecimentosPorCdPLanoECdOperadora();
}