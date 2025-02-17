package aula3_17_02;

import java.util.Scanner;

public class ExB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double celsius, fahrenheit;

		System.out.println("----------Calculadora que converte Farenheit em Celsius----------");

		System.out.print("Digite a temperatura em graus Fahrenheit: ");

		fahrenheit = sc.nextDouble();

		celsius = ((fahrenheit - 32) * 5) / 9;

		System.out.println("A temperatura em Celsius é: " + String.format("%.0f", celsius) + "C");

	}

}
