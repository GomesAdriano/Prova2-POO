package model;

public class Imovel {
	
	private String endereco;
	private double preco;
	
	public void imprimir() {
		System.out.println("\n\n-----Imovel-----");
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Preço: " + getPreco());
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}	
}
