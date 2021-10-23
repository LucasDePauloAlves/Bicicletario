package br.com.magnasistemas.bicicletario.dto;

import br.com.magnasistemas.bicicletario.entity.Bicicleta;

public class ClienteDTO {
	private String nome;
	private int idade;
	private String celular;
	private String cep;
	private Bicicleta possuiBicicleta;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Bicicleta getPossuiBicicleta() {
		return possuiBicicleta;
	}

	public void setPossuiBicicleta(Bicicleta idBicicleta) {		
		this.possuiBicicleta = idBicicleta;
	}
}
