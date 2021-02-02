package orientacaoaobjeto;

import entidades.ContaBancaria;

public class Exercicio6POO {
            
	public static void main (String [] args)
    {
        ContaBancaria numeroConta= new ContaBancaria(112233,"Maria Lima","Corrente",127.90);
        ContaBancaria nomeUsuario= new ContaBancaria(112233,"Maria Lima","Corrente",127.90);
        ContaBancaria tipoConta= new ContaBancaria(112233,"Maria Lima","Corrente",127.90);
        ContaBancaria saldoBancario= new ContaBancaria(112233,"Maria Lima","Corrente",127.90);
        
         System.out.println("Conta\tNome\t\tTipo Conta\tSaldo");   
         System.out.print(numeroConta.numeroConta+"\t"+nomeUsuario.nomeUsuario+"\t"+ tipoConta.tipoConta+"\t"+ saldoBancario.saldoBancario);
	}
}
