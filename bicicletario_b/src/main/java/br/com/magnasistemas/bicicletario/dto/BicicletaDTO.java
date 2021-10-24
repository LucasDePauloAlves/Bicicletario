package br.com.magnasistemas.bicicletario.dto;

import br.com.magnasistemas.bicicletario.status.BicicletaStatus;

public class BicicletaDTO {

	private int aro;
	private BicicletaStatus status;
	
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
