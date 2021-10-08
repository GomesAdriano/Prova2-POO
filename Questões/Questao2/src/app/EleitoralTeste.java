package app;

import java.util.Scanner;

import model.Eleitoral;

public class EleitoralTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Eleitoral eleitor = new Eleitoral();
		
		System.out.print("Informe seu nome: ");
		eleitor.setNome(scan.next());
		System.out.print("Informe sua idade: ");
		eleitor.setIdade(scan.nextInt());
		
		System.out.println("\n\n");
		eleitor.imprimir();
		eleitor.verificar();
		

	}

}
