package aulas;

import java.util.Scanner;

public class Exercicio3condicionais
{

public static void main(String[] args) 
{
		
//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil 
//18-25 adulto
	Scanner ler= new Scanner (System.in);
	int idade;
	
	System.out.println ("Digite a idade de uma pessoa :");
	idade = ler.nextInt();
	
	if (idade<=9 || idade>=26)
	{
	System.out.println ("A idade digitada n�o est� em nosso sistema.");
	}
	else if (idade>=10 && idade<=14)
	{
	System.out.println("A pessoa � da categoria Infantil. ");	
	}
	else if (idade>=15 && idade<=17)
	{
	System.out.println("A pessoa � da categoria Juvenil. ");
	}
	else 
	{
	System.out.println ("A pessoa � da categoria Adulto. ");	
	}
}

}
