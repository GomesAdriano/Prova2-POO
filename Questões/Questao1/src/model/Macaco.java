package model;

public class Macaco {
	
	private String nome;
	private String bucho = ""; //estomago
	
	public void comer(String alimento) {
		if(getBucho().isEmpty()) {
			setBucho(alimento);
		}else {
			setBucho(alimento + ", " + getBucho());
		}
	}
	
	public void verBucho() {		
		
		if (getBucho().isEmpty()) {
			System.out.println("Bucho está vázio");
		}else {
			System.out.println(getBucho());
		}
		
	}
	
	public void digerir() {
		if(!getBucho().isEmpty()) {
			System.out.println("Digerindo");
			setBucho("");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBucho() {
		return bucho;
	}

	public void setBucho(String alimento) {
		this.bucho = alimento;
	}
	
}
