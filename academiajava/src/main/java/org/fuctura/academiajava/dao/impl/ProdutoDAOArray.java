package org.fuctura.academiajava.dao.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.fuctura.academiajava.dao.IProdutoDAO;
import org.fuctura.academiajava.model.Produto;

public class ProdutoDAOArray implements IProdutoDAO{
	
	private Collection<Produto> produtos = new ArrayList<Produto>();
	
	public void criar(Produto produto) {
		produtos.add(produto);		
	}

	public void atualizar(Produto produto) {
		
		
		if (produtos.contains(produto)){
			produtos.remove(produto);
			produtos.add(produto);
		}
		
		
		
		/*
		// Utilização do For Antigo para percorrer um ArrayList
		for (int i = 0; i < produtos.size(); ++i) {
			Produto obj = (Produto) produtos;
		    if (obj.equals(produto)){
		    	obj = produto;
		    }
		}
		*/		
		
		
		/*
		for(Produto _produto: produtos){
			if (_produto.equals(produto)){
				_produto = produto;
			}		
		}
		*/
		
	}

	public void remover(Long id) {
		Produto produto = this.buscar(id);
		if (produto !=null){
			
		}
		
	}

	public void remover(Produto produto) {
		produtos.remove(produto);		
	}

	public Produto buscar(Long id) {
		for(Produto produto:produtos){
			if (produto.getId().equals(id)){
				return produto;
			}
		}
		return null;
	}

	public Collection<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return produtos;
	}

	
	
}
