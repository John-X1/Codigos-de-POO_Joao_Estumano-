package transportadora;

public class Pacote {

	private double peso;
	private double volume;
	private String codigo;
	private String tamanho;
	private double valor_Estimado;
	private String descricao;
	
	Pacote(double peso, double volume, String codigo, String tamanho, double valor_Estimado, String descricao){
		this.peso = peso;
		this.volume = volume;
		this.codigo = codigo;
		this.tamanho = tamanho;
		this.valor_Estimado = valor_Estimado;
		this.descricao = descricao;

	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getVolume() {
		return this.volume;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigo() {
		return this.codigo;
    }
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getTamanho() {
		return this.tamanho;
    }
	
	public void setValorEstimado(double valor_Estimado) {
		this.valor_Estimado = valor_Estimado;
	}
	public double getValorEstimado() {
		return this.valor_Estimado;
    }
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
    }
	
}
