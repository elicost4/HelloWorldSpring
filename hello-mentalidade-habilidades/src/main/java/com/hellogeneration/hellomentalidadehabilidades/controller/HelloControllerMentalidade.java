package com.hellogeneration.hellomentalidadehabilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloControllerMentalidade {
	
	@GetMapping("/mentalidades-habilidades")
	public String mentalidades() {
		return "Mentalidades usadas nessa atividadade:"
				+ "\n\t• Persistência"
				+ "\n\t• Mentalidade de Crescimento"
				+ "\n\nHabilidades usadas nessa atividade:"
				+ "\n\t• Trabalho em Equipe"
				+ "\n\t• Adaptabilidade";
		
	}

}
