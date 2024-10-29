package entrada_saida;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float salario, abono, novoSalario;

		System.out.println("Digite o seu salário");
		salario = leia.nextFloat();

		System.out.println("Digite o seu abono salarial");
		abono = leia.nextFloat();
		leia.close();
		novoSalario = (salario + abono);

		System.out.println("Seu novo salário é: " + novoSalario);

	}
}
