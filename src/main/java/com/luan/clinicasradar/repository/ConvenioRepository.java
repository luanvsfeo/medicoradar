package com.luan.clinicasradar.repository;

import com.luan.clinicasradar.domain.Convenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvenioRepository extends JpaRepository<Convenio,String> {
}
