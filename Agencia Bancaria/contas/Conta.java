package contas;

public class Conta {
	//atributos
	public String cliente;
	public double saldo;
	
	//construtor
	public Conta() {
		System.out.println("Agência 0267");
	}
	
	//método sem retorno
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	// método sem retorno com parâmetros(dados = variáveis)
	void sacar(double valor) {
		saldo -= valor; //saldo = saldo - valor
		System.out.println("Débito: " + valor);
	}
	
	void depositar(double valor) {
		saldo += valor; //saldo = saldo + valor
		System.out.println("Crédito: " + valor);
	}
	
	// método sem retorno com objeto
	// Conta -> classe modelo
	// destino é o objeto
	void transferir(Conta destino, double valor) {
		this.sacar(valor); //1º você debita da conta
		destino.depositar(valor); //2º transferência
		System.out.println("Transferência: " + valor);
	}
	
	// método com retorno
	double soma(double conta1, double conta2) {
		double total = conta1 + conta2;
		return total;
	}
}
