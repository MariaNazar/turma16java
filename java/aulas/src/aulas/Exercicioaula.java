package aulas;

import java.util.Scanner;

public class Exercicioaula {

	public static void main(String[] args) {
	 
	Scanner ler = new Scanner (System.in);
	
	int nDigitado;
	
	System.out.println ("Digite um n�mero natural :");
	nDigitado = ler.nextInt();
	
	if (nDigitado<=0)
	{
	System.out.println ("O n�mero digitado n�o � v�lido");	
	}
	else if (nDigitado%2==0)
	{
	System.out.println ("O n�mero digitado � par. ");	
	}
	else 
	{
	System.out.println("O n�mero digitado � impar. ");	
	}
   	}

}
