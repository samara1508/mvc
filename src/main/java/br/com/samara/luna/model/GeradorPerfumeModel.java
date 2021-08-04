package br.com.samara.luna.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;


public class GeradorPerfumeModel {

	public List<PerfumeModel> gerar () {
		List<PerfumeModel> perfumes = new ArrayList<>();
		SplittableRandom sr = new SplittableRandom();
		
		String[] nomePerfumes = {"Invictus", "Ferrari", "Entity Dulce Amor", 
				"Lady Million", "La vie est Belle", "Pure XS", "Oso Woman",
				"Boss Bottled Night", "Pino Silvestre", "Alien Perfume"
		};
		EnumTipoPerfumeModel[] tipos = {
			EnumTipoPerfumeModel.EAU_DE_PARFUM,
			EnumTipoPerfumeModel.EAU_DE_TOILETTE
		};
		
		for (int i = 0; i < 6; i++) {
			BigDecimal valor = gerarValorRandom(sr);
			String nome = nomePerfumes[sr.nextInt(0, nomePerfumes.length)];
			EnumTipoPerfumeModel tipo = tipos[sr.nextInt(0, tipos.length)];
			perfumes.add(new PerfumeModel(nome, valor, tipo));
		}		
		return perfumes;
	}	
	
	private BigDecimal gerarValorRandom (SplittableRandom sr) {
		Long num = sr.nextLong(0, 10000);
		return BigDecimal.valueOf(num).divide(BigDecimal.valueOf(100));
	}

}
