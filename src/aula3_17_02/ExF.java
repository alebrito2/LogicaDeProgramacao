package aula3_17_02;

import java.util.Scanner;

public class ExF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Olá usuário, você deverá digitar 2 números, e o programa irá trocar um pelo outro");
		System.out.print("Digite o primeiro número: ");
		a = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		b = sc.nextInt();
		
		int troca = b;
		b = a;
		a = troca;
		
		System.out.println("Agora o primeiro número virou o segundo número digitado: A: "+ a + " B: "+ b);

	}

}
