package Aula_12b;

public class Reptil extends Animal {
	
	private String corEscama;
	
	
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetais");
	}
	@Override
	public void emitirSom() {
		System.out.println("som de R�ptil");
	}
	
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
	
}
