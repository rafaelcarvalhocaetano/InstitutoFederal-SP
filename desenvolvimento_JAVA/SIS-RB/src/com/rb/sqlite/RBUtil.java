
package com.rb.sqlite;

import com.rb.util.*;

/**
 *
 * @author Rafael Carvalho Caetano
 */
public class RBUtil {
    /*
    setExtendedState(ICONIFIED); --> minimiza a tela
    
    setExtendedState(MAXIMIZED_BOTH); --> maximiza a tela
    
    diponse --> fecha somente o painel em uso
    
    System.exit(0); --> fecha o programa
    
    Padrão de Cores
    AZUL --> [51,51,51]
    
    
============================== SQLite ======================================
    
    CREATE TABLE login (
    id   INTEGER      PRIMARY KEY
                      NOT NULL,
    user VARCHAR (20) NOT NULL,
    pass VARCHAR (8)  NOT NULL
);

CREATE TABLE caminhaoRB (
    id          INTEGER      PRIMARY KEY
                             NOT NULL,
    cavalo      VARCHAR (8)  NOT NULL,
    carreta     VARCHAR (8),
    nome        VARCHAR (30),
    data        VARCHAR (10) NOT NULL,
    saida       VARCHAR (8),
    comosaida   VARCHAR (2),
    entrada     VARCHAR (8),
    comoentrada VARCHAR (2),
    destino     VARCHAR (30),
    lacre       VARCHAR (15) 
);

CREATE TABLE funcionarios (
    id      INTEGER      PRIMARY KEY
                         NOT NULL,
    nome    VARCHAR (30) NOT NULL,
    modelo  VARCHAR (20) NOT NULL,
    data    VARCHAR (12) NOT NULL,
    entrada VARCHAR (6),
    saida   VARCHAR (6),
    obs     VARCHAR (30) 
);

CREATE TABLE veiculoLeve (
    id        INTEGER      PRIMARY KEY
                           NOT NULL,
    nome      VARCHAR (30) NOT NULL,
    destino   VARCHAR (30) NOT NULL,
    data      VARCHAR (12),
    saida     VARCHAR (6),
    kmsaida   VARCHAR (20),
    entrada   VARCHAR (6),
    kmentrada VARCHAR (20),
    aut       VARCHAR (20) NOT NULL,
    obs       VARCHAR (50) 
);

CREATE TABLE chave (
    id            INTEGER      PRIMARY KEY
                               NOT NULL,
    nome          VARCHAR (30) NOT NULL,
    setor         VARCHAR (20) NOT NULL,
    data          VARCHAR (12),
    saida         VARCHAR (6),
    entrada       VARCHAR (6),
    datadevolucao VARCHAR (12),
    vigilante     VARCHAR (15) 
);

CREATE TABLE caminhaoTerceiro (
    id         INTEGER      PRIMARY KEY
                            NOT NULL,
    cavalo     VARCHAR (8),
    carreta    VARCHAR (12),
    nome       VARCHAR (50),
    data       VARCHAR (12) NOT NULL,
    entrada    VARCHAR (6),
    comoentrou VARCHAR (2),
    saida      VARCHAR (6),
    comosaida  VARCHAR (2),
    empresa    VARCHAR (30),
    rg         VARCHAR (13) 
);

CREATE TABLE visitantes (
    id      INTEGER      PRIMARY KEY
                         NOT NULL,
    placa   VARCHAR (8),
    modelo  VARCHAR (25),
    nome    VARCHAR (50) NOT NULL,
    rg      VARCHAR (15),
    empresa VARCHAR (25),
    entrada VARCHAR (6),
    saida   VARCHAR (6),
    data    VARCHAR (12) NOT NULL
);


==================== USER AND SENHA ===============================
	User  		PASS
	
	admin		admin
	portaria	12345
	direitajar	q1w2e3r4
	
*/ 
}
