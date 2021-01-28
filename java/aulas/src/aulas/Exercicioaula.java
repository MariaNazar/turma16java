package aulas;

import java.util.Scanner;

public class Exercicioaula {

	public static void main(String[] args) {
	 
	Scanner ler = new Scanner (System.in);
	
	int nDigitado;
	
	System.out.println ("Digite um número natural :");
	nDigitado = ler.nextInt();
	
	if (nDigitado<=0)
	{
	System.out.println ("O número digitado não é válido");	
	}
	else if (nDigitado%2==0)
	{
	System.out.println ("O número digitado é par. ");	
	}
	else 
	{
	System.out.println("O número digitado é impar. ");	
	}
   	}

}
