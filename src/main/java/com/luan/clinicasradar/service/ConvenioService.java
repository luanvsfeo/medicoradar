package com.luan.clinicasradar.service;

import com.luan.clinicasradar.domain.Convenio;
import com.luan.clinicasradar.repository.ConvenioRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ConvenioService {

    private ConvenioRepository convenioRepository;

    public ConvenioService(ConvenioRepository convenioRepository) {
        this.convenioRepository = convenioRepository;
    }

    public Collection<Convenio> buscarTodosConvenios(){
        return convenioRepository.findAll();
    }
}
