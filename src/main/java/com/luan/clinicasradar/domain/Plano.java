package com.luan.clinicasradar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planos")
public class Plano {

    @Id
    private String idPlano;
    private String cdPlano;
    private String nomePlano;
    private String registroAns;
    private String razaoSocial;
    private String nomeFantasia;
    private String codigoModalidade;
    private String porteOperadora;
    private String vigenciaPlano;
    private String codigoContratacao;
    private String grupoContratacao;
    private String codigoSegmentacao;
    private String grupoSegmentacaoAssistencial;
    private String cobertura;
    private String tipoFinanciamento;
    private String codigoAbrangenciaCobertura;
    private String fatorModerador;
    private String logFatorModerador;
    private String acomodacaoHospitalar;
    private String idSituacaoPlano;
    private String dataSituacaoPlano;
    private String dataRegistroPlano;

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

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getRegistroAns() {
        return registroAns;
    }

    public void setRegistroAns(String registroAns) {
        this.registroAns = registroAns;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCodigoModalidade() {
        return codigoModalidade;
    }

    public void setCodigoModalidade(String codigoModalidade) {
        this.codigoModalidade = codigoModalidade;
    }

    public String getPorteOperadora() {
        return porteOperadora;
    }

    public void setPorteOperadora(String porteOperadora) {
        this.porteOperadora = porteOperadora;
    }

    public String getVigenciaPlano() {
        return vigenciaPlano;
    }

    public void setVigenciaPlano(String vigenciaPlano) {
        this.vigenciaPlano = vigenciaPlano;
    }

    public String getCodigoContratacao() {
        return codigoContratacao;
    }

    public void setCodigoContratacao(String codigoContratacao) {
        this.codigoContratacao = codigoContratacao;
    }

    public String getGrupoContratacao() {
        return grupoContratacao;
    }

    public void setGrupoContratacao(String grupoContratacao) {
        this.grupoContratacao = grupoContratacao;
    }

    public String getCodigoSegmentacao() {
        return codigoSegmentacao;
    }

    public void setCodigoSegmentacao(String codigoSegmentacao) {
        this.codigoSegmentacao = codigoSegmentacao;
    }

    public String getGrupoSegmentacaoAssistencial() {
        return grupoSegmentacaoAssistencial;
    }

    public void setGrupoSegmentacaoAssistencial(String grupoSegmentacaoAssistencial) {
        this.grupoSegmentacaoAssistencial = grupoSegmentacaoAssistencial;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getTipoFinanciamento() {
        return tipoFinanciamento;
    }

    public void setTipoFinanciamento(String tipoFinanciamento) {
        this.tipoFinanciamento = tipoFinanciamento;
    }

    public String getCodigoAbrangenciaCobertura() {
        return codigoAbrangenciaCobertura;
    }

    public void setCodigoAbrangenciaCobertura(String codigoAbrangenciaCobertura) {
        this.codigoAbrangenciaCobertura = codigoAbrangenciaCobertura;
    }

    public String getFatorModerador() {
        return fatorModerador;
    }

    public void setFatorModerador(String fatorModerador) {
        this.fatorModerador = fatorModerador;
    }

    public String getLogFatorModerador() {
        return logFatorModerador;
    }

    public void setLogFatorModerador(String logFatorModerador) {
        this.logFatorModerador = logFatorModerador;
    }

    public String getAcomodacaoHospitalar() {
        return acomodacaoHospitalar;
    }

    public void setAcomodacaoHospitalar(String acomodacaoHospitalar) {
        this.acomodacaoHospitalar = acomodacaoHospitalar;
    }

    public String getIdSituacaoPlano() {
        return idSituacaoPlano;
    }

    public void setIdSituacaoPlano(String idSituacaoPlano) {
        this.idSituacaoPlano = idSituacaoPlano;
    }

    public String getDataSituacaoPlano() {
        return dataSituacaoPlano;
    }

    public void setDataSituacaoPlano(String dataSituacaoPlano) {
        this.dataSituacaoPlano = dataSituacaoPlano;
    }

    public String getDataRegistroPlano() {
        return dataRegistroPlano;
    }

    public void setDataRegistroPlano(String dataRegistroPlano) {
        this.dataRegistroPlano = dataRegistroPlano;
    }
}
