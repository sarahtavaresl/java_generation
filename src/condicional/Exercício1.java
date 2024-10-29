package condicional;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroA, numeroB, numeroC, soma;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número A");
		numeroA = leia.nextInt();

		System.out.println("Digite o número B");
		numeroB = leia.nextInt();

		System.out.println("Digite o número C");
		numeroC = leia.nextInt();

		soma = (numeroA + numeroB);

		if (soma > numeroC) {
			System.out.println("A soma de A + B é maior que C");
		} else if (soma < numeroC) {
			System.out.println("A soma de A + B é menor que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}

	}

}
