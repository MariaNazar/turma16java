package orientacaoaobjeto;

import java.util.Scanner;

import entidades.paciente;

public class Exercicio7POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner ler = new Scanner (System.in);
      paciente x1= new paciente();
      
      System.out.print("Digite seu nome :"); 
      x1.nome= ler.next();
      
      System.out.print("Digite sua idade :");
      x1.idade= ler.nextInt();
      
      System.out.print("Digite seu g�nero F- feminino, M- masculino e O-outros :");
      x1.genero= ler.next().toUpperCase().charAt(0);
      
      System.out.print("Digite sua condi��o, considerando 1 est�vel, 2 moderado, 3 poss�vel problema, 4 grave: ");
      x1.condicao= ler.nextInt();
      
      System.out.printf("Paciente %s com %d anos de idade, do g�nero %s  %s ", x1.nome, x1.idade,x1.genero, x1.statusPaciente());
     
	}

}
