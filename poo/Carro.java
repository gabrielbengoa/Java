// @author Gabriel Barros Bengoa

package poo;

import java.util.Random;

public class Carro {
	int ano;
	String cor;
	
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
		System.out.println("       _____________");
		System.out.println("      /       /      \\");
		System.out.println(" ____/_______/________\\");
		System.out.println("[0[\\\\[0[___   | -  ____|");
		System.out.println("\\_____|/, \\|_____|/,  \\/");
		System.out.println("  \\\\_ \\\\__/      \\\\___/");
		System.out.println("___________________________");
	}
	
	void ligar() {
		System.out.println("engine ON........");
	}
	
	void desligar() {
		System.out.println("engine OFF........");
	}
	
	void acelerar() {
		System.out.println("vrummmmmmmmm");
	}

}
