package vetores;

import java.util.Scanner;

public class Agendaemjava {

	public static void main(String[] args) {
	
	    Scanner ler= new Scanner (System.in);
		String nome;
		String[][] agenda = new String [24][32];  
		int dia, hora;
		char continuar;
		

		System.out.print("Seja bem-vinde!");
	
			do
			{
				System.out.print("\nInforme o seu nome: ");
				nome= ler.next();
				do
				{
				
				System.out.print("\nInforme a data do evento [1 até 31]: ");
				dia= ler.nextInt();
				
				if(dia<1 || dia>31)
				{
			    System.out.print("Data incorreta. Favor informar entre as datas 1 e 31");
				}
				System.out.print("\nInforme o horário do evento [0 até 23]: ");
				hora= ler.nextInt();
				if(hora<0 || hora>24){
				System.out.print("Horário incorreto. Favor informar entre os horário de 0 e 23");
				}
				System.out.print("\nObrigado. Qual evento você gostaria de adicionar? ");
				agenda[hora][dia-1]= ler.nextLine();
				System.out.print("\nEvento adicionado com sucesso!");
				System.out.print("\n\nDeseja informar um novo evento? [S/N]: ");
				continuar= ler.next().charAt(0);
				
				} while (continuar == 'S' || continuar == 's');	 
	
		
				
			System.out.print("\nGostaria de mostrar a agenda atual? [S/N]: ");
			continuar= ler.next().charAt(0);
			if (continuar == 'S' || continuar == 's')
			{
				
				System.out.printf("TO DO LIST - ", nome,"\n");
				for (int linha = 0; linha < 24; linha++)
				{
					for (int coluna = 0; coluna < 31; coluna++)
					{
						
						if (agenda[linha][coluna]!=null);
						{
							
							System.out.printf("\n | Dia %d ", (coluna+1), " às %d ", (linha) + ":00 | : ", agenda[linha][coluna] , " ");
						}
						
					}
				}

			}
			System.out.print("\nDeseja recomeçar? [S/N]: ");
			continuar= ler.next().charAt(0);
			
	
			}while (continuar == 'S' || continuar == 's');
			
	}
}