package sintaxe_variaveis_e_convenções;

public class TestaLacos {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10 ; multiplicador++) {
			System.out.println("Tabuada do " + multiplicador + "\n");
			for(int contador = 0; contador <=10 ; contador ++) {
				System.out.print(multiplicador + " x " + contador + " = " + multiplicador * contador + "\n");
			}
			System.out.println();
			
		}
		
	}

}
//código feito de maneira mais bonita.