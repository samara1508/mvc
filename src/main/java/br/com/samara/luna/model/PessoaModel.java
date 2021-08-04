package br.com.samara.luna.model;

public abstract class PessoaModel {

	private String documento;
	
	public PessoaModel(String documento) {
		this.documento = documento;
	}
	
	public abstract Boolean validarDocumento();
	public abstract String gerarDocumento(); //bonus
	public abstract String getDocumentoFormatado(); //bonus bonus

	public String getDocumento() {
		return documento;
	}

}
