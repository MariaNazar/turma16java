package orientacaoaobjeto;

public class ExercicioEncapsulamento1 {
   public static void main (String [] args)
   {
	 Fornecedor empresa1= new Fornecedor("Maria","Ipiranga", "11968733055", 1500,1000);
     
	 empresa1.setValorCredito(1500);
	 empresa1.setValorDivida(1000);
	 
	 System.out.println(empresa1.nome+"\n"+empresa1.endereco+ "\n"+ empresa1.telefone);
	 
	 System.out.print(empresa1.getObterSaldo());
   }
}
