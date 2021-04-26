package com.helloobjetivos.helloobjetivos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloObjetivosController {
	
	@GetMapping("/hello-objetivos")
	public String helloObejetivos () {
		return "Objetivos da aprendizagem:"
				+ "\n\tDesenvolver:"
				+ "\n\t\t•Trabalho em Equipe"
				+ "\n\t\t•Persistência"
				+ "\n\t\t•Responsabilidade Pessoal";
		
	}
	
	

}
