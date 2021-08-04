package br.com.samara.luna.model;

import java.util.Objects;
import java.util.SplittableRandom;

public class PessoaFisicaModel extends PessoaModel {

	public PessoaFisicaModel(String documento) {
		super(documento);
	}
	
	@Override
	public Boolean validarDocumento() {
		
		if (Objects.isNull(super.getDocumento()) || 
				super.getDocumento().length() != 11) {
			return false;
		}
		String preDocumento = super.getDocumento().substring(0, 9);
		String documentoGerado = this.geraDocumento(preDocumento);
		return super.getDocumento().equals(documentoGerado);
	}

	@Override
	public String gerarDocumento() {
		SplittableRandom sr = new SplittableRandom();
		String preDoc = "";
		for (int i = 0; i < 9; i++) {
			preDoc = preDoc + sr.nextInt(0, 10);
		}
		return this.geraDocumento(preDoc);
	}

	@Override
	public String getDocumentoFormatado() {
		// TODO Auto-generated method stub
		return null;
	}

	private String geraDocumento(String preDoc1) {
		
		char[] numeros = preDoc1.toCharArray();
		Integer soma = 0;
		for (int i = numeros.length; i > 0; i--) {
			Integer num = Integer.valueOf(String.valueOf(numeros[i - 1]));
			soma += (num * i);
		}
		Integer dv1 = soma % 11;
		
		String preDoc2 = preDoc1 + (dv1.equals(10) ? 0 : dv1);
		
		numeros = preDoc2.toCharArray();
		soma = 0;
		for (int i = numeros.length - 1; i >= 0; i--) {
			Integer num = Integer.valueOf(String.valueOf(numeros[i]));
			soma += (num * i);
		}
		Integer dv2 = soma % 11;
		
		return preDoc2 + (dv2.equals(10) ? 0 : dv2);
	}
}
