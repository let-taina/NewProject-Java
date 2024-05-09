package produtos;

import java.util.Scanner;
import produtos.model.produtos;
import produtos.model.ProdutoBolsas;
import produtos.model.ProdutoAmigurumis;

public class Menu {

	public static void main(String[] args) {
		// Classe principal, com método main, contendo o menu do programa com todas as suas funcioalidades
		
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		while (true) {
							
		System.out.println("------------------------------------------------------------------------");
		System.out.println("                                                                        ");
		System.out.println("                                  LETÍCIA                               ");
		System.out.println("                               ARTES EM CROCHÊ                          ");
		System.out.println("                                                                        ");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("                                                                        ");
		System.out.println("                  Por gentileza, digite a opção desejada:               ");
		System.out.println("                                                                        ");
		System.out.println("                   1 - Cadastrar novo produto                           ");
		System.out.println("                   2 - Listar produtos cadastrados                      ");
		System.out.println("                   3 - Buscar produto por código                        ");
		System.out.println("                   4 - Atualizar cadastro de produto                    ");
		System.out.println("                   5 - Deletar produto                                  ");
		System.out.println("                   6 - Registrar venda (saída do estoque)               ");
		System.out.println("                   7 - Adicionar produto (entrada no estoque)           ");
		System.out.println("                   8 - Sair                                             ");
		System.out.println("                                                                        ");
		System.out.println("------------------------------------------------------------------------");
		
		opcao = leia.nextInt();
		
		if (opcao == 8 ) {
			System.out.println(" A 'Letícia - Artes em Crochê' agradece a sua visita. Volte sempre! ");
			sobre ();
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) { 
		
		case 1:
			System.out.println("Cadastrar novo produto \n\n");
			break;
			
		case 2:
			System.out.println("Listar produtos \n\n");
			break;
			
		case 3:
			System.out.println("Consultar produto por código\\n\\n");
			break;
		
		case 4:
			System.out.println("Atualizar cadastro do produto\\n\\n");
			break;
		
		case 5:
			System.out.println("Deletar produto cadastrado\\n\\n");
			break;
		
		case 6:
			System.out.println("Saída de estoque - venda\\n\\n");
			break;
			
		case 7:
			System.out.println("Entrada de estoque - compra\\n\\n");
			break;
		
			default:
				System.out.println("\nOpção inválida! Por gentileza, digite uma opção de 1 à 8.");
				break;	
		}
	}	
			
	
		
	} // chave do primeiro void
	
	public static void sobre() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Projeto desenvolvido por:");
		System.out.println("Letícia Silva - leticia.silva@genstudents.com");
		System.out.println("github.com/let-taina");
		System.out.println("------------------------------------------------------------------------");
	} // chave do segundo void

} // chave da classe menu
