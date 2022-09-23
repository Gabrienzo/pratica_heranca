package br.ufrn.imd.domain;

import java.util.Date;

public class ProdutoNaoDuravel extends Produto{

	private Date dataValidade;
	private String genero; //alimentício, limpeza, vestuário, higiene pessoal, etc...
	
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Produto Não Duravel [nome = " + getNome() + ", preco = " + getPreco() + ", marca = " + getMarca() + ", descricao = " + getDescricao()
		+ ", dataFabricacao = " + getDataFabricacao() + ", Data de Validade = " + dataValidade + ", Genero = " + genero + "]";
	}
	
	
	
	
}
