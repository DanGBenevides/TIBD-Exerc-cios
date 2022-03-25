package com.ti2cc;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		dao.conectar();

		Scanner sc = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			switch(opcao()) {
				case 1:
					Loja[] lojas = dao.getLojas();
					for (int i = 0; i < lojas.length; i++) {
						System.out.println(lojas[i].toString());
					}
					break;
				
				case 2:
					Loja inserir = getLojaDados();
					if (dao.inserirLoja(inserir) == true) {
						System.out.println("Loja inserida - " + inserir.toString());
					}
					else {
						System.out.println("ERRO!");
					}
					break;
				
				case 3:
					System.out.println("Id da loja a ser excluida: ");
					int id = sc.nextInt();

					if (dao.excluirloja(id) == true) {
						System.out.println("Excluida");
					}
					else {
						System.out.println("ERRO");
					}
					break;

				case 4:
					Loja atualizar = getLojaDados();
					if (dao.atualizarloja(atualizar) == true) {
						System.out.println("Atualizada");
					}
					else {
						System.out.println("ERRO");
					}
					break;	
			}
			sc.close();
			dao.close();
		}
	}

	public static int opcao() {
			int opcao;
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite uma das opcoes:\n 1-Listar, 2-Inserir, 3-Excluir, 4-Atualizar, 0-Sair");
			opcao = sc.nextInt();

			sc.close();
			return opcao;
	}

	public static Loja getLojaDados() {
		Scanner sc = new Scanner(System.in);

		int id, numEstoque;
		String produto, categoria;
		Double preco;

		System.out.print("Id: ");
		id = sc.nextInt();

		System.out.print("Produto: ");
		produto = sc.nextLine();

		System.out.print("Preco: ");
		preco = sc.nextDouble();

		System.out.print("Categoria: ");
		categoria = sc.nextLine();

		System.out.print("Numero no Estoque: ");
		numEstoque = sc.nextInt();

		sc.close();

		Loja loja = new Loja(id, produto, preco, categoria, numEstoque);
		return loja;
	}
}