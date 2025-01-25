package transportadora;

public class Encomenda {

	private Cliente remetente;
	private String endereco_destino;
	private String cep_destino;
	private boolean status;
	private Pacote pacote;
	private double preco;
	private Rastreamento lista_Rastreamento;
	private Entregador entregador;
	private String data_entrega;
	private String hora_entrega;
	private String data_cadastro;
	private String hora_cadastro;
	
	Encomenda(Cliente remetente, String endereco_destino, String cep_destino, boolean status, Pacote pacote, double preco, Rastreamento lista_Rastreamento, Entregador entregador, String data_entrega, String hora_entrega, String data_cadastro, String hora_cadastro, String hora_cadastro1, String cep_destino1){
		this.remetente = remetente;
		this.endereco_destino = endereco_destino;
		this.cep_destino = cep_destino1;
		this.status = status;
		this.lista_Rastreamento = lista_Rastreamento;
		this.entregador = entregador;
		this.data_entrega = data_entrega;
		this.hora_entrega = hora_entrega;
		this.data_cadastro = data_cadastro;
		this.hora_cadastro = hora_cadastro1;

	}
	
	public void setRemetente(Cliente remetente) {
		this.remetente = remetente;
	}
	public Cliente getRemetente() {
		return this.remetente;
	}
	
	public void setEndereco_destino(String endereco_destino) {
		this.endereco_destino = endereco_destino;
	}
	public String getEndereco_destino() {
		return this.endereco_destino;
	}
	
	public void setCep_destino(String cep_destino) {
		this.cep_destino = cep_destino;
	}
	public String getCep_destino() {
		return this.cep_destino;
    }
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return this.status;
    }
	
	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}
	public Pacote getPacote() {
		return this.pacote;
    }
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
    }
	
	public void setListaRastreamento(Rastreamento lista_Rastreamento) {
		this.lista_Rastreamento = lista_Rastreamento;
	}
	public Rastreamento getRastreamento() {
		return this.lista_Rastreamento;
    }
	
	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}
	public Entregador getEntregador() {
		return this.entregador;
    }
	
	public void setData_entrega(String data_entrega) {
		this.data_entrega = data_entrega;
	}
	public String getData_entrega() {
		return this.data_entrega;
    }
	
	public void setHora_entrega(String hora_entrega) {
		this.hora_entrega = hora_entrega;
	}
	public String getHora_entrega() {
		return this.hora_entrega;
    }
	
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	public String getData_cadastro() {
		return this.data_cadastro;
    }
	
	public void setHora_cadastro(String hora_cadastro) {
		this.hora_cadastro = hora_cadastro;
	}
	public String getHora_cadastro() {
		return this.hora_cadastro;
		
}
	
}
