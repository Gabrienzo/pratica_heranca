package br.ufrn.imd.domain;

import java.util.Calendar;
import java.util.Date;

public class ProdutoNaoDuravel extends Produto{

	private Date dataValidade;
	private String genero; //alimentício, limpeza, vestuário, higiene pessoal, etc...
	
	//getters e setters
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(int d, int m, int a) {
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DATE, d);
		data.set(Calendar.MONTH, (m-1));
		data.set(Calendar.YEAR, a);
		this.dataValidade = data.getTime();
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//to string
	@Override
	public String toString() {
		return "Produto Não Duravel [nome = " + getNome() + ", preco = " + getPreco() + ", marca = " + getMarca() + ", descricao = " + getDescricao()
		+ ", dataFabricacao = " + getDataFabricacao() + ", Data de Validade = " + dataValidade + ", Genero = " + genero + "]";
	}
	
	
	
	
}
