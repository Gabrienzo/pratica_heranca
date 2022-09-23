package br.ufrn.imd.domain;

public class ProdutoDuravel extends Produto{
	
	private int durabilidade; //em anos

	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}

	@Override
	public String toString() {
		return "Produto Duravel [nome = " + getNome() + ", preco = " + getPreco() + ", marca = " + getMarca() + ", descricao = " + getDescricao()
				+ ", dataFabricacao = " + getDataFabricacao() + ", Durabilidade = " + durabilidade + "]";
	}
	
	

}
