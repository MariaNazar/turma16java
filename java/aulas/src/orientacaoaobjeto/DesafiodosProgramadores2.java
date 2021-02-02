package orientacaoaobjeto;

import java.util.Scanner;

import entidades.Pessoa;

public class DesafiodosProgramadores2 {


    public static void main (String [] args) {
    	Scanner ler = new Scanner (System.in);
    	Pessoa persona1= new Pessoa ();	
    	int idadePessoa;
    	
    System.out.print("Digite seu nome :");
    persona1.nome= ler.next();
    
    System.out.print("Digite seu ano de nascimento :");
    persona1.anoNascimento= ler.nextInt();
    
    System.out.print("Digite seu sexo (F para feminino e M para masculino) :");
    persona1.sexo= ler.next().toUpperCase().charAt(0);
    
    
    
    idadePessoa =persona1.idade();
	System.out.printf("Oi %s, sua idade aproximada é %d anos!!", persona1.nome, idadePessoa);

	System.out.println(persona1.statusIdade());

    }
	

}
