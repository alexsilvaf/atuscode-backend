package com.atuscode.atuscodebackend.services;

import com.atuscode.atuscodebackend.entity.Usuario;
import com.atuscode.atuscodebackend.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }
}
