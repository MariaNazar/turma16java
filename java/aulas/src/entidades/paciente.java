package entidades;

public class paciente {
        public String nome;
        public int idade;
        public int condicao=0; // de 1-4 (1 leve sem necessidade de internacao, 4 urgencia internar
        public String urgencia; //Leve, moderado, intenso, emergencia
        public char genero;
        
        
        public String statusPaciente()
    	{
    		
    		String mensagem;
    		String urgencia;
    		
    	if (condicao ==1)
    	{
    	 mensagem=" pode se tratar em casa. ";	
    	}
    	else if (condicao == 2) 
    	{
    	 mensagem= "pode se tratar em casa mas com aten��o.";	
    	}
    	else if (condicao == 3)
    	{
    	mensagem= "precisa de observa��o hospitalar. ";	
    	}
    	else
    	{
    	mensagem= "precisa de interna��o hospitalar. ";	
    	}
    	
    	return mensagem;
    	}
}