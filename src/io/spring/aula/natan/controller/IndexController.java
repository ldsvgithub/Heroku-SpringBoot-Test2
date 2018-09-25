package io.spring.aula.natan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.aula.natan.entity.Pessoa;

@RestController
public class IndexController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		Pessoa p1 = new Pessoa();
		p1.setNome("Leandro");
		p1.setEndereco("rua x numero y");
		return "Endpoint inicial " + p1.getNome() + p1.getEndereco();
	}
	
}
