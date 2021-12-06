package main;

public abstract class Conta implements InterfaceConta {
	private static int AGENCIA_PADRAO = 1;
	private static int  SEQUENCIAL= 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	@Override
	public void sacar(Double valor) {
		this.saldo-= valor;
	}
	@Override
	public void depositar(Double valor) {
		this.saldo+= valor;
	}
	@Override
	public void transferir(Double valor,Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}

}
