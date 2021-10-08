package app;

import model.Macaco;

public class Application {

	public static void main(String[] args) {
		
		Macaco m1 = new Macaco();
		Macaco m2 = new Macaco();
		
		m1.setNome("Rick");
		m2.setNome("Morty");
		
		System.out.println("Macacos: " + m1.getNome()+ ", " + m2.getNome());
		
		System.out.println("\n\nAlimentos no bucho do Macaco " + m1.getNome());
		m1.comer("Mamão");
		m1.verBucho();
		m1.comer("Melancia");
		m1.verBucho();
		m1.comer("Maçã");
		m1.verBucho();
		m1.digerir();
		m1.verBucho();
		
		System.out.println("\n\nAlimentos no bucho do Macaco " + m2.getNome());
		m2.comer("Banana");
		m2.verBucho();
		m2.comer("Melão");
		m2.verBucho();
		m2.comer(m1.getNome());//Comendo macaco 1, apenas mostra nome Rick
		m1 = null;//Eliminando referencia do macaco 1 - Rick
		m2.verBucho();
		m2.digerir();
		m2.verBucho();		
				
		if(m1==null) {
			System.out.println("\n\nMacaco Restante: " + m2.getNome());	
		}
	}
}
