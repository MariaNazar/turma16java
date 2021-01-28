package aulas;

import java.util.Scanner;

public class exercicio4 
{
public static void main (String[] args)
{
    Scanner ler= new Scanner (System.in);
    
	int a,b,c, r, s, d;
	
	System.out.println("Digite o valor de a :");
	a = ler.nextInt();
	
	System.out.println("Digite o valor de b :");
    b = ler.nextInt();
    
    System.out.println("Digite o valor de c :");
    c = ler.nextInt();
    
     r =(a+b)*(a+b);
     s =(b+c)*(b+c);
     d =r+s/2;
     
     
     System.out.println("O valor da expressão é "+d);
  }
}
