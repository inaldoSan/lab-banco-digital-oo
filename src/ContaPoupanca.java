
public class ContaPoupanca extends Conta {

	private static final double TAXA_MENSAL = 5.0; 
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	protected double getTaxaMensal() {
        return TAXA_MENSAL;
    }
}
