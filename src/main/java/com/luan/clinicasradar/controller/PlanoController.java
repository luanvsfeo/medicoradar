package com.luan.clinicasradar.controller;

import com.luan.clinicasradar.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/plano")
public class PlanoController {


    private final PlanoService planoService;


    PlanoController (PlanoService planoService){
        this.planoService = planoService;
    }

    @GetMapping("/")
    public String getAllPlanos(){
       String a =  planoService.buscarPlanos();
        return a;
    }

    @GetMapping("/convenio/{conveioId}")
    public String getAllPlanosByConvenioId(@PathParam("conveioId") int conveioId){
        return "";
    }


}
