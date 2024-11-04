package estrutura.dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		int numero = 0;
		String nome;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("1 - Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente");
			System.out.println("2 - Listar todos os Clientes na fila");
			System.out.println("3 - Chamar (retirar) uma pessoa da fila ");
			System.out.println("0 - O programa deve ser finalizado. ");

			System.out.print("Escolha uma opção: ");

			numero = leia.nextInt();

			switch (numero) {
			case 1:
				System.out.println("Digite seu nome ");
				nome = leia.next();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");

				break;

			case 2:
				System.out.println("Lista de Clientes na Fila: ");
				System.out.println(fila);

				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia! ");
				} else {
					fila.remove();
					System.out.println("O Cliente foi Chamado!");

				}
				break;

			}

		} while (numero != 0); // enquanto for diferento do 0 irá continuar rodando.

	}

}
