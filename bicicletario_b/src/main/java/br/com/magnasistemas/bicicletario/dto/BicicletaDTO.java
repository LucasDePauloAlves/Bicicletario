package br.com.magnasistemas.bicicletario.dto;

import br.com.magnasistemas.bicicletario.entity.StatusBicicleta;

public class BicicletaDTO {

	private int aro;
	private StatusBicicleta status;
	
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
