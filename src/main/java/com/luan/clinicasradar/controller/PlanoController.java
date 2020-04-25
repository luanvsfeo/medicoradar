package com.luan.clinicasradar.controller;

import com.luan.clinicasradar.domain.Plano;
import com.luan.clinicasradar.service.PlanoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("/plano")
public class PlanoController {


    private final PlanoService planoService;


    PlanoController (PlanoService planoService){
        this.planoService = planoService;
    }

    @GetMapping("/")
    public Collection<Plano> getAllPlanos(){
        return planoService.buscarPlanos();
    }

    @GetMapping("/convenio/{conveioId}")
    public Collection<Plano> getAllPlanosByConvenioId(@PathParam("conveioId") String conveioId){
        return planoService.buscarPlanosPorId(conveioId);
    }


}
