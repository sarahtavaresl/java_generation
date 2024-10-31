package vetores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		int vetorNumerico[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int indice = 0;
		boolean numeroEncontrado = false;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número entre 1 e 10");
		int numero = leia.nextInt();
		/*
		 * sempre que usar o for e o if preciso abrir{
		 */                           // para incrementar, adicionar +1 ao valor inicial
		for (indice = 0; indice <= 9; indice++) {
			if (numero == vetorNumerico[indice]) {
				numeroEncontrado = true;
				break; // usado para parar a execução do laço condicional
				// else sempre depois do fechamento da { do if
			} else {
				numeroEncontrado = false;
			}
		}
		if (numeroEncontrado) {         // só coloco entra+ se tiver no meio da mensagem
			System.out.println("O número " + numero + " está localizado na posição: " + indice);
			
		
		} else {
			System.out.println("O número " +numero + " não foi encontrado" );
		}

	}

}
