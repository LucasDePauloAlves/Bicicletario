package br.com.magnasistemas.bicicletario.dto;

import java.util.List;

import br.com.magnasistemas.bicicletario.entity.BicicletaEntity;
import br.com.magnasistemas.bicicletario.status.BicicletarioStatus;

public class BicicletarioDTO {

	private String nome;
	private String cep;
	private List<BicicletaEntity> bicicletas;
	private BicicletarioStatus status = BicicletarioStatus.ABERTO;

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

	public List<BicicletaEntity> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(List<BicicletaEntity> bicicletas) {
		this.bicicletas = bicicletas;
	}

	public BicicletarioStatus getStatus() {
		return status;
	}

	public void setStatus(BicicletarioStatus status) {
		this.status = status;
	}


}
