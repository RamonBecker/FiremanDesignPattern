package br.edu.pattertproject.fireman.Fireman.entites.Pessoa;

import br.edu.pattertproject.fireman.Fireman.entites.Pessoa.documento.Documento;

public abstract class Pessoa {

	private Documento documento;
	private Endereco endereco;
	
	public Pessoa() {
	}

	public Pessoa(Documento documento) {
		this.documento = documento;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Documento:"+documento +"\n Endereco:" + endereco + "\n";
	}

}
