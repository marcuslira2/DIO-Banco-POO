package main;

public class Main {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		joao.setNome("joao");
		Cliente marcus = new Cliente();
		marcus.setNome("Marcus");
		
		
		Conta contaCorrente = new ContaCorrente(joao);
		Conta contaPoupança = new ContaPoupança(marcus);
		
		contaCorrente.extrato();
		contaPoupança.extrato();
		
		contaCorrente.depositar(100.0);
		
		contaCorrente.extrato();
		contaPoupança.extrato();
		
		contaCorrente.transferir(100.0, contaPoupança);
		
		contaCorrente.extrato();
		contaPoupança.extrato();
		

	}

}
