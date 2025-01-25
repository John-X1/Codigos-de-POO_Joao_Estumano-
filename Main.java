package pescaesportiva;

public class Main {

	public static void main(String [] args) {
		
		Local local_1 = new Local("Tv. Carlos Maria Teixeira", "Oriximiná", "68270-000", "234253.53", "2342325.52");
		
		Local local_2 = new Local();
		
		local_1.imprimir();
		System.out.println("");
		local_2.imprimir();
		
		Competicao competicao = new Competicao("OrixiPesca", "21/01/2025", "Local_1");
		Competicao competicao1 = new Competicao("OrixiPesca", "21/01/2025", "local_2");
	}
	
	
	
}
