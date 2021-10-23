package br.com.magnasistemas.bicicletario.dto;

import java.util.List;

import br.com.magnasistemas.bicicletario.entity.Bicicleta;
import br.com.magnasistemas.bicicletario.entity.StatusBicicletario;

public class BicicletarioDTO {

	private String nome;
	private String cep;
	private List<Bicicleta> bicicletas;
	private StatusBicicletario status = StatusBicicletario.DISPONIVEL;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public List<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(List<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}

	public StatusBicicletario getStatus() {
		return status;
	}

	public void setStatus(StatusBicicletario status) {
		this.status = status;
	}


}
