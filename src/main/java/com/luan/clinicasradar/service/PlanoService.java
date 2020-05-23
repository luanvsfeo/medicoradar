package com.luan.clinicasradar.service;

import com.luan.clinicasradar.domain.Plano;
import com.luan.clinicasradar.repository.PlanoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PlanoService {

   private final  PlanoRepository planoRepository;


     PlanoService(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }

    public Collection<Plano> buscarPlanos(){
        return planoRepository.findAll();
    }

    public Collection<Plano> buscarPlanosPorId(String convenioId){
        return this.planoRepository.findPlanosByCdOperadora(convenioId);
    }
}
