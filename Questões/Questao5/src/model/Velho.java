package model;

public class Velho extends Imovel{

	private int desconto;

	@Override
	public void imprimir() {
				
		System.out.println("\n-----Imovel Velho-----");
		System.out.println("Desconto: " + getDesconto());
		
		double velho = getPreco() - (getPreco() * (((double) getDesconto())/100));
		setPreco(velho);
		
		System.out.println("Novo Preço: " + getPreco());		
	}
	
	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
}
