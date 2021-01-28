package aulas;

import java.util.Scanner;

public class Conta 
{
	

	public static void main(String[] args) 
	{

        Scanner ler = new Scanner(System.in);
		
		String continua;
		int tipoConta;
		double valor;
		String descricao;
		double saldo = 0.0;
		String movimento = "";
		
		
		System.out.println("Banco G2");
		System.out.println("10 minutos pra fazer");
		System.out.println("1 - CONTA POUPANÇA"); //IGOR
		System.out.println("2 - CONTA CORRENTE"); // KAREN
		System.out.println("3 - CONTA ESPECIAL"); // JEAN
		System.out.println("4 - CONTA EMPRESA"); // CASAO
		System.out.println("5 - CONTA ESTUDANTIL"); // MARIA
		System.out.println("6 - SAIR");
		System.out.print("\nSelecione o tipo da conta: ");
		tipoConta = ler.nextInt();
		

			    if(tipoConta == 5) {

                int resposta=0;
                double valorEstudantil=5000.00;
				
				System.out.println("Selecione o movimento (D/C): ");
				movimento = ler.next();
				System.out.println("Informe o valor: ");
				valor = ler.nextDouble();
				System.out.println("Informe a descrição: ");
				descricao = ler.next();
                System.out.println("Deseja empréstimo estudantil? 1 para sim e 2 para não.");
                resposta= ler.nextInt();   
                
                else if (resposta==1) {
                System.out.print ("O valor disponível é de R$"+valorEstudantil); 	
                }
                else 
                {
                	   
				System.out.println("Saldo atual: " + saldo);
				System.out.println("Continua? (S/N): ");
				continua = ler.next();			
                }
			
			    }
		}
	}
		