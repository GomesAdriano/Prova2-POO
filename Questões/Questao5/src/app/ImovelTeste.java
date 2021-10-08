package app;

import java.util.Scanner;

import model.Novo;
import model.Velho;

public class ImovelTeste {
	
	public static void main(String[] args) {
		
		String endereco;
		double preco;
		
		Scanner scan = new Scanner(System.in);
				
		Novo imovelNovo = new Novo();
		Velho imovelVelho = new Velho();
		
		System.out.println("-----Imovel-----");
		System.out.println("Informe um endereço: ");
		endereco = scan.nextLine();
		imovelNovo.setEndereco(endereco);
		imovelVelho.setEndereco(endereco);
		
		System.out.print("Informe um preço: ");
		preco = scan.nextDouble();	
		imovelNovo.setPreco(preco);
		imovelVelho.setPreco(preco);
		
		System.out.print("Informe um percentual de acrescimo: "); //ex: 5, 10, 20
		imovelNovo.setAdicional(scan.nextInt());
		
		System.out.print("Informe um percentual de desconto: "); //ex: 5, 10, 20
		imovelVelho.setDesconto(scan.nextInt());
		
		imovelNovo.imprimir();
		imovelVelho.imprimir();		
	}

}
