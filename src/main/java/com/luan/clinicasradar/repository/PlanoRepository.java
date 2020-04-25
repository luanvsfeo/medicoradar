package com.luan.clinicasradar.repository;

import com.luan.clinicasradar.domain.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PlanoRepository extends JpaRepository<Plano,String> {

    @Query(name = "",nativeQuery = true)
    Collection<Plano> findPlanosByCdOperadora(String cdOperacora);
}
