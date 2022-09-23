package br.ufrn.imd.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ufrn.imd.domain.Produto;
import br.ufrn.imd.domain.ProdutoDuravel;
import br.ufrn.imd.domain.ProdutoNaoDuravel;
import br.ufrn.imd.domain.Deposito;


public class LojaView {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Deposito deposito = new Deposito();
			
			boolean sistema = true;
			
			while (sistema == true) {
				System.out.println("Sistema de Deposito \nSelecione o opção desejada:"
						+ "\n1 - Adicionar Produto"
						+ "\n2 - Remover Produto"
						+ "\n3 - Informar quantidade de produtos no depósito"
						+ "\n4 - Informar se o depósito está vazio"
						+ "\n5 - Informar o produto com maior preço"
						+ "\n6 - Fechar programa");
				
				int entrada = sc.nextInt();
				sc.nextLine();
				
				switch(entrada) {
				case 1:
					System.out.println("Deseja adicionar um produto duravel ou não duravel?"
							+ "\n1 - Duravel"
							+ "\n2 - Não duravel");
					
					int opcao = sc.nextInt();
					sc.nextLine();
					
					if(opcao == 1) {
						
					} else if (opcao == 2) {
						
					} else {
						System.out.println("Opção invalida, retornando ao menu anterior...");
					}
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6	:
					break;
				}
			}
			
			
		} finally {
			sc.close();
		}
		
	}

}
