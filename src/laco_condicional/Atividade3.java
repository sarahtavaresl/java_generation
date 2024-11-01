package laco_condicional;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		int idade, idadeMenor21 = 0, idadeMaior50 = 0;

		Scanner leia = new Scanner(System.in); 
		
		while (true) {//usado quando não sabemos a quantidade exata de repetições
			
			System.out.println("Digite uma idade ");
			idade = leia.nextInt();

			if (idade < 0) { //se o laço é menor que 0 então é interrompido
				break; // palavra reservada usada para interromper o laço

			} else if (idade < 21) { // aqui foi usado uma condição para identificar se a idade é menor que 21
				idadeMenor21++; // ++ no exemplo da atividade ele foi rodado 5 vezes
			} else if (idade > 50) { // aqui foi usado novamente para identificar se a aidade é maior que 50
				idadeMaior50++; //no exemplo da atividade foi rodado 3 vezes
			}

		}                                                //é necessário o operador + entre o texto e a variável
		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor21);

		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior50);

	}

}
