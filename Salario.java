package salario;

import java.util.Scanner;

public class Salario {

	public static void main(String [] args) {	
	
	double Salario_fixo, Montante_total_das_vendas;
	
	Scanner ler = new Scanner(System.in);	
	System.out.printf("Digite o seu nome: ");
	String nome = ler.next();	
	
	System.out.printf("Digite o valor do seu salário: ");
	Salario_fixo = ler.nextDouble();
	
	System.out.printf("Digite o total de vendas efetuadas: ");
	Montante_total_das_vendas = ler.nextDouble();
	
	double comissao = Montante_total_das_vendas * (0.15);	
	double Total_a_Receber = Salario_fixo + comissao;
	
	System.out.printf("TOTAL = R$ %.2f", Total_a_Receber);
							
		
}

}