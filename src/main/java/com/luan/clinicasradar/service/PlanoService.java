package com.luan.clinicasradar.service;

import com.luan.clinicasradar.repository.PlanoRepository;
import org.springframework.stereotype.Service;

@Service
public class PlanoService {

   private final  PlanoRepository planoRepository;


    public PlanoService(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }

    public String buscarPlanos(){
        return "puta que pariu";
    }

    public String buscarPlanosPorId(int convenioId){
        return null;
    }
}
