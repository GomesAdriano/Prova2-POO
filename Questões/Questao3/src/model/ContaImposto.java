package model;

public class ContaImposto extends ContaBancaria{
	
	private int percentualImposto = 0;
	
	public ContaImposto(String numero, String agencia, double saldo, int codigoTipo) {
		super(numero, agencia, saldo, codigoTipo);	
	}
	
	public void calcularImposto(){
		
		if(getSaldo() > 0) {
			
			double conta = getSaldo() * (((double) getPercentualImposto())/100);		
			System.out.println("Imposto a pagar: " + conta);
			setSaldo(getSaldo() - conta);
			
		}else {
			System.out.println("Saldo insuficiente!");
		}	
	}

	public int getPercentualImposto() {
		return percentualImposto;
	}

	public void setPercentualImposto(int percentualImposto) {
		this.percentualImposto = percentualImposto;
	}
	
}
