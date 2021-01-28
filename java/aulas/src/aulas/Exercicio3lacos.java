package aulas;

import java.util.Scanner;

public class Exercicio3lacos {
  public static void main (String [] args) {
	Scanner ler= new Scanner (System.in);
	 //Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	  //Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99 
    int idade, menosvu=0, maisc=0;
    
    do
    {
    	System.out.print("Digite uma idade :");
    
    	idade = ler.nextInt();
    	
    	   if(idade<=21)
    	     { 
    	    	menosvu+=1;  
    	     }
    	    	  
    	    else if(idade>=50) 
    	    {
    	       maisc+=1;
    	    } 
    }
    while(idade!=-99);  
    {
    	
    System.out.printf("O total de pessoas acima de 50 anos é de %d", (maisc));
    System.out.printf("\n O total de pessoas abaixo de 21 anos é de %d", menosvu-1);
     }
 
    
 }
}
