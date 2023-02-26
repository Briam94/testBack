package com.test1.services.servicesImp;

import com.test1.contans.Constans;
import com.test1.dto.PersonDto;
import com.test1.entities.Persona;
import com.test1.entities.Usuario;
import com.test1.repositories.PersonaRepository;
import com.test1.services.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PersonasServiceImp implements PersonasService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public ArrayList<Persona> findAllPerson() {
        return (ArrayList<Persona>) personaRepository.findAll();
    }

    @Override
    public String savePerson(PersonDto newPerson) {
        Persona persona = new Persona(newPerson.getIdentificador(), newPerson.getApellidos(),
                newPerson.getEmail(), new Date(), newPerson.getNombres(),
                newPerson.getNumeroIdentificacion(), newPerson.getTipoIdentificacion());
        try {
            personaRepository.save(persona);
        } catch (Exception e) {
            return Constans.Error;
        }
        return Constans.SUCCESSFUL;
    }
}
