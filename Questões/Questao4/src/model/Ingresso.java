package model;

public class Ingresso {

	private double valor = 0.0;
	
	public void imprimirValor() {
		System.out.println("Valor do Ingresso: R$ " + getValor());
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}