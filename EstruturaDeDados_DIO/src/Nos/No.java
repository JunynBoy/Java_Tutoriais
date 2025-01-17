package Nos;

public class No<T> {

	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo) {
		this.conteudo = conteudo;
	}

	
	//getters e setters
	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}


	@Override
	public String toString() {
		return "\n conteudo= " + conteudo ;
	}
	
	
	
	
}
