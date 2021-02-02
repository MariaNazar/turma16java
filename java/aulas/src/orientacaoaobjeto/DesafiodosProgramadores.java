package orientacaoaobjeto;

import java.util.Locale;
import java.util.Scanner;

public class DesafiodosProgramadores {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base1, base2, base3, altura1, altura2, altura3, area1, area2,area3;
		
		System.out.print("Digite a base do triangulo 1: ");
		base1 = leia.nextDouble();
		System.out.print("Digite a altura do triangulo 1: ");
		altura1 = leia.nextDouble();
		
		area1 = ((base1 * altura1) / 2 );
		
		System.out.printf("A area do triangulo informado é %.2f", area1);
		
		System.out.print("\n\nDigite a base do triangulo 2 : ");
		base2= leia.nextDouble();
        System.out.print("Digite a altura do triangulo 2 :");
		altura2 = leia.nextDouble();
		
		area2 = ((base2*altura2) / 2);
		System.out.printf("A are do triangulo1 informado é %.2f", area2);
		
		System.out.print("\n\nDigite a base do triangulo 3 : ");
		base3= leia.nextDouble();
        System.out.print("Digite a altura do triangulo 3 :");
		altura3 = leia.nextDouble();
		
		area3 = ((base3*altura3) / 2);
		System.out.printf("A are do triangulo informado é %.2f", area3);
		
		if (area1>area2 && area1>area3)
		{
		System.out.printf("\n\nA maior área é a primeira %.2f",area1);
		}
		else if (area2>area1 && area2>area3)
		{
		System.out.printf("\n\nA maior área é a segunda %.2f",area2);
		}
		else 
		{
		System.out.printf("\n\nA maior área é a terceira %.2f",area3);	
		}
		
		
	}

}
