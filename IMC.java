// @author Gabriel Barros Bengoa

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		double altura,peso,resultado;
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("Cálculo do IMC");
		System.out.print("Digite a sua altura: ");
		altura = leitor.nextDouble();
		System.out.print("Digite o seu peso: ");
		peso = leitor.nextDouble();
		resultado = peso / (altura * altura);
		System.out.println("Seu indice de massa corporal é: " + formatador.format(resultado));
		if (resultado < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (resultado >= 18.5 && resultado <= 24.9) {
			System.out.println("Peso normal");
		} else {
			System.out.println("Sobrepeso");
		}
        leitor.close();
	}

}