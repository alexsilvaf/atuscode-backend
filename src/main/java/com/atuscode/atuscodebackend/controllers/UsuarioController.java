package com.atuscode.atuscodebackend.controllers;

import com.atuscode.atuscodebackend.entity.Usuario;
import com.atuscode.atuscodebackend.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    private List<Usuario> listarUsuarios(){
        return service.findAll();
    }
}
