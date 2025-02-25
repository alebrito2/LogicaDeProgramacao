package aula3_17_02;

import java.util.Scanner;

public class ExH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double comprimento, largura, altura;
		
		System.out.print("Digite o comprimento: ");
		comprimento = sc.nextDouble();
		
		System.out.print("Digite a largura: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite a altura: ");
		altura = sc.nextDouble();
		
		double volume = comprimento * largura * altura;
		
		System.out.println("O volume é igual a: "+ volume);
	}

}
