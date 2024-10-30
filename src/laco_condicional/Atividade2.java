package laco_condicional;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		int numero, par = 0, impar = 0, contador;

		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "º número:");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par = par + 1;

			} else {
				impar = impar + 1;

			}
		}
		System.out.println("O total de números pares:" + par);
		
		System.out.println("O total de números ímpares: " + impar);
		
	}

}
