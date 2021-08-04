package br.com.samara.luna.model;

import java.math.BigDecimal;
import java.util.SplittableRandom;

public class ItemCarrinhoModel {

	private Long id;
	private PerfumeModel perfume;
	private Integer qtd;
	private BigDecimal valorTotal;
		
	public ItemCarrinhoModel (PerfumeModel perfume, Integer qtd) {
		this.perfume = perfume;
		this.qtd = qtd;
		this.id = new SplittableRandom().nextLong(100, 1000);
		this.valorTotal = perfume.getValor().multiply(valorTotal);
	}

	public Long getId() {
		return id;
	}

	public PerfumeModel getPerfume() {
		return perfume;
	}

	public Integer getQtd() {
		return qtd;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

}
