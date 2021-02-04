package orientacaoaobjeto;

public class Empregado {
	public int codigoSetor;
	public double salarioBase;
	public double imposto=0.06;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
		
	
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto*salarioBase;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
    
}
