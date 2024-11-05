package estrutura.dados;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		int numero = 0;
		String livro;
		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da Pilha ");
			System.out.println("3: Retirar um livro da pilha ");
			System.out.println("0: Sair ");

			System.out.println("Escolha uma opção: ");

			numero = leia.nextInt();

			switch (numero) {
			case 1:
				
				System.out.println("Digite um livro");
				leia.skip("\\R?"); // para conseguir usar o nextLine
				livro = leia.nextLine();//para ler o nome completo do livro
				stack.add(livro);
				System.out.println(" livro adicionado");

				break;

			case 2:
				System.out.println("Lista de Livros: ");
				System.out.println(stack);

				break;

			case 3:
				if (stack.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					stack.pop();
					System.out.println("Livro retirado");

				}
				break;

			}
		} while (numero != 0); ///

	}

}
