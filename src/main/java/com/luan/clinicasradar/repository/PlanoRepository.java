package com.luan.clinicasradar.repository;

import com.luan.clinicasradar.domain.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoRepository extends JpaRepository<Plano,String> {
}
