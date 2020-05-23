package com.luan.clinicasradar.controller;

import com.luan.clinicasradar.controller.urls.Urls;
import com.luan.clinicasradar.domain.Plano;
import com.luan.clinicasradar.service.PlanoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
public class PlanoController {


    private final PlanoService planoService;


    PlanoController (PlanoService planoService){
        this.planoService = planoService;
    }

    @GetMapping(Urls.PLANOS_POR_CONVENIO)
    public Collection<Plano> getAllPlanosByConvenioId(@PathVariable("convenioId") String convenioId){
        return planoService.buscarPlanosPorId(convenioId);
    }

}
