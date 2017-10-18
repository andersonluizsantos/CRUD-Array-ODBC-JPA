package org.fuctura.academiajava.dao;

import java.util.Collection;

import org.fuctura.academiajava.model.Produto;

public interface IProdutoDAO {
	public void criar(Produto produto);
	public void atualizar (Produto produto);
	public void remover(Long id);
	public void remover(Produto produto);
	public Produto buscar(Long id);
	public Collection<Produto> buscarTodos();
	
}
