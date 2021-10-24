package br.com.magnasistemas.bicicletario.dto;

import java.util.List;

import br.com.magnasistemas.bicicletario.entity.BicicletaEntity;

public class ClienteDTO {
	private String nome;
	private int idade;
	private String celular;
	private String cep;
	private List<BicicletaDTO> transporteBicicleta;

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

	public List<BicicletaDTO> getTransporteBicicleta() {
		return transporteBicicleta;
	}

	public void setTransporteBicicleta(BicicletaEntity idBicicleta) {		
		this.transporteBicicleta = (List<BicicletaDTO>) idBicicleta;
	}
}
