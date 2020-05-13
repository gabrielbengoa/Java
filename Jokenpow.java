// @author Gabriel Barros Bengoa

package exercicios;

import java.util.Scanner;

public class Jokenpow {

	public static void main(String[] args) {
		int jogador;
		@SuppressWarnings("resource")
		Scanner mao = new Scanner (System.in);
		System.out.println("____Jo-Ken-Pow____");
		System.out.println("__________________");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = mao.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("JOGADOR ESCOLHEU PEDRA");
			break;
		case 2:
			System.out.println("JOGADOR ESCOLHEU PAPEL");
			break;
		case 3:
			System.out.println("JOGADOR ESCOLHEU TESOURA");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		}
		
		int sorteio;
		sorteio = (int) (Math.random() * 3 + 1);
		switch (sorteio) {
		case 1:
			System.out.println("COMPUTADOR ESCOLHEU PEDRA");
			break;
		case 2:
			System.out.println("COMPUTADOR ESCOLHEU PAPEL");
			break;
		case 3:
			System.out.println("COMPUTADOR ESCOLHEU TESOURA");
			break;
		}
		if (jogador != sorteio) {
			if ((jogador == 1 && sorteio == 3) || (jogador == 2 && sorteio == 1) || (jogador == 3 && sorteio == 2)) {
				System.out.println("JOGADOR VENCEU (:-D)");
		} else {
			System.out.println("COMPUTADOR VENCEU (D-X)");
		}
		} else {
			System.out.println("EMPATE (O.O)");
		}

	}

}