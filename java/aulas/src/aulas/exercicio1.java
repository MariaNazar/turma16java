package aulas;

import java.util.Scanner;

public class exercicio1 
{
  public static void main (String[] args) 
  {
   Scanner ler= new Scanner (System.in);
   int a, b, c,  resultado;
   
    System.out.println ("Digite quantos anos voc� tem :");
    a = ler.nextInt();
    System.out.println ("Digite quantos meses voc� tem :");
    b= ler.nextInt();
    System.out.println ("Digite quantos dias voc� tem :");
    c= ler.nextInt();
    
    resultado = (a*365)+(b*30)+c;
    
    System.out.println ("Voc� est� a "+ resultado + " dias na terra.");
   }
}