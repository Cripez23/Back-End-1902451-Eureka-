package com.microservice.oauth.service;

import com.microservice.commons.users.entity.Usuario;

public interface IUsuarioService {
    
    public Usuario findByUsername(String username);
}