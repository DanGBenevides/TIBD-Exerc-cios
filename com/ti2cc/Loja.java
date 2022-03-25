package com.ti2cc;

public class Loja {
	private int id;
	private String produto;
	private double preco;
	private String categoria;
	private int numEstoque;
	
	public Loja() {
		this.id = -1;
		this.produto = "";
		this.preco = 0;
		this.categoria = "";
		this.numEstoque = -1;
	}
	
	public Loja(int id, String produto, double preco, String categoria, int numEstoque) {
		this.id = id;
		this.produto = produto;
		this.preco = preco;
		this.categoria = categoria;
		this.numEstoque = numEstoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setpreco(Double preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumEstoque() {
		return numEstoque;
	}

	public void setNumEstoque(int numEstoque) {
		this.numEstoque = numEstoque;
	}

	@Override
	public String toString() {
		return "Loja [id=" + id + ", produto=" + produto + ", preco=" + preco + ", categoria=" + categoria + ", numEstoque=" + numEstoque + "]";
	}	
}
