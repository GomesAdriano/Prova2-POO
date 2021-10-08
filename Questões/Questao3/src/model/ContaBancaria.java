package model;

public class ContaBancaria {
	
    private String numero = "00000-0";
    private String agencia = "0000-0";
    private double saldo = 0.0;
    private int codigoTipo = 1; //1 = Conta Corrente, 2 = Conta Poupança
    private String nomeTipo = "";

    public ContaBancaria(String numero, String agencia, double saldo, int codigoTipo){
    	
    	if (validaTipo(codigoTipo) == true) {
    		this.numero = numero;
            this.agencia = agencia;
            this.saldo = saldo;
            this.codigoTipo = codigoTipo;
         
            if (this.codigoTipo == 1)
                this.nomeTipo = "Conta Corrente";
            else
                this.nomeTipo = "Poupança";
    	}
        
    	else
            System.out.println("Tipo de conta inválida: escolha Conta Corrente ou Poupança");

    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getCodigoTipo() {
		return codigoTipo;
	}

	public void setCodigoTipo(int codigoTipo) {
		this.codigoTipo = codigoTipo;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}

	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	
	public boolean validaTipo(int codigoTipo) {
		if (codigoTipo == 1 || codigoTipo == 2)
            return true;
        else
            return false;
	}
        
    public void mostrarSaldo() {
    	System.out.println("Saldo: " + this.saldo);
    }

    public void depositar(double valor) {
    	this.saldo += valor;
    }

    public void sacar(double valor) {
    	if (this.saldo >= valor)
            this.saldo -= valor;
        else
            System.out.println("Saldo insuficiente!");
    }
        
}