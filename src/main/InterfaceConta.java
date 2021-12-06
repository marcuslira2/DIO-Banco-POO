package main;

public interface InterfaceConta {
	void sacar(Double valor);
	void depositar(Double valor);
	void transferir(Double valor,Conta conta);
	void extrato();
}
