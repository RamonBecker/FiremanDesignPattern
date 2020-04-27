package br.edu.pattertproject.fireman.chan_responsibility_pattern;

import java.util.HashMap;
import java.util.Map;
import br.edu.pattertproject.fireman.entites.Empresa;
import br.edu.pattertproject.fireman.entites.Vistoria;
import br.edu.pattertproject.fireman.exception.ErrorSearchDado;
import br.edu.pattertproject.fireman.exception.ErrorSearchList;
import br.edu.pattertproject.fireman.observer_pattern.Ocorrencia;

public abstract class RecuperarDado {

	private RecuperarDado recuperador;
	private Map<String, Empresa> listsEmpresas;
	private Map<String, Vistoria> listsVistorias;
	private Map<String, Ocorrencia> listsOcorrências;

	public RecuperarDado() {
		super();
	}

	public RecuperarDado(RecuperarDado recuperador) {
		this.recuperador = recuperador;
	}

	public <T> Object buscarDado(String nome, Map<String, T> map) throws ErrorSearchDado {
		Object dadoBuscado = recuperarDado(nome, map);

		if (dadoBuscado == null) {
			return chamarRecuperador(nome, map);
		}
		return dadoBuscado;
	}

	private <T> Object chamarRecuperador(String nome, Map<String, T> map) throws ErrorSearchDado {
		if (this.recuperador == null) {
			throw new ErrorSearchDado("Não foi possível buscar essa informação");
		}
		return recuperador.buscarDado(nome, map);
	}

	protected abstract <T> Object buscarLista(Map<String, T> map, String nome) throws ErrorSearchList;

	protected abstract <T> Object recuperarDado(String nome, Map<String, T> map);

	public RecuperarDado getRecuperador() {
		return recuperador;
	}

	public void setRecuperador(RecuperarDado recuperador) {
		this.recuperador = recuperador;
	}

	public Map<String, Empresa> getListsEmpresas() {
		if (listsEmpresas == null) {
			listsEmpresas = new HashMap<>();
		}
		return listsEmpresas;
	}

	public void setListsEmpresas(Map<String, Empresa> listsEmpresas) {
		this.listsEmpresas = listsEmpresas;
	}

	public Map<String, Vistoria> getListsVistorias() {
		if (listsVistorias == null) {
			listsVistorias = new HashMap<>();
		}
		return listsVistorias;
	}

	public void setListsVistorias(Map<String, Vistoria> listsVistorias) {
		this.listsVistorias = listsVistorias;
	}

	public Map<String, Ocorrencia> getListsOcorrências() {
		if (listsOcorrências == null) {
			listsOcorrências = new HashMap<>();
		}
		return listsOcorrências;
	}

	public void setListsOcorrências(Map<String, Ocorrencia> listsOcorrências) {
		this.listsOcorrências = listsOcorrências;
	}

}