package Application;

import java.util.Scanner;

import Entities.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	ArrayList<RecProducao> recProducao = new ArrayList();
		
		Produto produto = new Produto();
		int i = 1;
		
	    int codigo;
	    String modelo;
	    double precoCusto;
	    double peso;
	    String cor;
	    String utilidade;
	    double frete;
	    double precoVenda;
	    String desComp = null;
		
		while (i == 1) {
			System.out.println("codigo ");
			codigo = sc.nextInt();
			
			System.out.println("modelo ");
			sc.nextLine();
			modelo = sc.nextLine();
			
			System.out.println("precoCusto ");
			precoCusto = sc.nextDouble();
			
			System.out.println("peso ");
			peso = sc.nextDouble();
			
			System.out.println("cor ");
			sc.nextLine();
			cor = sc.nextLine();
			
			System.out.println("utilidade ");
			utilidade = sc.nextLine();
			
			System.out.println("frete ");
			frete = sc.nextDouble();
			
			System.out.println("precoVenda ");
			precoVenda = sc.nextDouble();
			
			System.out.println("desComp");
			sc.nextLine();
			desComp = sc.nextLine();
			produto.addProduct(produto, modelo, codigo, precoCusto, peso, cor, utilidade, frete, precoVenda, desComp);
			
			System.out.println("Deseja adicionar um novo produto: sim[1] ou nao[0]");
			i = sc.nextInt();
		}
		
		System.out.println("Deseja visualizar todos os produtos: sim[1] ou nao[0]");
		i = sc.nextInt();
		if (i == 1) produto.printProdutos();

		System.out.println("Deseja remover algum elemento: sim[1] ou nao[0]");
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("Informa a descrição do produto: ");
			sc.nextLine();
			desComp = sc.nextLine();
			produto.remove(desComp);
			
			System.out.println("Deseja visualizar os produtos atualizados: sim[1] ou nao[0]");
			i = sc.nextInt();
			if (i == 1) produto.printProdutos();
		}
		
		System.out.println("Deseja visualizar um produto específico por descrição: sim[1] nao[0]");
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("Informe a descrição do produto:");
			sc.nextLine();
			desComp = sc.nextLine();
			produto.printProdutoPorDescricao(desComp);
		}
		
		System.out.println("Deseja visualizar a quantidade de produtos no estoque: sim[1] ou nao[0]");
		i = sc.nextInt();
		if (i == 1) {
			System.out.printf("Quantidade de produtos no estoque: %d", produto.numeroEstoque());
			System.out.println();
		}
		
		System.out.println("Deseja visualizar um produto específico por código: sim[1] ou nao[0]");
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("Informe o código do produto: ");
			codigo = sc.nextInt();
			produto.printProdutoPorCodigo(codigo);
		}
		
		System.out.println("Deseja visualizar a quantidade de produtos maiores do que 30KG: sim[1] ou nao[0]");
		i = sc.nextInt();
		if (i == 1) {
			System.out.printf("Produtos com o peso maior que 30KG: %d", produto.percorreMaisTrinta());
			System.out.println();
		}
		
		
		System.out.println("Deseja visualizar a quantidade de produtos menores do que 30KG: sim[1] ou nao[0]");
		i = sc.nextInt();
		if (i == 1) {
			System.out.printf("Produtos com o peso menor que 30KG: %d", produto.percorreMenosTrinta());
			System.out.println();
		}
		
		System.out.println("Deseja calcular a depreciação de um produto: sim[1] ou nao[0]");
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("Digite o código do produto: ");
			codigo = sc.nextInt();
			
			System.out.println(produto.Depreciacao(codigo));
		}
		
		System.out.println("Deseja calcular o lucro a partir do ICMS: sim[1] ou nao[0]");
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("Digite o código do produto: ");
			codigo = sc.nextInt();
			
			System.out.println(produto.Lucro(codigo));
		}
		
		
		sc.close();
	}

}
