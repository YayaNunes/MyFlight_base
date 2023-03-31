package pucrs.myflight.modelo;

public class Aeronave implements contavel {
	private String codigo;
	private String descricao;
	private static int quantidadeObjetosCriados = 0;

	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
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
