package orientacaoaobjeto;

public class Fornecedor extends Pessoa{
	 private double valorCredito;
	 private double valorDivida;
	 public double obterSaldo;

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
	
		super(nome,endereco,telefone);
		
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getObterSaldo() {
		return obterSaldo=(valorDivida-valorCredito);
	}

	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}

	
	 

}
