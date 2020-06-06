package com.luan.clinicasradar.domain;

import com.sun.istack.Nullable;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estabelecimento_info")
public class EstabelecimentoInfo {

    @Id
    private String cnpj;

    @Nullable
    private String nome;

    @Nullable
    private String uf;

    @Nullable
    private String bairro;

    @Nullable
    private String logradouro;

    @Nullable
    private String cep;

    @Nullable
    private String municipio;

    @Nullable
    private String numero;

    @Nullable
    private String fantasia;

    @Nullable
    private String telefone;

    @Nullable
    private String situacao;

    @Nullable
    private String latitude;

    @Nullable
    private String longitude;

    @Nullable
    @Column(name = "possui_coords")
    private String possuiCoords;


    public EstabelecimentoInfo() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getLatitude() { return latitude;  }

    public void setLatitude(String latitude) {  this.latitude = latitude;  }

    public String getLongitude() {  return longitude;  }

    public void setLongitude(String longitude) {  this.longitude = longitude;  }

    public String getPossuiCoords() {
        return possuiCoords;
    }

    public void setPossuiCoords(String possuiCoords) {
        this.possuiCoords = possuiCoords;
    }

    public void atualizarApiCnpj(EstabelecimentoApi estabelecimentoApi){
        this.nome = estabelecimentoApi.getNome();
        this.bairro = estabelecimentoApi.getBairro();
        this.cep = estabelecimentoApi.getCep();
        this.fantasia = estabelecimentoApi.getFantasia();
        this.logradouro = estabelecimentoApi.getLogradouro();
        this.numero = estabelecimentoApi.getNumero();
        this.municipio = estabelecimentoApi.getMunicipio();
        this.telefone = estabelecimentoApi.getTelefone();
        this.uf = estabelecimentoApi.getUf();
        this.situacao = estabelecimentoApi.getSituacao();
    }

    public void atualizarCoords(EstabelecimentoApi estabelecimentoApi){
        if(StringUtils.isEmpty(estabelecimentoApi.getLatitude())){
            this.possuiCoords = "NAO";
        }else{
            this.latitude = estabelecimentoApi.getLatitude();
            this.longitude = estabelecimentoApi.getLongitude();
            this.possuiCoords= "SIM";
        }
    }

    public void atualizaPossuiCoord(){
        this.possuiCoords = "SIM";
    }
}
