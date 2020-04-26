package com.luan.clinicasradar.controller;


import com.luan.clinicasradar.domain.Estabelecimento;
import com.luan.clinicasradar.service.EstabelecimentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoController {

    private final EstabelecimentoService estabelecimentoService;

    EstabelecimentoController(EstabelecimentoService estabelecimentoService){
        this.estabelecimentoService = estabelecimentoService;
    }


    @GetMapping("")
    public Collection<Estabelecimento> getAll(){
        return  estabelecimentoService.buscarTodosEstabelecimentos();
    }

    @GetMapping("/{cdOperadora}/{cdPlano}")
    public Collection<Estabelecimento> getByCdOperadoraECdPlano(@PathVariable("cdOperadora") String cdOperadora,@PathVariable("cdPlano") String cdPlano){
        return  estabelecimentoService.buscarTodosEstabelecimentos();
    }





}
