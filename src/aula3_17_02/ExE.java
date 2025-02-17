package aula3_17_02;

import java.util.Scanner;

public class ExE {

	public static void main(String[] args) {
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		
		double valor;
		int tempoEmDias;
		
		System.out.println("Bem-vindo, usuário!");
		System.out.println("Para emitir o boleto com o valor atualizado da sua conta, insira os campos abaixo: ");
		System.out.print("Valor do bem: ");
		valor = sc.nextDouble();
		
		System.out.println("A taxa de atraso por dias é de 2%");
		System.out.print("Digite a quantidade de dias em atraso: ");
		tempoEmDias = sc.nextInt();
		
		//Processamento de dados
		double taxa = 2.0/100;
		double prestacao = valor + (valor * taxa * tempoEmDias);
		
		//Saída de dados
		System.out.println("O valor da prestação com o Juros é: "+ prestacao);

	}

}
