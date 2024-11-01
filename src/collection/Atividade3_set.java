package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3_set {

	public static void main(String[] args) {
		 //precisa importar                              // precisa importar
		Set<Integer> listaNumero =  new HashSet<Integer>();
		
		Scanner leia = new Scanner (System.in);
		                                          // sempre usar chaves para executar
		for (int contador = 0; contador < 10; contador++) {
        int numero;
        System.out.println("Digite um número ");
		numero = leia.nextInt(); // aqui ele está guardando a variável que o usuário vai colocar
		listaNumero.add(numero); // estamos adicionando o número na nossa lista
		}
		// Sempre tem que importar a classe
		Iterator<Integer> numero = listaNumero.iterator();//precisamos dessa classe para imprimir na tela os números
		
		while (numero.hasNext()) {  /// para percorrer todos os números que estão na listagem.
			System.out.println(numero.next());
		}
		
	}

}
