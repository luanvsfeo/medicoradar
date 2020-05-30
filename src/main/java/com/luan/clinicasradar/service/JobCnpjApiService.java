package com.luan.clinicasradar.service;

import com.luan.clinicasradar.domain.EstabelecimentoApi;
import com.luan.clinicasradar.domain.EstabelecimentoInfo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Date;


@Component
public class JobCnpjApiService {

    private EstabelecimentoInfoService estabelecimentoInfoService;

    public JobCnpjApiService(EstabelecimentoInfoService estabelecimentoInfoService) {
        this.estabelecimentoInfoService = estabelecimentoInfoService;
    }

    @Scheduled(cron="0 0/1 * 1/1 * ?")
    public void buscarInformacoesNaApi(){

        EstabelecimentoInfo estabelecimento = estabelecimentoInfoService.buscarEstabelecimentoAntesDoJob();

        if(!ObjectUtils.isEmpty(estabelecimento.getCnpj())){
            RestTemplate restTemplate = new RestTemplate();

            String url = "https://www.receitaws.com.br/v1/cnpj/{cnpjClinica}";
            EstabelecimentoApi estabelecimentoApi = restTemplate.getForObject(url, EstabelecimentoApi.class,estabelecimento.getCnpj());
            estabelecimento.atualizar(estabelecimentoApi);
            estabelecimentoInfoService.atualizarAposJob(estabelecimento);
            System.out.println( new Date() + " - Estabelecimento atualizado - CNPJ:" + estabelecimento.getCnpj());
        }else{
            System.out.println( "Desativar o Job - Estabelecimentos atualizados");
        }
        // TODO - Criar job para converter cep em latitude e longitude
    }
}
