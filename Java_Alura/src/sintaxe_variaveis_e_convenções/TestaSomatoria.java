package sintaxe_variaveis_e_convenções;

public class TestaSomatoria {
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while (contador <= 10) {
			total = total + contador;	
			contador++;
		}
		System.out.println(total);
		//variáveis inicializadas dentro do escopo while nao funcionam corretamente, pois toda vez
		//que a estrutura inicializar, será criado uma nova variavel
	}

}
