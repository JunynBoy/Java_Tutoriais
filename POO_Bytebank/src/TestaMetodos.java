
public class TestaMetodos {
	public static void main(String[] args) {
		Conta conta1 = new Conta("Joaozinho ze roela");
		conta1.deposita(200.50d);
		conta1.status();
		conta1.deposita(9000.78d);
		conta1.status();
		conta1.saca(307.90d);
		conta1.status();
		
	}
}
