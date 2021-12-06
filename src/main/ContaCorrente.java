package main;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void extrato() {
		System.out.println(super.getAgencia());
		System.out.println(super.getNumero());
		System.out.println(super.cliente.getNome());
		System.out.println(super.getSaldo());
		
		
	}

	
	

	
	
	

}
