package aula3_17_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculo_Imc {

	public static void main(String[] args) {
		
		double peso, altura, imc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------Programa para calcular o IMC----------");
		System.out.print("Digite o seu peso: ");
		peso = sc.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		altura = sc.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc < 17) {
			System.out.println("IMC: "+String.format("%.2f", imc)+" Você está muito abaixo do peso!!");
		}else if(imc > 17 && imc <18.50) {
			System.out.println("IMC: "+String.format("%.2f", imc)+" Abaixo do peso!!");
		}else if(imc > 18.49 && imc < 25) {
			System.out.println("IMC: "+String.format("%.2f", imc)+" Seu peso está normal!!");
		}else if(imc > 24.99 && imc < 30) {
			System.out.println("IMC: "+String.format("%.2f", imc)+" Você está acima do peso");
		}else if(imc > 29.99 && imc < 35) {
			System.out.println("IMC: "+String.format("%.2f", imc)+" Obesidade 1");
		}else if(imc > 34.99 && imc < 40) {
			System.out.println("IMC: "+String.format("%.2f", imc)+" Obesidade severa!!");
		}else if(imc > 39.99) {
			System.out.println("IMC: "+String.format("%.2f", imc)+" Obesidade mórbida!!");
		}
	}

}
