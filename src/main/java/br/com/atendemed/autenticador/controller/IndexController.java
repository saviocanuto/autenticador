package br.com.atendemed.autenticador.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "Aplicação iniciaaaaaaada!";
    }
	
}
