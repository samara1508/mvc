package br.com.samara.luna.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.samara.luna.model.PerfumeModel;



@RestController
	public class CarrinhoController { 
		
		@GetMapping("/adicionar-perfumes")
		public PerfumeModel adicionar (
				@RequestParam(value = "perfume")String nome) {
			return new PerfumeModel(nome, null, null);
		}
	}
