package com.atuscode.atuscodebackend.entity;

import com.atuscode.atuscodebackend.enums.Autenticacao;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String senha;
    private String email;
    private Autenticacao autenticacao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate datanascimento;

}
