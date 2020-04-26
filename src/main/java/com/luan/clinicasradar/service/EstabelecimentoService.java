package com.luan.clinicasradar.service;

import com.luan.clinicasradar.domain.Estabelecimento;
import com.luan.clinicasradar.repository.EstabelecimentoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EstabelecimentoService {

    private EstabelecimentoRepository estabelecimentoRepository;

    public EstabelecimentoService(EstabelecimentoRepository estabelecimentoRepository) {
        this.estabelecimentoRepository = estabelecimentoRepository;
    }

    public Collection<Estabelecimento> buscarTodosEstabelecimentos(){
        return estabelecimentoRepository.findAll();
    }

    public Collection<Estabelecimento> buscarPorCdOperadoraECdPlano(){
        return estabelecimentoRepository.buscarEstabelecimentosPorCdPLanoECdOperadora();
    }

}
