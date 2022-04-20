package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
	
	@RequestMapping(value="/lista-movimenti", method = RequestMethod.GET)
	public String listaMovimenti() {
		return "lista_movimenti";
	}

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/prelevamento", method = RequestMethod.GET)
	public String prelevamento() {
		return "prelevamento";
	}
	
	@RequestMapping(value="/versamento", method = RequestMethod.GET)
	public String versamento() {
		return "versamento";
	}
	
	
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax";
	}
	
}
