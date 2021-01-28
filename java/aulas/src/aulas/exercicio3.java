package aulas;

import java.util.Scanner;

public class exercicio3 
{
 public static void main (String [] args)
 { 
 
  Scanner ler= new Scanner (System.in);
  
  int s, h, m;
 
  System.out.println("Digite o tempo em segundos :");
  s = ler.nextInt();
  
  h = s/3600;
  m = s/60;
  
  System.out.println(h+" horas");
  System.out.println(m+" minutos");
  }
}
