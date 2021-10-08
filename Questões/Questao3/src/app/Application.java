package app;

import model.ContaImposto;

public class Application {
	
	public static void main(String[] args) {
		
		//Numero, Agencia, Saldo, Tipo de Conta
		//1 - Conta Corrente, 2 - Conta Poupança
		ContaImposto cliente = new ContaImposto("1234-5", "6789-0", 1000.0, 1);
		
		cliente.mostrarSaldo();
		cliente.depositar(2000.0);
		
		cliente.mostrarSaldo();
		cliente.sacar(500.0);
		
		cliente.mostrarSaldo();
		cliente.setPercentualImposto(10);
		cliente.calcularImposto();
		
		cliente.mostrarSaldo();
	}
}
