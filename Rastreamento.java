package transportadora;

public class Rastreamento {

	private String codigo;
	private boolean status;
	private String localizacao;
	private Veiculo veiculo;
	private String data;
	private String hora;
	
	Rastreamento(String codigo, boolean status, String localizacao, Veiculo veiculo, String data, String hora){
		this.codigo = codigo;
		this.status = status;
		this.localizacao = localizacao;
		this.veiculo = veiculo;
		this.data = data;
		this.hora = hora;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigo() {
		return this.codigo;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getLocalizacao() {
		return this.localizacao;
}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Veiculo getVeiculo() {
		return this.veiculo;
}	
	public void setData(String data) {
	this.data = data;
}
	public String getData() {
	return this.codigo;
}
	public void setHora (String hora) {
	this.hora = hora;
}
	public String getHora() {
	return this.hora;
}
}

	

