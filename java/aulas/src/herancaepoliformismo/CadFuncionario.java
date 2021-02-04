package herancaepoliformismo;

public class CadFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Empregados funcionario1= new Empregados ("Juliano", 86745, 12, 23);
		Terceiro funcionario2= new Terceiro("José", 97455, 16, 25);
		
		
	 System.out.printf("O salário do funcionário %s é de R$%.2f.", funcionario2.getNome(),funcionario2.acrescimo());	
	 System.out.print("\n ---------------------------------------------------------");
	 System.out.printf("\nO salário do funcionário %s é de R$%.2f.",funcionario1.getNome(), funcionario1.salario());
	  System.out.print("\n---------------------------------------------------------");
	 System.out.printf("\n O funcionário %s com a matrícula %d fez %d horas de trabalho, com a hora valendo %.2f.", funcionario1.getNome(), funcionario1.getMatricula(),funcionario1.getHoras(), funcionario1.getValorHora());
	 System.out.print("\n---------------------------------------------------------");
	 System.out.printf("\n O funcionário %s com a matrícula %d fez %d horas de trabalho, com a hora valendo %.2f.", funcionario2.getNome(), funcionario2.getMatricula(), funcionario2.getHoras(), (funcionario2.getValorHora()+(funcionario2.getValorHora())*0.1));
	
	 
	
	
	}

}
