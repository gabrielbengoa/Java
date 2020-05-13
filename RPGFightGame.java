// @author Gabriel Barros Bengoa

package exercicios;
import java.util.Scanner;
import java.util.Random;


public class RPGFightGame {
	
	static int ataqueHeroi() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha seu ataque:");
		System.out.println("(1) - Espada");
		System.out.println("(2) - Magia de Gelo");
		System.out.println("(3) - Magia de Cura");
		
		return leitor.nextInt();
	}
	
	static int ataqueDragao() {
		Random gerador = new Random();
		return gerador.nextInt(3)+1;
	}
	
	static void imprimeHP(int hpHeroi, int hpDragao, int contagemEspeciais) {
		System.out.println("=================");
		System.out.println("- HP Herói: " + hpHeroi);
		System.out.println("- HP Dragão: " + hpDragao);
		System.out.println("* Contagem Especiais: " + contagemEspeciais);
		System.out.println("=================");
	}
	
	static void batalha() {
		int hpHeroi = 150;
		int hpDragao = 100;
		int contagemEspecial = 5;
		int escolhaAtaque;
		while(hpHeroi > 0 && hpDragao > 0) {
			imprimeHP(hpHeroi, hpDragao, contagemEspecial);
			escolhaAtaque = ataqueHeroi();
			switch(escolhaAtaque){
			case 1:
				System.out.println("Herói usou a espada.");
				hpDragao -= 10;
				break;
			case 2:
				System.out.println("Herói usou magia de gelo.");
				hpDragao -= 35;
				break;
			case 3:
				System.out.println("Herói se curou.");
				hpHeroi += 25;
				break;
			default:
				System.out.println("Opção invalida.");
				break;
			}
			if(hpDragao > 0) {
				escolhaAtaque = ataqueDragao();
				switch(escolhaAtaque) {
				    case 1:
				    	System.out.println("Dragão usou as garras.");
				    	hpHeroi -= 10;
				    	break;
				    case 2:
				    	System.out.println("Dragão usou a investida.");
				    	hpHeroi -= 15;
				    	break;
				    case 3:
				    	System.out.println("Dragão usou a baforada de fogo.");
				    	hpHeroi -= 40;
				    	break;				    	
				}
			}
			else {
				System.out.println("O Dragão está morto.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int continua = 1;
		while(continua == 1) {
			
			batalha();
			
			System.out.println("Fim de jogo. Deseja continuar? (1) Sim (2) Não");
			continua = leitor.nextInt();
		}

	}

}
