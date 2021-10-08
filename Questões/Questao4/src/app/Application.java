package app;

import model.Ingresso;
import model.IngressoVIP;

public class Application {

	public static void main(String[] args) {
		
		IngressoVIP ingresso = new IngressoVIP();
		
		ingresso.setValor(100.0);//Valor do ingresso
		ingresso.setValorAdicional(150.0);//valor adicional do ingresso vip

		ingresso.imprimirValor();
		
	}

}
