package consumo_agua;

import java.util.Scanner;

public class Consumo_de_Agua {

	
	double consumo,preco_total,preco_fixo,desconto,consumo_atual,taxa,preco_ativado;
	Scanner ler = new Scanner (System.in) {{
	
    System.out.println("------------------------------------");
    System.out.println("-----Sistema de Consumo de Àgua-----");
    System.out.println("------------------------------------");
    System.out.println("");
    
    consumo =ler.nextDouble().
   
    preco_total=0;
    preco_fixo=0;
    desconto=0;
    consumo_atual=0;
    taxa=0;
    preco_ativado=0;
    
    // consumo120
    
    if(consumo<=10) {
    	preco_total=7;
    	preco_fixo=7;
    	consumo_atual=consumo;
    }
    if((consumo>10) && (consumo<=30)){
    	preco_fixo=7;
    	desconto=10;
    	taxa=1;
    }
    if((consumo>30) && (consumo<=100)){
    	preco_fixo=7+20;
    	desconto=30;
    	taxa=2;
    }
   if(consumo>100) {
	   preco_fixo=7+20+140;
	   desconto=100;
	   taxa=5;
   }
consumo_atual=consumo-desconto;
preco_ativado=taxa*consumo_atual;
preco_total=preco_fixo+preco_ativado;

System.out.println("==> preco toatal a ser pago:"+preco_total);



}

}	
