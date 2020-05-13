// @author Gabriel Barros Bengoa

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		//<ctrl><shift><f> (alinhamento)
		//variáveis
		double nota1,nota2,media;
		//objeto leitor (usado para capturar dados)
		Scanner leitor = new Scanner(System.in);
		//objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("Cálculo da média");
		//entrada
		System.out.print("Digite a nota1: ");
		nota1 = leitor.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2 = leitor.nextDouble();
		//processamento
		media = (nota1 + nota2) / 2;
		System.out.println("Média: " + formatador.format(media));
		if (media < 2) {
			System.out.println("REPROVADO");
		} else if (media >= 2 && media < 5) {
			System.out.println("RECUPERAÇÃO");
		} else {
			System.out.println("APROVADO");
		}
        leitor.close();
	}

}
