package aula2_10_02;

import java.util.Scanner;

public class ProblemaPiso {

	public static void main(String[] args) {
		
		double largura;
		double comprimento;
		double custo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a Largura do cômodo: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite a comprimento do cômodo: ");
		comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado do piso: ");
		custo = sc.nextDouble();
		
		double area = largura * comprimento;
		
		double custoTotal = custo * area;
		
		System.out.println("Área do cômodo: " + String.format("%.2f", area));
		System.out.print("Custo total do piso = " + String.format("%.2f", custoTotal));

	}

}
