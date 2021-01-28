package aulas;

import java.util.Scanner;

public class exercicio1 
{
  public static void main (String[] args) 
  {
   Scanner ler= new Scanner (System.in);
   int a, b, c,  resultado;
   
    System.out.println ("Digite quantos anos você tem :");
    a = ler.nextInt();
    System.out.println ("Digite quantos meses você tem :");
    b= ler.nextInt();
    System.out.println ("Digite quantos dias você tem :");
    c= ler.nextInt();
    
    resultado = (a*365)+(b*30)+c;
    
    System.out.println ("Você está a "+ resultado + " dias na terra.");
   }
}