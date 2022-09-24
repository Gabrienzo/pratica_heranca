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
						//criação do produto duravel
						ProdutoDuravel produtoD = new ProdutoDuravel();
						System.out.println("Digite o nome do produto:");
						produtoD.setNome(sc.nextLine());
						System.out.println("Digite a marca do produto:");
						produtoD.setMarca(sc.nextLine());
						System.out.println("Digite a descrição do produto:");
						produtoD.setDescricao(sc.nextLine());
						System.out.println("Digite o preço do produto:");
						produtoD.setPreco(sc.nextDouble());
						System.out.println("Digite a data de fabricação do produto (dd mm aaaa):");
						produtoD.setDataFabricacao(sc.nextInt(), sc.nextInt(), sc.nextInt());
						System.out.println("Digite a durabilidade do produto (em anos): ");
						produtoD.setDurabilidade(sc.nextInt());
						System.out.println("Produto inserido: ");
						System.out.println(produtoD+"\n");

						deposito.Addproduto(produtoD);
	
					} else if (opcao == 2) {
						//criação do produto não duravel
						ProdutoNaoDuravel produtoND = new ProdutoNaoDuravel();
						System.out.println("Digite o nome do produto:");
						produtoND.setNome(sc.nextLine());
						System.out.println("Digite a marca do produto:");
						produtoND.setMarca(sc.nextLine());
						System.out.println("Digite a descrição do produto:");
						produtoND.setDescricao(sc.nextLine());
						System.out.println("Digite o preço do produto:");
						produtoND.setPreco(sc.nextDouble());
						System.out.println("Digite a data de fabricação do produto (dd mm aaaa):");
						produtoND.setDataFabricacao(sc.nextInt(), sc.nextInt(), sc.nextInt());
						System.out.println("Digite a data de validade do produto (dd mm aaaa):");
						produtoND.setDataValidade(sc.nextInt(), sc.nextInt(), sc.nextInt());
						sc.nextLine();
						System.out.println("Digite o genero do produto: ");
						produtoND.setGenero(sc.nextLine());
						System.out.println("Produto inserido: ");
						System.out.println(produtoND+"\n");

						deposito.Addproduto(produtoND);
						
					} else {
						System.out.println("Opção invalida, retornando ao menu anterior...\n");
					}
					break;

				case 2:
					//remoção de um produto
					Produto produtorem = new Produto();
					System.out.println("Digite o nome do produto que deseja remover: ");
					produtorem.setNome(sc.nextLine());
					System.out.println("E sua marca: ");
					produtorem.setMarca(sc.nextLine());

					deposito.Remproduto(produtorem);
					System.out.println("Produto Removido!\n");
					break;

				case 3:
					//quantidade de produtos
					System.out.println(deposito.Qtdprodutos() + " Produto(s)\n");
					break;

				case 4:
					//se o deposito está vazio ou não
					if(deposito.vazio() == true){
						System.out.println("Deposito vazio!\n");
					} else {
						System.out.println("Deposito não está vazio, verifique a quantidade de produtos digitando \"3\" no menu anterior! \n");
					}
					break;

				case 5:
					//mostrar o produto mais caro
					System.out.println("Este é o produto mais caro: ");
					System.out.println(deposito.Maiscaro());
					break;

				case 6:
					//encerrar o loop
					System.out.println("Fechando programa...");
					sistema = false;
					break;

				default:
					System.out.println("**************\nOpção Invalida!\n**************");
					break;

				}

			}
			
		} finally {
			sc.close();
		}
		
	}

}
