package pucrs.myflight.modelo;

public class Aeronave implements contavel {
	private String codigo;
	private String descricao;
	private int capacidade;
	private static int quantidadeObjetosCriados = 0;

	public Aeronave(String codigo, String descricao, int capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
		quantidadeObjetosCriados++;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
    
    public int getQuantidadeObjetosCriados() {
        return quantidadeObjetosCriados;
    }
    
   
}
