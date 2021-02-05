package herancaepoliformismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadFuncionario {
	
	
	Scanner leia = new Scanner(System.in);
	double salario = 0.0;
	List <Empregados> lista = new ArrayList<>();
	//List � uma collection interface - pode chamar mas n�o pode instanciar como objeto
	
	System.out.print("O colaborador � terceiro? [S/N] ");
	char opcao = leia.next().toUpperCase().charAt(0);
	
	while (opcao != 'S' && opcao != 'N') {
		System.out.println("O colaborador � terceiro? [S/N] ");
		opcao = leia.next().toUpperCase().charAt(0);
	}
	
	System.out.println("Informe a matricula do colaborador: ");
	int matricula = leia.nextInt();
	
	System.out.println("Informe o nome do colaborador: ");
	String nome = leia.next();
	
	System.out.println("Quantas horas trabalhadas?");
	int horas = leia.nextInt();
	
	System.out.println("Qual valor/hora?");
	double valorHora = leia.nextDouble();
	
	if (opcao == 'S') {
		System.out.println("Informe o acrescimo: ");
		double acrescimo = leia.nextDouble();
		Empregados colaborador = new Terceiro(nome, matricula, horas, valorHora, acrescimo);
		salario = colaborador.salario();
	} else if (opcao == 'N') {
		Empregados colaborador = new Empregados(nome, matricula, horas, valorHora);
		salario = colaborador.salario();
	}
	
	System.out.printf("O colaborador se chama %s, sua matricula � %d, seu salario total � de R$ %.2f",nome,matricula,salario);
	
}
		

   }
