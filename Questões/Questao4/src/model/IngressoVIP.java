package model;

public class IngressoVIP extends Ingresso{
	
	private double valorAdicional = 0.0;
	
	@Override
	public void imprimirValor() {
		super.imprimirValor();
		System.out.println("Valor do Ingresso VIP: R$ " + getValorAdicional());
	}

	public double getValorAdicional() {
		return getValor() + valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
}
