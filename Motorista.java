package transportadora;

public class Motorista {

	private String nome;
	private String cnh;
	private String contato;
	private String endereco;
	
	Motorista(String nome, String cnh, String contato, String endereco){
		this.nome = nome;
		this.cnh = cnh;
		this.contato = contato;
		this.endereco = endereco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;		
	}
	
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getCnh() {
		return this.cnh;		
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getContato() {
		return this.contato;		
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;		
	}
}
