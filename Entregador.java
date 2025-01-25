package transportadora;

public class Entregador {

	private String nome;
	private String cpf;
	private String contato;
	private String endereco;
	
	Entregador(String nome, String cpf, String contato, String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
		this.endereco = endereco;

	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
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
