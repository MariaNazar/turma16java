package herancaepoliformismo;

public class Terceiro extends Empregados{

		private double acrescimo;
	

	public Terceiro(String nome, int matricula, int horas, double valorHora) {
		super(nome, matricula, horas, valorHora);
		// TODO Auto-generated constructor stub
	}

	
	 public double acrescimo()
	{
	 return acrescimo= salario()+(getValorHora()*0.1)*getHoras();
	}
	
	
	
	

}
