package Aula_11b;

public abstract class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//M�todos
	public final void fazerAniv() {
		this.idade++;
	}

	
	//M�todo Especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
	
 
}
