package aula3_17_02;

import java.util.Scanner;

public class ExG {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("Digite os valores de A, B, C e D");
		
		System.out.print("A: ");
		a = sc.nextInt();
		
		System.out.print("B: ");
		b = sc.nextInt();
		
		System.out.print("C: ");
		c = sc.nextInt();
		
		System.out.print("D: ");
		d = sc.nextInt();
		
		int soma = (a+b+(c+(d+(b+c+(d+(c+d))))));
		
		System.out.println(soma);
		
		int mult = (a*b*(c*(d*(b*c*(d*(c*d))))));
		
		System.out.println(mult);

	}

}
