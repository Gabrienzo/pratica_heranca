package br.ufrn.imd.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Produto {
	
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private Date dataFabricacao;
	
	//construtor
	public Produto() {
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(int d, int m, int a) {
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DATE, d);
		data.set(Calendar.MONTH, (m-1));
		data.set(Calendar.YEAR, a);
		this.dataFabricacao = data.getTime();
	}
	
	//hashcode e equals
	@Override
	public int hashCode() {
		return Objects.hash(marca, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(nome, other.nome);
	}

	//to string
	@Override
	public String toString() {
		return "Produto [nome = " + nome + ", preco = " + preco + ", marca = " + marca + ", descricao = " + descricao
				+ ", dataFabricacao = " + dataFabricacao + "]";
	}
	
	

}
