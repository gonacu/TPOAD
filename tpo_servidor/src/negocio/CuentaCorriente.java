package negocio;

import dto.CuentaCorrienteDTO;

public class CuentaCorriente {
	private String condiciones;
	private float limite;
	private float balanceActual;
	
	public CuentaCorriente (CuentaCorrienteDTO ctaDTO){
		this.condiciones = ctaDTO.getCondiciones();
		this.limite = ctaDTO.getLimite();
		this.balanceActual = ctaDTO.getBalanceActual();
	}

	public String getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getBalanceActual() {
		return balanceActual;
	}

	public void setBalanceActual(float balanceActual) {
		this.balanceActual = balanceActual;
	}
	
	
}
