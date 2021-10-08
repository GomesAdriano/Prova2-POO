package model;

public class Novo extends Imovel {

	private int adicional;

	@Override
	public void imprimir() {
		super.imprimir();
		
		System.out.println("\n-----Imovel Novo-----");
		System.out.println("Adicional: " + getAdicional());
		
		double novo = getPreco() + (getPreco() * (((double) getAdicional())/100));
		setPreco(novo);
		
		System.out.println("Novo Preço: " + getPreco());		
	}
	
	public int getAdicional() {		
		return adicional;
	}

	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}
	
}
