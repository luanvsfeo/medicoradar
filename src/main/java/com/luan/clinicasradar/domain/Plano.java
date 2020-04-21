package com.luan.clinicasradar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planos")
public class Plano {
    @Id
    private String id;
    private String codigoPlano;
    private String nomePlano;

}
