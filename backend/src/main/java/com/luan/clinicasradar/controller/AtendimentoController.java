package com.luan.clinicasradar.controller;


import com.luan.clinicasradar.service.AtendimentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoController {

    private final AtendimentoService atendimentoService;

    AtendimentoController(AtendimentoService atendimentoService){
        this.atendimentoService = atendimentoService;
    }


    @GetMapping("")
    public String getAll(){
        return  null;
    }

}
