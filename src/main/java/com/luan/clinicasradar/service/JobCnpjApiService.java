package com.luan.clinicasradar.service;

import com.luan.clinicasradar.domain.EstabelecimentoApi;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class JobCnpjApiService {


    @Scheduled(cron="0 0/1 * 1/1 * ?")
    public void buscarInformacoesNaApi(){
         //RestTemplate restTemplate = new RestTemplate();

        //String url = "https://www.receitaws.com.br/v1/cnpj/45615309000124";
        //String url = "https://www.receitaws.com.br/v1/cnpj/{cnpjClinica}";
        //EstabelecimentoApi estabelecimentoApi = restTemplate.getForObject(url, EstabelecimentoApi.class);

        // TODO - Colocar para buscar todas os estabelecimentos que não possuem o campo logradouro
        // TODO - Criar job para converter cep em latitude e longitude


    }
}
