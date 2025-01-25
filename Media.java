package media;

import java.util.Scanner;

public class Media {

	public static void main(String [] args) {
	
		double n1;
		double n2;
		
		System.out.println("Algoritmo para calcular a média entre dois números");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextDouble();
		
		System.out.println("Digite o segundo número: ");
    	n2 = ler.nextDouble();
    	
        double m = (n1 + n2) / 2;
    	
    	System.out.printf("A Média é igual a: " + m);
	

   }

}