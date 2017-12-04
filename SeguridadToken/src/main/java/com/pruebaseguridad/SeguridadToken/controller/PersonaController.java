package com.pruebaseguridad.SeguridadToken.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaseguridad.SeguridadToken.Persona;

@RestController
public class PersonaController {
	
	
	@GetMapping("/personas")
	public List<Persona> obtnerPersonas(){
		return Arrays.asList(new Persona("Fabio", "Martinez", 29));
	}

}
