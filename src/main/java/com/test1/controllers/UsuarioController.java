package com.test1.controllers;

import com.test1.contans.Constans;
import com.test1.dto.UserDto;
import com.test1.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping(Constans.ADD_USER)
    public String addUser(@RequestBody UserDto newUser) {
        return usuariosService.saveUser(newUser);
    }
}
