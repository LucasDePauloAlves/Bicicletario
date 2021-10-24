package br.com.magnasistemas.bicicletario.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.magnasistemas.bicicletario.status.BicicletarioStatus;

@Entity
public class BicicletarioEntity {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String cep;
	
	@OneToMany
	private List<BicicletaEntity> bicicletas = new ArrayList<>();
	
	@Enumerated(EnumType.STRING)
	private BicicletarioStatus status = BicicletarioStatus.ABERTO;

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
