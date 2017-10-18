package org.fuctura.academiajava.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import org.fuctura.academiajava.dao.IProdutoDAO;
import org.fuctura.academiajava.dao.util.JDBCUtil;
import org.fuctura.academiajava.model.Produto;



public class ProdutoDAOJDBC implements IProdutoDAO {

	public void criar(Produto produto) {

		try {

			Connection connection = JDBCUtil.getConnection();
			String sql = " INSERT INTO PRODUTO " + " (ID, NOME, PRECO, DATA_CRIACAO, DATA_ATUALIZACAO) " + " VALUES "
					+ "(?, ?, ?, ?, ?)";

			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, produto.getId());
			ps.setString(2, produto.getNome());
			ps.setDouble(3, produto.getPreco());
			ps.setDate(4, new Date(produto.getDataCriacao().getTime()));
			ps.setDate(5, new Date(produto.getDataAtualizacao().getTime()));

			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Produto buscar(Long id) {

		try {

			Connection connection = JDBCUtil.getConnection();
			String sql = " SELECT ID, NOME, PRECO, DATA_CRIACAO, DATA_ATUALIZACAO FROM PRODUTO WHERE ID = ?";

			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, id);

			ResultSet rs = ps.executeQuery();

			Produto produto = new Produto();

			while (rs.next()) {
				produto.setId(rs.getLong("ID"));
				produto.setNome(rs.getString("NOME"));
				produto.setPreco(rs.getDouble("PRECO"));
				produto.setDataCriacao(rs.getDate("DATA_CRIACAO"));
				produto.setDataAtualizacao(rs.getDate("DATA_ATUALIZACAO"));
			}

			return produto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql = " UPDATE PRODUTO SET NOME = ?, PRECO=? WHERE ID = ? ";
			PreparedStatement ps = connection.prepareStatement(sql);			
			ps.setString(1, produto.getNome());
			ps.setDouble(2, produto.getPreco());
			ps.setLong(3, produto.getId());			
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void remover(Long id) {

	}

	public void remover(Produto produto) {
		// TODO Auto-generated method stub
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql = " DELETE FROM PRODUTO WHERE ID = ? ";
			PreparedStatement ps = connection.prepareStatement(sql);			
			ps.setLong(1, produto.getId());			
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Collection<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		Long id;
		Double preco;
		Connection connection = JDBCUtil.getConnection();		
		Collection<Produto> produtos = new ArrayList<Produto>();
		
		String listagem = "";
		String sql = "SELECT ID, NOME, PRECO, DATA_CRIACAO, DATA_ATUALIZACAO FROM PRODUTO";
		
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			while (res.next()) {
				Produto produto = new Produto();
				id = Long.parseLong(res.getString("ID"));
				produto.setId(id);			
				
				produto.setNome(res.getString("NOME"));
				
				preco = Double.parseDouble(res.getString("PRECO"));
				produto.setPreco(preco);			
				produtos.add(produto);
				
			}
			return produtos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
		
	}

}
