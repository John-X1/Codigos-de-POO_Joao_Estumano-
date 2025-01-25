package transportadora;

public class Transportadora {

	private String nome;
	private String cnpj;
	private String endereco;
	private String contato;
	
	Transportadora(String nome, String cnpj, String endereco, String contato){
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.contato = contato;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;		
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return this.cnpj;		
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;		
	}	
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getContato() {
		return this.contato;		
	}
	
		
	}
	
