package aula3_17_02;

import java.util.Scanner;

public class ExC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double altura, raio;
		
		System.out.println("Olá, este é um programa que calcula o volume da uma Lata");
		
		System.out.print("Para começar: digite a altura da lata: ");
		altura = sc.nextDouble();
		
		System.out.print("Digite o raio da lata: ");
		raio = sc.nextDouble();
		
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.println("O volume foi calculado: "+ String.format("%.2f", volume/1000));

	}

}
