package aula2_10_02;

import java.util.Scanner;

public class ProblemaAlturaMedia {

	public static void main(String[] args) {

		String pessoa1, pessoa2;
		double alturaP1, alturaP2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		pessoa1 = sc.nextLine();
		
		System.out.println("Digite sua altura: ");
		alturaP1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o seu nome: ");
		pessoa2 = sc.nextLine();
		
		System.out.println("Digite sua altura: ");
		alturaP2 = sc.nextDouble();
		
		double mediaAltura = (alturaP1 + alturaP2) / 2;
		
		System.out.println("A altura média de "+ pessoa1 + " e "+ pessoa2 +" é de "+ String.format("%.2f", mediaAltura));

	}

}
