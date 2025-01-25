package calculo_resistencia;

import java.util.Scanner;

public class Resistencia_serie_paralelo {

	public static void main(String [] args) {
		
		double r1;
		double r2;
		double r3;
		String sair;
		
		Scanner ler = new Scanner(System.in);
		
		while(true) {
		
		System.out.printf("Digite o valor de r1:");
		r1 = ler.nextDouble();
		
		System.out.printf("Digite o valor de r2:");
		r2 = ler.nextDouble();
		
		System.out.printf("Digite o valor de r3:");
		r3 = ler.nextDouble();
		
		System.out.printf("Digite 1 ou 2 para saber se a resistência está em série ou paralela:");
		String opcao = ler.next();
		
		double resistencia;
		
		switch (opcao) {
		case "1":{ 
		     resistencia = r1 + r2 + r3;
		     break;
		}
		case "2":{
			resistencia = (1/r1) + (1/r2) + (1/r3);      
		    break;
		}       
		default :{
			System.out.println("Opção inválida");
			resistencia = 0;
		}
		
		}
		System.out.println("ResistênciaTotal é igual a:" + resistencia);
		
		System.out.println("Deseja continuar? Sim e Não");
		sair = ler.next();
		break;
		
	}

}

}
	
	