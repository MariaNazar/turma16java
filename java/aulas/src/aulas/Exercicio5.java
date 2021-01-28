package aulas;

import java.util.Scanner;

public class Exercicio5 
{
public static void main(String[] args)
{

	Scanner ler= new Scanner(System.in);
	
	int nota1, nota2, nota3, media;
 
	System.out.println("Digite a primeira nota :");
	nota1 = ler.nextInt();
	
	System.out.println("Digite a segunda nota :");
	nota2 = ler.nextInt();
	
	System.out.println("Digite a terceira nota :");
	nota3 = ler.nextInt();
	
	media = (nota1*2) + (nota2*3 )+( nota3*5)/(2+3+5);
	
	System.out.println("A media do aluno foi "+ media);
}
}
