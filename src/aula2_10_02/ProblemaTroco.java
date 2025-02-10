package aula2_10_02;

import java.util.Scanner;

public class ProblemaTroco {

	public static void main(String[] args) {
		
		double troco;
		double precoUnitario, valorDinheiroCliente, valorTotal;
		int unidade;
		
		System.out.println("Qual o valor unitario do produto: ");
		Scanner sc = new Scanner(System.in);
		precoUnitario = sc.nextDouble();
		
		System.out.println("Quantidade comprada");
		unidade = sc.nextInt();
		
		valorTotal = precoUnitario * unidade;
		
		System.out.println("Qual o valor em dinheiro que o cliente entregou?");
		valorDinheiroCliente = sc.nextDouble();
		
		troco = valorDinheiroCliente - valorTotal;
		
		System.out.println("TROCO = " + troco);

	}

}
