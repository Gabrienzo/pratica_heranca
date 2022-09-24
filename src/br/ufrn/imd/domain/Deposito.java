package br.ufrn.imd.domain;

import java.util.ArrayList;
import java.util.List;

public class Deposito {
	
	private List<Produto> produtos;

	//construtor
	public Deposito() {
		produtos = new ArrayList<Produto>();
	}

	//metodos
	public void Addproduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void Remproduto(Produto produto) {
		int pos = 0;
		for(Produto d : produtos) {
			if(d.equals(produto) == true) {
				produtos.remove(pos);
				break;
			}
			pos++;
		}
	}
	
	public int Qtdprodutos() {
		return produtos.size();
		//return produtos_duraveis.size() + produtos_nao_duraveis.size();
	}
	
	public boolean vazio() {
		if(produtos.isEmpty() == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public Produto Maiscaro() {
		Produto produtocaro = new Produto();
		
		for(Produto d : produtos) {
			if(d.getPreco() > produtocaro.getPreco()) {
				produtocaro = d;
			}
		}
		
		return produtocaro;
		
	}
}
