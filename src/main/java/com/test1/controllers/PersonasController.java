package com.test1.controllers;

import com.test1.contans.Constans;
import com.test1.dto.PersonDto;
import com.test1.dto.UserDto;
import com.test1.entities.Persona;
import com.test1.services.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/persons")
@CrossOrigin("*")
public class PersonasController {

    @Autowired
    private PersonasService personasService;

    @GetMapping(Constans.FIND_ALL_PERSON)
    public ArrayList<Persona> findAllPersons() {
        System.out.println("person");
        return personasService.findAllPerson();
    }

    @PostMapping(Constans.ADD_PERSON)
    public String addUser(@RequestBody PersonDto newPerson) {
        return personasService.savePerson(newPerson);
    }

}
