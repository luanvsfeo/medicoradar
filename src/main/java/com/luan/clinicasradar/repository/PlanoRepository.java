package com.luan.clinicasradar.repository;

import com.luan.clinicasradar.domain.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PlanoRepository extends JpaRepository<Plano,String> {

    @Query(value = "SELECT * FROM PLANOS p WHERE p.registro_ans = :operadora_id",nativeQuery = true)
    Collection<Plano> findPlanosByCdOperadora(@Param("operadora_id") String operadora_id);
}
