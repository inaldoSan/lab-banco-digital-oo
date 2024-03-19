
public class ContaCorrente extends Conta {
	private static final double TAXA_MENSAL = 10.0;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	protected double getTaxaMensal() {
        return TAXA_MENSAL;
    }

	

}
