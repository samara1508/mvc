package br.com.samara.luna.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class CarrinhoModel {

	private Long id;
	private List<ItemCarrinhoModel> itens;
	private EnumStatusCarrinhoModel status;
	
	public CarrinhoModel () {
		this.itens = new ArrayList<ItemCarrinhoModel>();
		this.id = new SplittableRandom().nextLong(100, 1000);
		this.status = EnumStatusCarrinhoModel.ABERTO;
	}
	
	public void addPerfume(PerfumeModel perfume, Integer qtd) {
		if (EnumStatusCarrinhoModel.FINALIZADO.equals(this.status)) {
			throw new RuntimeException("Carrinho Finalizado");
		}
		this.itens.add(new ItemCarrinhoModel(perfume, qtd));
	}
	
	public void finalizar () {
		this.status = EnumStatusCarrinhoModel.FINALIZADO;
	}

	public Long getId() {
		return id;
	}
	
	public BigDecimal getValorTotal () {
		BigDecimal soma = BigDecimal.ZERO;
		for (ItemCarrinhoModel i : itens) {
			soma = soma.add(i.getValorTotal());
		}
		return soma;
	}

}
