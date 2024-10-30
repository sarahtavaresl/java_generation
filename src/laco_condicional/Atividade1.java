package laco_condicional;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		int numero1, numero2;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		numero2 = leia.nextInt();

		if (numero1 < numero2) {
			int contador;
			for (contador = numero1; contador < numero2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5 ");
				}
			}

		} else {
			System.out.println("Intervalo inválido!");
		}

	}

}
