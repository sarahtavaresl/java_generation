package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1_list {

	public static void main(String[] args) {

		ArrayList<String> listaCores = new ArrayList<String>();

		// Sempre que precisamos de um dado do usuário usamos o Scanner
		Scanner leia = new Scanner(System.in); // sempre precisamos importar o Scanner também ctrl+shift+o

		for (int contador = 0; contador < 5; contador++) {

			String cor;//Essa várial só existe dentro desse for, porque pedimos do usuário
			System.out.println("Digite uma cor: ");
			cor = leia.nextLine(); // O nextLine é um método da classe Scanner para armazenar String como mais de
									// uma palavra

			listaCores.add(cor);

		} 
		System.out.println("####################");
		// for each: não precisamos criar as condições, só criar a variável e informar a lista
		for (String cor : listaCores) {

			System.out.println(cor);
		}
		listaCores.sort(null);
		
		System.out.println("####################");
		for (String cor : listaCores) {

			System.out.println(cor);
		}
		
		
	}

}
