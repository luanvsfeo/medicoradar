package com.luan.clinicasradar.service;

import com.luan.clinicasradar.domain.EstabelecimentoInfo;
import com.luan.clinicasradar.repository.EstabelecimentoInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EstabelecimentoInfoService {

    private EstabelecimentoInfoRepository estabelecimentoInfoRepository;

    public EstabelecimentoInfoService(EstabelecimentoInfoRepository estabelecimentoInfoRepository) {
        this.estabelecimentoInfoRepository = estabelecimentoInfoRepository;
    }

    public Collection<EstabelecimentoInfo> buscarTodas(){
        return estabelecimentoInfoRepository.findAll();
    }

    public EstabelecimentoInfo buscarEstabelecimentoAntesDoJob(){
        return estabelecimentoInfoRepository.findOneBeforeJob();
    }

    public void atualizarAposJob(EstabelecimentoInfo estabelecimentoInfo){
        estabelecimentoInfoRepository.save(estabelecimentoInfo);
    }

    public Collection<EstabelecimentoInfo> buscarTodosPorPlanoEConvenio(String cdOperadora, String cdPlano){
        return estabelecimentoInfoRepository.findAllAfterJobByCdOperadoraAndCdPlano(cdOperadora,cdPlano);
    }
}
