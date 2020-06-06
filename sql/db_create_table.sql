create table planos_convenios(
	PLANO_DT                        varchar(255) null,
	ID_NOTA                         varchar(255) not null,
	CD_OPERADORA                    varchar(255) null,
	ID_PLANO                        varchar(255) null,
	CD_PLANO                        varchar(255) null,
	CD_NOTA                         varchar(255) null,
	DT_NTRP                         date null,
	ID_ABRG                         varchar(255) null,
	NM_ARQV                         varchar(255) null,
	NO_RAZAO                        varchar(255) null,
	CD_GRUPO_CLASSIFICACAO          varchar(255) null,
	DS_CLASSIFICACAO                varchar(255) null,
	IN_SITUACAO                     varchar(255) null,
	COBERTURA                       varchar(255) null,
	TP_VIGENCIA_PLANO               varchar(255) null,
	SGMT_ASSISTEN                   varchar(255) null,
	ID_TIPO_SEGMENTACAO             varchar(255) null,
	DE_TIPO_SEGMENTACAO             varchar(255) null,
	ID_TIPO_CONTRATACAO             varchar(255) null,
	DE_TIPO_CONTRATACAO             varchar(255) null,
	DE_TIPO_MODALIDADE_FINM         varchar(255) null,
	ID_TIPO_ABRANGENCIA             varchar(255) null,
	DE_TIPO_ABRANGENCIA_GEOGRAFICA  varchar(255) null,
	LG_FATOR_MODERADOR              varchar(255) null,
	DE_FATOR_MODERADOR              varchar(255) null,
	ACOMODACAO                      varchar(255) null,
	constraint pk_planos_convenios primary key(ID_NOTA)
);


CREATE TABLE convenios(
  Registro_ANS        varchar(240)   NULL ,
  CNPJ                varchar(240)   null,
  Razao_Social        VARCHAR(240)  null,
  Nome_Fantasia       VARCHAR(240),
  Modalidade          VARCHAR(280)  null,
  Logradouro          VARCHAR(240)  null,
  Numero              VARCHAR(230)  null,
  Complemento         VARCHAR(240),
  Bairro              VARCHAR(240),
  Cidade              VARCHAR(230)  null,
  UF                  VARCHAR(23)  null,
  CEP                 integer    null,
  DDD                 integer ,
  Telefone            VARCHAR(220),
  Fax                 VARCHAR(220),
  Endereco_eletronico VARCHAR(255),
  Representante       VARCHAR(250)  null,
  Cargo_Representante VARCHAR(240),
  Regiao_Atuacao      INTEGER null,
  Data_Registro_ANS   DATE   null,
  constraint pk_convenios primary key (Registro_ANS)
);


CREATE TABLE planos (
	id_plano                        varchar(300) NOT NULL,
	cd_plano                        varchar(300) NULL,
	nome_plano                      varchar(300) NULL,
	registro_ans                    varchar(300) NULL,
	razao_social                    varchar(300) NULL,
	nome_fantasia                   varchar(300) NULL,
	codigo_modalidade               varchar(300) NULL,
	porte_operadora                 varchar(300) NULL,
	vigencia_plano                  varchar(300) NULL,
	codigo_contratacao              varchar(300) NULL,
	grupo_contratacao               varchar(300) NULL,
	codigo_segmentacao              varchar(300) NULL,
	grupo_segmentacao_assistencial  varchar(300) NULL,
	cobertura                       varchar(300) NULL,
	tipo_financiamento              varchar(300) NULL,
	codigo_abrangencia_cobertura    varchar(300) NULL,
	fator_moderador                 varchar(300) NULL,
	log_fator_moderador             varchar(300) NULL,
	acomodacao_hospitalar           varchar(300) NULL,
	id_situacao_plano               varchar(300) NULL,
	data_situacao_plano             varchar(300) NULL,
	data_registro_plano             varchar(300) NULL,
	CONSTRAINT pk_plano PRIMARY KEY (id_plano)
);


create table estabelecimento(
	ID_REDE                         varchar(255) not null,
	CD_OPERADORA                    varchar(255) null,
	NM_PRAZO                        varchar(255) null,
	DS_CLASSIFICACAO                varchar(255) null,
	DE_PORTE                        varchar(255) null,
	ID_PLANO                        varchar(255) null,
	CD_PLANO                        varchar(255) null,
	CONTRATACAO                     varchar(255) null,
	DE_TIPO_CONTRATACAO             varchar(255) null,
	DE_TIPO_MODALIDADE_FINM         varchar(255) null,
	SEGMENTACAO_ASSISTENCIAL        varchar(255) null,
	DE_TIPO_ABRANGENCIA_GEOGRAFICA  varchar(255) null,
	LG_FATOR_MODERADOR              varchar(255) null,
	DE_SITUACAO_PRINCIPAL           varchar(255) null,
	ID_ESTABELECIMENTO_SAUDE        varchar(255) null,
	CD_CNPJ_ESTB_SAUDE              varchar(255) null,
	CD_CNES                         varchar(255) null,
	NM_ESTABELECIMENTO_SAUDE        varchar(255) null,
	DE_CLAS_ESTB_SAUDE              varchar(255) null,
	LG_URGENCIA_EMERGENCIA          varchar(255) null,
	DE_TIPO_PRESTADOR               varchar(255) null,
	DE_TIPO_CONTRATO                varchar(255) null,
	DE_DISPONIBILIDADE              varchar(255) null,
	CD_MUNICIPIO                    varchar(255) null,
	NM_MUNICIPIO_X                  varchar(255) null,
	SG_UF                           varchar(255) null,
	DT_VINCULO_INICIO               varchar(255) null,
	DT_VINCULO_FIM                  varchar(255) null,
	NM_REGIAO                       varchar(255) null,
	constraint pk_estabelecimento primary key (ID_REDE)
);




---------------------------- comparar com os acima -------------------------
CREATE TABLE convenios(
  Registro_ANS        varchar(240)   NULL ,
  CNPJ                varchar(240)   null,
  Razao_Social        VARCHAR(240)  null,
  Nome_Fantasia       VARCHAR(240),
  Modalidade          VARCHAR(280)  null,
  Logradouro          VARCHAR(240)  null,
  Numero              VARCHAR(230)  null,
  Complemento         VARCHAR(240),
  Bairro              VARCHAR(240),
  Cidade              VARCHAR(230)  null,
  UF                  VARCHAR(23)  null,
  CEP                	integer    null,
  DDD                 integer ,
  Telefone            VARCHAR(220),
  Fax                 VARCHAR(220),
  Endereco_eletronico VARCHAR(255),
  Representante       VARCHAR(250)  null,
  Cargo_Representante VARCHAR(240),
  Regiao_Atuacao   INTEGER null,
  Data_Registro_ANS   DATE   null,
  constraint pk_convenios primary key (Registro_ANS)
);

create table planos_convenios(
	PLANO_DT varchar(255) null,
	ID_NOTA varchar(255) not null,
	CD_OPERADORA varchar(255) null,
	ID_PLANO varchar(255) null,
	CD_PLANO varchar(255) null,
	CD_NOTA varchar(255) null,
	DT_NTRP date null,
	ID_ABRG varchar(255) null,
	NM_ARQV varchar(255) null,
	NO_RAZAO varchar(255) null,
	CD_GRUPO_CLASSIFICACAO varchar(255) null,
	DS_CLASSIFICACAO varchar(255) null,
	IN_SITUACAO varchar(255) null,
	COBERTURA varchar(255) null,
	TP_VIGENCIA_PLANO varchar(255) null,
	SGMT_ASSISTEN varchar(255) null,
	ID_TIPO_SEGMENTACAO varchar(255) null,
	DE_TIPO_SEGMENTACAO varchar(255) null,
	ID_TIPO_CONTRATACAO varchar(255) null,
	DE_TIPO_CONTRATACAO varchar(255) null,
	DE_TIPO_MODALIDADE_FINM varchar(255) null,
	ID_TIPO_ABRANGENCIA varchar(255) null,
	DE_TIPO_ABRANGENCIA_GEOGRAFICA varchar(255) null,
	LG_FATOR_MODERADOR varchar(255) null,
	DE_FATOR_MODERADOR varchar(255) null,
	ACOMODACAO varchar(255) null,
	constraint pk_planos_convenios primary key(ID_NOTA)
);

create table estabelecimento(
	ID_REDE  varchar(255) null,
	CD_OPERADORA varchar(255) null,
	NM_PRAZO varchar(255) null,
	DS_CLASSIFICACAO varchar(255) null,
	DE_PORTE varchar(255) null,
	ID_PLANO varchar(255) null,
	CD_PLANO varchar(255) null,
	CONTRATACAO varchar(255) null,
	DE_TIPO_CONTRATACAO varchar(255) null,
	DE_TIPO_MODALIDADE_FINM varchar(255) null,
	SEGMENTACAO_ASSISTENCIAL varchar(255) null,
	DE_TIPO_ABRANGENCIA_GEOGRAFICA varchar(255) null,
	LG_FATOR_MODERADOR varchar(255) null,
	DE_SITUACAO_PRINCIPAL varchar(255) null,
	ID_ESTABELECIMENTO_SAUDE varchar(255) null,
	CD_CNPJ_ESTB_SAUDE varchar(255) null,
	CD_CNES varchar(255) null,
	NM_ESTABELECIMENTO_SAUDE varchar(255) null,
	DE_CLAS_ESTB_SAUDE varchar(255) null,
	LG_URGENCIA_EMERGENCIA varchar(255) null,
	DE_TIPO_PRESTADOR varchar(255) null,
	DE_TIPO_CONTRATO varchar(255) null,
	DE_DISPONIBILIDADE varchar(255) null,
	CD_MUNICIPIO varchar(255) null,
	NM_MUNICIPIO_X varchar(255) null,
	SG_UF varchar(255) null,
	DT_VINCULO_INICIO varchar(255) null,
	DT_VINCULO_FIM varchar(255) null,
	NM_REGIAO varchar(255) null,
	constraint pk_estabelecimento primary key (ID_REDE)
);


create table estabelecimento_info(
	cnpj		varchar(14)     not null,
	nome 		varchar(255)    null,
	fantasia	varchar(255)    null,
	uf 			varchar(2)      null,
	municipio 	varchar(50)     null,
	bairro 		varchar(50)     null,
	logradouro 	varchar(255)    null,
	numero 		varchar(10)	    null,
	complemento varchar(255)    null,
	cep 		varchar(10)     null,
	latitude 	varchar(10)     null,
	longitude 	varchar(10)     null,
	telefone	varchar(60)     null,
	situacao	varchar(20)     null,
	constraint pk_cnpj primary key(cnpj)
);


----------------- script para popular a tabela de info com cnpj ---------------------
insert into estabelecimento_info(cnpj)
select distinct cd_cnpj_estb_saude from estabelecimento

------------
ALTER TABLE clinicasradar.estabelecimento_info ALTER COLUMN latitude TYPE varchar(20) USING latitude::varchar;
ALTER TABLE clinicasradar.estabelecimento_info ALTER COLUMN longitude TYPE varchar(20) USING longitude::varchar;
