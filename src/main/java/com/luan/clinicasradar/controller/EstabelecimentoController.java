package com.luan.clinicasradar.controller;


import com.luan.clinicasradar.controller.urls.Urls;
import com.luan.clinicasradar.domain.Estabelecimento;
import com.luan.clinicasradar.domain.EstabelecimentoInfo;
import com.luan.clinicasradar.service.EstabelecimentoInfoService;
import com.luan.clinicasradar.service.EstabelecimentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class EstabelecimentoController {

    private final EstabelecimentoService estabelecimentoService;
    private final EstabelecimentoInfoService estabelecimentoInfoService;

    public EstabelecimentoController(EstabelecimentoService estabelecimentoService, EstabelecimentoInfoService estabelecimentoInfoService) {
        this.estabelecimentoService = estabelecimentoService;
        this.estabelecimentoInfoService = estabelecimentoInfoService;
    }

    @GetMapping(Urls.ESTABELECIMENTOS_POR_PLANO_CONVENIO)
    public Collection<Estabelecimento> getByCdOperadoraECdPlano(@PathVariable("cdOperadora") String cdOperadora,@PathVariable("cdPlano") String cdPlano){
        return  estabelecimentoService.buscarPorCdOperadoraECdPlano(cdOperadora,cdPlano);
    }


    @GetMapping(Urls.ESTABELECIMENTOS)
    public Collection<EstabelecimentoInfo> getAll(){
        return  estabelecimentoInfoService.buscarTodas();
    }
}
