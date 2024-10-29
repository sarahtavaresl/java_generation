package condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, resultado;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		resultado = numero % 2;
	
		// esse if verifica se o numero é par
		if(resultado == 0) {
			if(numero>=0) {
				System.out.println("O número é par e positivo");		
			}
			else {
				System.out.println("O número é par e negativo");	
			}
		}else {
			if(numero>=0) {
				System.out.println("O número é ímpar e positivo");		
			}
			else {
				System.out.println("O número é ímpar e negativo");	
			}	
		}
	}

}
