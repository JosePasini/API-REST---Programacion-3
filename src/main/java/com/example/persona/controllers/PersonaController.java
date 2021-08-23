package com.example.persona.controllers;

/*
import com.example.persona.entities.Persona;
import com.example.persona.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
*/


import com.example.persona.entities.Persona;
import com.example.persona.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

    private PersonaServiceImpl personaServiceImpl;

    public PersonaController(PersonaServiceImpl personaServiceImpl){
        this.personaServiceImpl = personaServiceImpl;
    }


}


