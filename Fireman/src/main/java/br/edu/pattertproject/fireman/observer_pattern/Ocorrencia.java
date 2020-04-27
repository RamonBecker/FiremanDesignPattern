package br.edu.pattertproject.fireman.observer_pattern;


import br.edu.pattertproject.fireman.entites.person.Endereco;

public class Ocorrencia {
	private Endereco endereco;

	public Ocorrencia(Endereco endereco) {
		this.endereco = endereco;
	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}