package Aula_12b;

public class Peixe extends Animal {

	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo substāncias");
	}
	@Override
	public void emitirSom() {
		System.out.println("Soltou uma bolha");
	}
	
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	
	
}
