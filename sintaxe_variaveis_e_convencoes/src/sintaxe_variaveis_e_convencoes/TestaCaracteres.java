package sintaxe_variaveis_e_convencoes;

public class TestaCaracteres {
	public static void main (String[] args) {
		
		//char guarda apenas 1 letrinha, se voce colocar 2 nao compila, e nem aspas "
		
		char letra = 'a';
		System.out.println(letra);
		
			
		char valor = 66;
		System.out.println(valor);
		
		//isso tem a ver com a tabela do Asccii e a tabela unicode
		
		valor = (char) (valor + 1);
		System.out.println(valor); 
		
		//quando agnt trabalha com dois tipos fazendo uma operação, o java retorna o resultado no maior dos tipos dele.
		// nesse caso valor é do tipo char e inteiro, logo o resultado vem em inteiro
		
		
		String palavra = "alura cursos online de tecnologia ";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
		
	}
	
	
	
}
