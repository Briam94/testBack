package com.test1.services;

import com.test1.dto.PersonDto;
import com.test1.entities.Persona;

import java.util.ArrayList;

public interface PersonasService {
    ArrayList<Persona> findAllPerson();

    String savePerson(PersonDto newPerson);
}
