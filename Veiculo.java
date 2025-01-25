package transportadora;

public class Veiculo {

	private String placa;
	private String modelo;
	private String capacidade;
	private String disponibilidade;
	private Motorista motorista;
	
	Veiculo(String placa, String modelo, String capacidade, String disponibilidade, Motorista motorista){
		this.placa = placa;
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.disponibilidade = disponibilidade;
		this.motorista = motorista;
	}	
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return this.placa;		
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;		
	}
	
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	public String getCapacidade() {
		return this.capacidade;		
	}
	
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getDisponibilidade() {
		return this.disponibilidade;		
	}
	
	public void setmotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public Motorista getMotorista() {
		return this.motorista;		
	}
	
	
}
