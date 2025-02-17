package aula3_17_02;

import java.util.Scanner;

public class ExD {

	public static void main(String[] args) {

		System.out.println("Olá, este é um programa que calcula a Distância e a quantidade de litros Usados durante uma viagem");
		// Entrada de dados
		Scanner sc = new Scanner(System.in);
		int tempoGasto;
		double velocidadeMedia;

		System.out.println("Qual foi o tempo gasto na viagem?");
		tempoGasto = sc.nextInt();

		System.out.println("Qual foi a velocidade média durante o percurso?");
		velocidadeMedia = sc.nextDouble();

		// processamento de dados
		double distancia = tempoGasto * velocidadeMedia;
		double litrosUsados = distancia / 12;

		// Saída de dados

		System.out.println("A velocidade média foi: " + velocidadeMedia + "Km/h");
		System.out.println("Gastou " + tempoGasto + " horas ");
		System.out.println("Percorreu uma distância de " + distancia + "Km");
		System.out.print("Usou " + litrosUsados + " Litros de gasolina");

	}

}
