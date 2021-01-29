package vetores;

import java.util.Scanner;

public class Exercicio1vetor {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	double pontuacao[]= new double [5];
	double maiorNota=0;

	for (int x=0; x<5; x++)
	{
	 System.out.printf("Digite cinco notas :");
	 pontuacao[x]=ler.nextDouble();
	 
	 if(pontuacao[x]>maiorNota){maiorNota = pontuacao[x];}
	 
	} 
	
	System.out.printf("\n \n A maior nota recebida foi %.2f ", maiorNota);
	}

}
