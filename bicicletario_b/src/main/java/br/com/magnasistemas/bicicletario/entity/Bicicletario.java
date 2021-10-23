package br.com.magnasistemas.bicicletario.entity;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bicicletario {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String cep;
	
	@OneToMany
	private List<Bicicleta> bicicletas = new ArrayList<>();
	
	@Enumerated(EnumType.STRING)
	private StatusBicicletario status = StatusBicicletario.DISPONIVEL;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
