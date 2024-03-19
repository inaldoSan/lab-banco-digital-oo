
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.imprimirExtrato();
		cc.aplicarTaxaMensal();
		cc.imprimirExtrato();
		cc.pedirEmprestimo(50);
		cc.imprimirExtrato();

	}

}
