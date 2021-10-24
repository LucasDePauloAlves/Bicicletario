package br.com.magnasistemas.bicicletario.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.magnasistemas.bicicletario.status.BicicletaStatus;

@Entity
public class BicicletaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int aro;
	@Enumerated(EnumType.STRING)
	private BicicletaStatus status = BicicletaStatus.DISPONIVEL;

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

	public BicicletaStatus getStatus() {
		return status;
	}

	public void setStatus(BicicletaStatus status) {
		this.status = status;
	}

}
