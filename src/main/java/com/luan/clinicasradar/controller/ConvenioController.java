package com.luan.clinicasradar.controller;


import com.luan.clinicasradar.controller.urls.Urls;
import com.luan.clinicasradar.domain.Convenio;
import com.luan.clinicasradar.service.ConvenioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ConvenioController {

    private final ConvenioService convenioService;

    ConvenioController(ConvenioService convenioService){
        this.convenioService = convenioService;
    }

    @GetMapping(Urls.CONVENIO)
    public Collection<Convenio> getAll(){
        return  convenioService.buscarTodosConvenios();
    }


}
