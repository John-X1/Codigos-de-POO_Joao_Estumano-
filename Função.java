package funçao;

import java.util.Scanner;

public class Função {
	
	public static void main(String [] args) {
		
		int x;
		int a;
		int b;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("x=");
		x = ler.nextInt();
		
		System.out.printf("a=");
		a = ler.nextInt();
		
		System.out.printf("b=");
		b = ler.nextInt();
		
	    float fx = a*(x)+b;
		
		System.out.println("f("+x+")=" +a+"*("+x+")+"+b);
		System.out.printf("f("+x+")=%.0f",fx);
	
	}

}     
