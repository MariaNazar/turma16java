package aulas;

import java.util.Scanner;

public class Exercicio1condicionais 
{

	public static void main(String[] args) 
	{
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior	
    Scanner ler = new Scanner (System.in);
	int numero1, numero2, numero3, maior;
    
	System.out.print("Digite o primeiro n�mero inteiro :");
	numero1 = ler.nextInt();
	
	System.out.print("Digite o segundo n�mero inteiro :");
	numero2 = ler.nextInt();
	
	System.out.print("Digite o terceiro n�mero inteiro :");
	numero3 = ler.nextInt();
	
	if (numero1>=numero2 && numero1>=numero3)
	{
	 System.out.print (numero1+" � o maior valor digitado.");
	 }
	else if (numero2>=numero3 && numero2>=numero3) 
	{
	 System.out.print (numero2+" � o maior valor digitado.");	
	}
	else 
	{
	System.out.print(numero3+" � o maior valor digitado.");	
	}
	
	System.out.print("Fim de programa!");
	}
}
