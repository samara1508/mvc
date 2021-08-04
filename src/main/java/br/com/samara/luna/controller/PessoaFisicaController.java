package br.com.samara.luna.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.samara.luna.model.PessoaFisicaModel;


@RestController
public class PessoaFisicaController {
	
	@GetMapping("/validar-cpf")
	public PessoaFisicaModel validarCpf (
			@RequestParam(value = "cpf")String cpf) {
		return new PessoaFisicaModel(cpf);
	}
}
