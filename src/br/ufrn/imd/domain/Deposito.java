package br.ufrn.imd.domain;

import java.util.ArrayList;
import java.util.List;

public class Deposito {
	
	private List<ProdutoDuravel> produtos_duraveis;
	private List<ProdutoNaoDuravel> produtos_nao_duraveis;

	public Deposito() {
		produtos_duraveis = new ArrayList<ProdutoDuravel>();
		produtos_nao_duraveis = new ArrayList<ProdutoNaoDuravel>();
	}
	
	
	public void AddprodutoD(ProdutoDuravel produto) {
		produtos_duraveis.add(produto);
	}
	
	public void AddprodutoND(ProdutoNaoDuravel produto) {
		produtos_nao_duraveis.add(produto);
	}
	
	public void RemprodutoD(ProdutoDuravel produto) {
		for(ProdutoDuravel d : produtos_duraveis) {
			if(d.equals(produto) == true) {
				produtos_duraveis.remove(d);
			}
		}
	}
	
	public void RemprodutoND(ProdutoNaoDuravel produto) {
		for(ProdutoNaoDuravel d : produtos_nao_duraveis) {
			if(d.equals(produto) == true) {
				produtos_nao_duraveis.remove(d);
			}
		}
	}
	
	public int Qtdprodutos() {
		return produtos_duraveis.size() + produtos_nao_duraveis.size();
	}
	
	public boolean vazio() {
		if(produtos_duraveis.isEmpty() == true && produtos_nao_duraveis.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void Maiscaro() {
		ProdutoDuravel produtocaro1 = new ProdutoDuravel();
		ProdutoNaoDuravel produtocaro2 = new ProdutoNaoDuravel();
		
		for(ProdutoDuravel d : produtos_duraveis) {
			if(d.getPreco() > produtocaro1.getPreco()) {
				produtocaro1 = d;
			}
		}
		for(ProdutoNaoDuravel d : produtos_nao_duraveis) {
			if(d.getPreco() > produtocaro2.getPreco()) {
				produtocaro2 = d;
			}
		}
		
		if(produtocaro1.getPreco() > produtocaro2.getPreco()) {
			System.out.println(produtocaro1);
		} else {
			System.out.println(produtocaro2);
		}
		
	}
}
