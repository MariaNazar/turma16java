package aulas;

import java.util.Scanner;

public class exercicio2 
{
 public static void main (String [] args)
 {
  Scanner ler= new Scanner (System.in);
  int d, resultado, a , m, dias;
  
  System.out.println ("Digite quantos dias você tem de vida :");
  d = ler.nextInt();
  
  a = d/365;
  m = d/30;
  dias = -(a*365-d);
  
  
  System.out.println ("Você está a "+ a + " anos, " + m + " meses e " + dias+ " dias na terra.");

  }
}
