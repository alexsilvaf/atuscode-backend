package com.atuscode.atuscodebackend.enums;

import lombok.Data;

public enum Autenticacao {

    ADMINISTRADOR(0, "ADMIN"),
    CLIENTE(1, "CLIENTE"),
    FUNCIONARIO(2, "FUNCIONARO");

    private Integer id;
    private String descricao;

    Autenticacao(Integer id, String descicao){
        this.id = id;
        this.descricao = descicao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
