package br.com.magnasistemas.bicicletario.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bicicleta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int aro;
	@Enumerated(EnumType.STRING)
	private StatusBicicleta status = StatusBicicleta.DISPONIVEL;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public StatusBicicleta getStatus() {
		return status;
	}

	public void setStatus(StatusBicicleta status) {
		this.status = status;
	}

}
