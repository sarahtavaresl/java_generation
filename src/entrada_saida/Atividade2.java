package entrada_saida;

import java.util.Scanner;

public class Atividade2 {
public static void main(String[] args) {
	
	float nota1, nota2, nota3, nota4, media;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite a nota 1:");
	nota1 = leia.nextFloat();
	
	System.out.println("Digite a nota 2:");
	nota2 = leia.nextFloat();
	
	System.out.println("Digite a nota 3:");
	nota3 = leia.nextFloat();
	
	System.out.println("Digite a nota 4:");
	nota4 = leia.nextFloat();
	
	media = (nota1+nota2+nota3+nota4)/4;
	System.out.println("A sua média é: "+media);
}
}
