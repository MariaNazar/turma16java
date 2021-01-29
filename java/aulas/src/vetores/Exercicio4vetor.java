package vetores;

import java.util.Scanner;

public class Exercicio4vetor {

	public static void main(String[] args) {
	
	Scanner ler= new Scanner (System.in);	
		//4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela
		//soma dos valores da primeira diagonal, ou seja, diagonal principal.
    int valores[][]= new int [3][3];
    int l=0, c=0;
    int somatorio;
  
    
    for (l=0; l<3; l++)
    {
    for (c=0; c<3;c++)
    {
     System.out.print("Digite um número da linha "+l + " e coluna " + c + "  ");
     valores[l][c]= ler.nextInt();
   }
    if (l == c)
    {
    somatorio=l+c;
    System.out.printf("\n A soma da diagonal principal é : %d", somatorio);
    
    }
    
	}
    }
}
