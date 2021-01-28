package aulas;

import java.util.Scanner;

public class Exercicio2laco {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int respostas=0, par=0, impar=0;
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		
	for (int x=0; x<10; x++) 
	{
	System.out.println(" Digite dez valores diferentes e lhe diremos se é par ou impar :");
	respostas =ler.nextInt();
	
	if (respostas%2==0)
	{
	par+=1;
    }
	else 
	{
	 impar+=1;	
	}
	}
	System.out.print("Foram "+ par + " números pares e foram "+ impar + " números impares.");
	
	}	 
	

}
