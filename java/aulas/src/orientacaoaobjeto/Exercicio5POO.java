package orientacaoaobjeto;

import entidades.Patinete;

public class Exercicio5POO {
              
	public static void main (String[] args)
	{
	   Patinete cor= new Patinete("Amarelo", 1290.00, "Yellow");
	   Patinete valor=new Patinete(1290.00, "Yellow");
       Patinete marca= new Patinete("Yellow");
	
	   System.out.println("COR\t\t VALOR\t\t MARCA");
	   System.out.print(cor.cor+"\t\t"+ valor.valor+"\t\t"+ marca.marca);
	   
	}
}
