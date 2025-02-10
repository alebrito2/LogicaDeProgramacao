package aula2_10_02;

import java.util.Scanner;

public class ProblemaQuadro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = largura * altura;
		double perimetro = (altura + altura) + (largura + largura);
		double diagonal = Math.sqrt((altura * altura) + (largura * largura));
		
		System.out.println("Á = "+ String.format("%.4f", area));
		System.out.println("PERÍMETRO = "+ String.format("%.4f", perimetro));
		System.out.println("DIAGONAL = "+ String.format("%.4f", diagonal));
		
		sc.close();
		
	}

}
