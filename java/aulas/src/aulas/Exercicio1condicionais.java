package aulas;

import java.util.Scanner;

public class Exercicio1condicionais 
{

	public static void main(String[] args) 
	{
		//Faça um programa que receba três inteiros e diga qual deles é o maior	
    Scanner ler = new Scanner (System.in);
	int numero1, numero2, numero3, maior;
    
	System.out.print("Digite o primeiro número inteiro :");
	numero1 = ler.nextInt();
	
	System.out.print("Digite o segundo número inteiro :");
	numero2 = ler.nextInt();
	
	System.out.print("Digite o terceiro número inteiro :");
	numero3 = ler.nextInt();
	
	if (numero1>=numero2 && numero1>=numero3)
	{
	 System.out.print (numero1+" é o maior valor digitado.");
	 }
	else if (numero2>=numero3 && numero2>=numero3) 
	{
	 System.out.print (numero2+" é o maior valor digitado.");	
	}
	else 
	{
	System.out.print(numero3+" é o maior valor digitado.");	
	}
	
	System.out.print("Fim de programa!");
	}
}
