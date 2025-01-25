package pescaesportiva;

public class Local {

	//Atributos
	String endereco;
	String cidade;
	String cep;
	String latitude;
	String longitude;
	
	//Construtor
	Local(String endereco, String cidade, String cep, String latitude, String longitude){
		
		//Inicializando os atributos
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.latitude = latitude;
		this.longitude = longitude;
				
	}
	
	Local(){ //Declarando um objeto de teste
		this.endereco = "Rua 1";
		this.cidade = "Oriximiná";
		this.cep = "68270-000";
		this.latitude = "0000000.00";
		this.longitude = "222222.34";		
		
	}
	
	
	//Métodos
	public void imprimir() {
		System.out.println("Endereço = "+ this.endereco);
		System.out.println("Cidade = "+ this.cidade);
		System.out.println("CEP = "+ this.cep);
		System.out.println("Latitude = "+ this.latitude);
		System.out.println("Longitude = "+ this.longitude);
	
	}
	
	public void checarCEP() {
		
	}
	
	
	
	
	
}
