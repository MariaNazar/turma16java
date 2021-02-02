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
      
      System.out.print("Digite seu gênero F- feminino, M- masculino e O-outros :");
      x1.genero= ler.next().toUpperCase().charAt(0);
      
      System.out.print("Digite sua condição, considerando 1 estável, 2 moderado, 3 possível problema, 4 grave: ");
      x1.condicao= ler.nextInt();
      
      System.out.printf("Paciente %s com %d anos de idade, do gênero %s  %s ", x1.nome, x1.idade,x1.genero, x1.statusPaciente());
     
	}

}
