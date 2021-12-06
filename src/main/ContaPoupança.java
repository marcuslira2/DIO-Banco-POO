package main;

public class ContaPoupança extends Conta {
	
	
	public ContaPoupança(Cliente cliente) {
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
