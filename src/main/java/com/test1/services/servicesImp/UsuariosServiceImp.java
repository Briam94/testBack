package com.test1.services.servicesImp;

import com.test1.contans.Constans;
import com.test1.dto.UserDto;
import com.test1.entities.Usuario;
import com.test1.repositories.UsuarioRepository;
import com.test1.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UsuariosServiceImp implements UsuariosService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public String saveUser(UserDto user) {
        Usuario usuario = new Usuario(new Date(), null, user.getPass(), user.getUsuario());
        try {
            usuarioRepository.save(usuario);
        } catch (Exception e) {
            return Constans.Error;
        }
        return Constans.SUCCESSFUL;
    }
}
