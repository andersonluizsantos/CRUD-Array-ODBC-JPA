package org.fuctura.academiajava.dao.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.fuctura.academiajava.dao.IProdutoDAO;
import org.fuctura.academiajava.model.Produto;



import org.fuctura.academiajava.dao.util.JpaUtil;

public class ProdutoDAOJPA implements IProdutoDAO{

	public void criar(Produto produto) {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.persist(produto);
		tx.commit();
		JpaUtil.close();		
	}

	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.merge(produto);
		tx.commit();
		JpaUtil.close();		
	}

	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void remover(Produto produto) {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		produto = em.find(Produto.class, produto.getId());
		em.remove(produto);
		tx.commit();
		JpaUtil.close();		
	}

	public Produto buscar(Long id) {
		EntityManager em = JpaUtil.getEntityManager();

		String jpql = "select p from Produto p where p.id = :id";
		Query query = em.createQuery(jpql);
		query.setParameter("id", id);
		return (Produto) query.getSingleResult();
	}

	public Collection<Produto> buscarTodos() {
		EntityManager em = JpaUtil.getEntityManager();
		String jpql = "select p from Produto p";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
