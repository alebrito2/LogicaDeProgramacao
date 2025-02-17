package aula3_17_02;

import java.util.Scanner;

public class ExA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.println("----------Calculadora que converte Celsius em Fahreinheit----------");
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		
		celsius = sc.nextDouble();
		
		fahrenheit = celsius * 9 / 5 + 32;
		
		System.out.println("A temperatura em Fahreinheit é: "+ fahrenheit+"F");

	}

}
