package com.luan.clinicasradar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estabelecimento")
public class Estabelecimento {

    @Id
    private String idRede;

    private String cdOperadora;

    private String nmPrazo;

    private String dsClassificacao;

    private String dePorte;

    private String idPlano;

    private String cdPlano;

    private String Contratacao;

    private String deTipoContratacao;

    private String deTipoModalidadeFinm;

    private String SegmentacaoAssistencial;

    private String deTipoAbrangenciaGeografica;

    private String lgFatorModerador;

    private String deSituacaoPrincipal;

    private String idEstabelecimentoSaude;

    private String cdCnpjEstbSaude;

    private String cdCnes;

    private String nmEstabelecimentoSaude;

    private String deClasEstbSaude;

    private String lgUrgenciaEmergencia;

    private String deTipoPrestador;

    private String deTipoContrato;

    private String deDisponibilidade;

    private String cdMunicipio;

    @Column(name = "nm_municipio_x")
    private String nmMunicipiox;

    private String sgUf;

    private String dtVinculoInicio;

    private String dtVinculoFim;

    private String nmRegiao;

    public String getIdRede() {
        return idRede;
    }

    public void setIdRede(String idRede) {
        this.idRede = idRede;
    }

    public String getCdOperadora() {
        return cdOperadora;
    }

    public void setCdOperadora(String cdOperadora) {
        this.cdOperadora = cdOperadora;
    }

    public String getNmPrazo() {
        return nmPrazo;
    }

    public void setNmPrazo(String nmPrazo) {
        this.nmPrazo = nmPrazo;
    }

    public String getDsClassificacao() {
        return dsClassificacao;
    }

    public void setDsClassificacao(String dsClassificacao) {
        this.dsClassificacao = dsClassificacao;
    }

    public String getDePorte() {
        return dePorte;
    }

    public void setDePorte(String dePorte) {
        this.dePorte = dePorte;
    }

    public String getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(String idPlano) {
        this.idPlano = idPlano;
    }

    public String getCdPlano() {
        return cdPlano;
    }

    public void setCdPlano(String cdPlano) {
        this.cdPlano = cdPlano;
    }

    public String getContratacao() {
        return Contratacao;
    }

    public void setContratacao(String contratacao) {
        Contratacao = contratacao;
    }

    public String getDeTipoContratacao() {
        return deTipoContratacao;
    }

    public void setDeTipoContratacao(String deTipoContratacao) {
        this.deTipoContratacao = deTipoContratacao;
    }

    public String getDeTipoModalidadeFinm() {
        return deTipoModalidadeFinm;
    }

    public void setDeTipoModalidadeFinm(String deTipoModalidadeFinm) {
        this.deTipoModalidadeFinm = deTipoModalidadeFinm;
    }

    public String getSegmentacaoAssistencial() {
        return SegmentacaoAssistencial;
    }

    public void setSegmentacaoAssistencial(String segmentacaoAssistencial) {
        SegmentacaoAssistencial = segmentacaoAssistencial;
    }

    public String getDeTipoAbrangenciaGeografica() {
        return deTipoAbrangenciaGeografica;
    }

    public void setDeTipoAbrangenciaGeografica(String deTipoAbrangenciaGeografica) {
        this.deTipoAbrangenciaGeografica = deTipoAbrangenciaGeografica;
    }

    public String getLgFatorModerador() {
        return lgFatorModerador;
    }

    public void setLgFatorModerador(String lgFatorModerador) {
        this.lgFatorModerador = lgFatorModerador;
    }

    public String getDeSituacaoPrincipal() {
        return deSituacaoPrincipal;
    }

    public void setDeSituacaoPrincipal(String deSituacaoPrincipal) {
        this.deSituacaoPrincipal = deSituacaoPrincipal;
    }

    public String getIdEstabelecimentoSaude() {
        return idEstabelecimentoSaude;
    }

    public void setIdEstabelecimentoSaude(String idEstabelecimentoSaude) {
        this.idEstabelecimentoSaude = idEstabelecimentoSaude;
    }

    public String getCdCnpjEstbSaude() {
        return cdCnpjEstbSaude;
    }

    public void setCdCnpjEstbSaude(String cdCnpjEstbSaude) {
        this.cdCnpjEstbSaude = cdCnpjEstbSaude;
    }

    public String getCdCnes() {
        return cdCnes;
    }

    public void setCdCnes(String cdCnes) {
        this.cdCnes = cdCnes;
    }

    public String getNmEstabelecimentoSaude() {
        return nmEstabelecimentoSaude;
    }

    public void setNmEstabelecimentoSaude(String nmEstabelecimentoSaude) {
        this.nmEstabelecimentoSaude = nmEstabelecimentoSaude;
    }

    public String getDeClasEstbSaude() {
        return deClasEstbSaude;
    }

    public void setDeClasEstbSaude(String deClasEstbSaude) {
        this.deClasEstbSaude = deClasEstbSaude;
    }

    public String getLgUrgenciaEmergencia() {
        return lgUrgenciaEmergencia;
    }

    public void setLgUrgenciaEmergencia(String lgUrgenciaEmergencia) {
        this.lgUrgenciaEmergencia = lgUrgenciaEmergencia;
    }

    public String getDeTipoPrestador() {
        return deTipoPrestador;
    }

    public void setDeTipoPrestador(String deTipoPrestador) {
        this.deTipoPrestador = deTipoPrestador;
    }

    public String getDeTipoContrato() {
        return deTipoContrato;
    }

    public void setDeTipoContrato(String deTipoContrato) {
        this.deTipoContrato = deTipoContrato;
    }

    public String getDeDisponibilidade() {
        return deDisponibilidade;
    }

    public void setDeDisponibilidade(String deDisponibilidade) {
        this.deDisponibilidade = deDisponibilidade;
    }

    public String getCdMunicipio() {
        return cdMunicipio;
    }

    public void setCdMunicipio(String cdMunicipio) {
        this.cdMunicipio = cdMunicipio;
    }

    public String getNmMunicipiox() {
        return nmMunicipiox;
    }

    public void setNmMunicipiox(String nmMunicipiox) {
        this.nmMunicipiox = nmMunicipiox;
    }

    public String getSgUf() {
        return sgUf;
    }

    public void setSgUf(String sgUf) {
        this.sgUf = sgUf;
    }

    public String getDtVinculoInicio() {
        return dtVinculoInicio;
    }

    public void setDtVinculoInicio(String dtVinculoInicio) {
        this.dtVinculoInicio = dtVinculoInicio;
    }

    public String getDtVinculoFim() {
        return dtVinculoFim;
    }

    public void setDtVinculoFim(String dtVinculoFim) {
        this.dtVinculoFim = dtVinculoFim;
    }

    public String getNmRegiao() {
        return nmRegiao;
    }

    public void setNmRegiao(String nmRegiao) {
        this.nmRegiao = nmRegiao;
    }
}
