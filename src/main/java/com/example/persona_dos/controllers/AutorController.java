package com.example.persona_dos.controllers;

import com.example.persona_dos.entities.Autor;
import com.example.persona_dos.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path ="api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}