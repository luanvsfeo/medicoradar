package com.luan.clinicasradar.service;

import com.luan.clinicasradar.domain.EstabelecimentoApi;
import com.luan.clinicasradar.domain.EstabelecimentoInfo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Date;


@Component
public class JobService {

    private EstabelecimentoInfoService estabelecimentoInfoService;

    public JobService(EstabelecimentoInfoService estabelecimentoInfoService) {
        this.estabelecimentoInfoService = estabelecimentoInfoService;
    }


    /**
    * Retirada do Job de atualização dos cnpjs
    * */

   /* @Scheduled(cron="0 0/1 * 1/1 * ?")
    public void buscarInformacoesNaApi(){

        EstabelecimentoInfo estabelecimento = estabelecimentoInfoService.buscarEstabelecimentoAntesDoCnpjJob();

        if(!ObjectUtils.isEmpty(estabelecimento.getCnpj())){
            RestTemplate restTemplate = new RestTemplate();

            String url = "https://www.receitaws.com.br/v1/cnpj/{cnpjClinica}";
            EstabelecimentoApi estabelecimentoApi = restTemplate.getForObject(url, EstabelecimentoApi.class,estabelecimento.getCnpj());
            estabelecimento.atualizarApiCnpj(estabelecimentoApi);
            estabelecimentoInfoService.atualizarAposJob(estabelecimento);
            System.out.println( new Date() + " - Estabelecimento atualizado - CNPJ:" + estabelecimento.getCnpj());
        }else{
            System.out.println( "Desativar o Job - Estabelecimentos atualizados");
        }
    }*/


    /*@Scheduled(cron="0/10 0/1 * 1/1 * ?")
    public void buscarCoordenadasNaApi(){

        EstabelecimentoInfo estabelecimento = estabelecimentoInfoService.buscarEstabelecimentoAntesDoCoordsJob();

        if(!StringUtils.isEmpty(estabelecimento.getLatitude())){
            estabelecimento.atualizaPossuiCoord();
            estabelecimentoInfoService.atualizarAposJob(estabelecimento);
            System.out.println("Atualizada a flag - Cnpj:" + estabelecimento.getCnpj() + " - CEP :" + estabelecimento.getCep());
            return;
        }

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders  = new HttpHeaders();
        httpHeaders.set("Authorization","Token token=31cc4d1144035503139de8033fc067f9");

        HttpEntity<String> entity = new HttpEntity("body", httpHeaders);

        String url = "https://www.cepaberto.com/api/v3/cep";

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("cep", estabelecimento.getCep().replace(".","").replace("-",""));

        ResponseEntity<EstabelecimentoApi> estabelecimentoApi = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                EstabelecimentoApi.class);

        estabelecimento.atualizarCoords(estabelecimentoApi.getBody());
        estabelecimentoInfoService.atualizarAposJob(estabelecimento);

        System.out.println("Coords : Estabelecimento atualizado - Cnpj:" + estabelecimento.getCnpj() + " - CEP :" + estabelecimento.getCep());
    }*/
}
