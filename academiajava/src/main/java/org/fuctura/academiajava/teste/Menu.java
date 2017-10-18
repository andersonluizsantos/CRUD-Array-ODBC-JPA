package org.fuctura.academiajava.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import javax.swing.JOptionPane;

import org.fuctura.academiajava.dao.impl.ProdutoDAOArray;
import org.fuctura.academiajava.dao.impl.ProdutoDAOJDBC;
import org.fuctura.academiajava.dao.impl.ProdutoDAOJPA;
import org.fuctura.academiajava.model.Produto;

public class Menu {
	
	public static void main(String[] args) {
		String menu, auxMenuExterno, auxMenuInterno, menu2;
		int opcaoMenuExterno=99, opcaoMenuInterno=99;		
		
		ProdutoDAOArray produtoDAOArray = new ProdutoDAOArray();
		
		menu = "SELECIONE A UMA DAS OPÇÕES\n";
	    menu = menu + "1 – Array\n";
	    menu = menu + "2 – JDBC\n";
	    menu = menu + "3 – JPA\n";
	    menu = menu + "0 – SAIR\n";
	    while (opcaoMenuExterno!=0) {
	    	opcaoMenuExterno=99;
	    	opcaoMenuInterno=99;
	    	auxMenuExterno = JOptionPane.showInputDialog(menu);
	    	opcaoMenuExterno = Integer.parseInt(auxMenuExterno);
	        switch (opcaoMenuExterno) {
	        	case 1:
	        		menu2 = "SELECIONE A UMA DAS OPÇÕES\n";
	        	    menu2 = menu2 + "1 – Cadastar Produto Array\n";
	        	    menu2 = menu2 + "2 – Alterar Produto Array\n";
	        	    menu2 = menu2 + "3 – Excuir Produto Array\n";
	        	    menu2 = menu2 + "4 – Buscar Todos Array\n";
	        	    menu2 = menu2 + "5 – Buscar Por ID Array\n";
	        	    menu2 = menu2 + "0 – SAIR\n";
	        	    while (opcaoMenuInterno!=0) {
	        	    	auxMenuInterno = JOptionPane.showInputDialog(menu2);
	        	    	opcaoMenuInterno = Integer.parseInt(auxMenuInterno);
	        	    	
	        	    	switch (opcaoMenuInterno) {
		    	        	case 1:		    	        		
		    	        		cadastrarProdutoArray(produtoDAOArray);
		    	        		break;
		        	    	case 2:
		        	    		alterarProdutoArray(produtoDAOArray);
		        	    		break;
		    	        	case 3:
		    	        		excluirProdutoArray(produtoDAOArray);
		    	        		break;
		    	        	case 4:
		    	        		buscarTodosArray(produtoDAOArray);
		    	        		break;
		    	        	case 5:
		    	        		buscarPorIdArray(produtoDAOArray);
		    	        		break;
		    	        	case 0:
		    	        		break;
		    	        	default:	        	
		    		        	JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA. Digite as opções 1, 2, 3, 4, 5 ou 0");
		    		        	break;	
	        	    	}
	        	    }
	        	case 2:
	        		menu2 = "SELECIONE A UMA DAS OPÇÕES\n";
	        	    menu2 = menu2 + "1 – Cadastar Produto JDBC\n";
	        	    menu2 = menu2 + "2 – Alterar Produto JDBC\n";
	        	    menu2 = menu2 + "3 – Excuir Produto JDBC\n";
	        	    menu2 = menu2 + "4 – Buscar Todos JDBC\n";
	        	    menu2 = menu2 + "5 – Buscar Por ID JDBC\n";
	        	    menu2 = menu2 + "0 – SAIR\n";
	        	    while (opcaoMenuInterno!=0) {
	        	    	auxMenuInterno = JOptionPane.showInputDialog(menu2);
	        	    	opcaoMenuInterno = Integer.parseInt(auxMenuInterno);
	        	    	switch (opcaoMenuInterno) {
		    	        	case 1:		    	        		
		    	        		cadastrarProdutoJDBC();
		    	        		break;
		        	    	case 2:
		        	    		alterarProdutoJDBC();
		        	    		break;
		    	        	case 3:
		    	        		excluirProdutoJDBC();
		    	        		break;
		    	        	case 4:
		    	        		buscarTodosJDBC();
		    	        		break;
		    	        	case 5:
		    	        		buscarPorIdJDBC();
		    	        		break;
		    	        	case 0:
		    	        		break;
		    	        	default:	        	
		    		        	JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA. Digite as opções 1, 2, 3, 4, 5 ou 0");
		    		        	break;	
	        	    	}
	        	    }
	        	case 3:
	        		menu2 = "SELECIONE A UMA DAS OPÇÕES\n";
	        	    menu2 = menu2 + "1 – Cadastar Produto JPA\n";
	        	    menu2 = menu2 + "2 – Alterar Produto JPA\n";
	        	    menu2 = menu2 + "3 – Excuir Produto JPA\n";
	        	    menu2 = menu2 + "4 – Buscar Todos JPA\n";
	        	    menu2 = menu2 + "5 – Buscar Por ID JPA\n";
	        	    menu2 = menu2 + "0 – SAIR\n";
	        	    while (opcaoMenuInterno!=0) {
	        	    	auxMenuInterno = JOptionPane.showInputDialog(menu2);
	        	    	opcaoMenuInterno = Integer.parseInt(auxMenuInterno);
	        	    	switch (opcaoMenuInterno) {
		    	        	case 1:		    	        		
		    	        		cadastrarProdutoJPA();
		    	        		break;
		        	    	case 2:
		        	    		alterarProdutoJPA();
		        	    		break;
		    	        	case 3:
		    	        		excluirProdutoJPA();
		    	        		break;
		    	        	case 4:
		    	        		buscarTodosJPA();
		    	        		break;
		    	        	case 5:
		    	        		buscarPorIdJPA();
		    	        		break;
		    	        	case 0:
		    	        		break;
		    	        	default:	        	
		    		        	JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA. Digite as opções 1, 2, 3, 4, 5 ou 0");
		    		        	break;	
	        	    	}
	        	    	
	        	    }
	        	case 0:
	        		break;
	        	default:	        	
		        	JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA. Digite as opções 1, 2, 3 OU 0");
		        	break;	
	        }  
			
		}
	
	}

	private static void buscarPorIdJPA() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		
		ProdutoDAOJPA produtoDAOJPA = new ProdutoDAOJPA();
		Collection<Produto> produtoLista = new ArrayList();		
		
		produtoLista = produtoDAOJPA.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}		
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja buscar: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		
		produto = produtoDAOJPA.buscar(id);
		
		listaProdutos = produto.toString();
		JOptionPane.showMessageDialog(null, listaProdutos);		
	}

	private static void buscarTodosJPA() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		
		ProdutoDAOJPA produtoDAOJPA = new ProdutoDAOJPA();
		Collection<Produto> produtoLista = new ArrayList();		
		
		produtoLista = produtoDAOJPA.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}		
		JOptionPane.showMessageDialog(null, listaProdutos);	
	}

	private static void excluirProdutoJPA() {
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		
		ProdutoDAOJPA produtoDAOJPA = new ProdutoDAOJPA();
		Collection<Produto> produtoLista = new ArrayList();		
		
		produtoLista = produtoDAOJPA.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}		
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja excluir: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		produtoDAOJPA.remover(produto);
	}

	private static void alterarProdutoJPA() {
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		
		ProdutoDAOJPA produtoDAOJPA = new ProdutoDAOJPA();
		Collection<Produto> produtoLista = new ArrayList();		
		
		produtoLista = produtoDAOJPA.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}		
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja alterar: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		
		leitura = JOptionPane.showInputDialog("Digite o novo nome do produto?");
		nome = leitura;
		produto.setNome(nome);
		
		leitura = JOptionPane.showInputDialog("Digite o novo preço do produto?");
		preco = Double.parseDouble(leitura);
		produto.setPreco(preco);
		
		produtoDAOJPA.atualizar(produto);
	}

	private static void cadastrarProdutoJPA() {
		// TODO Auto-generated method stub
		String leitura, nome;
		Long id;
		Double preco;
		
		Produto produto = new Produto();
		
		leitura = JOptionPane.showInputDialog("Digite seu nome do produto?");
		nome = leitura;
		produto.setNome(nome);
		
		leitura = JOptionPane.showInputDialog("Digite o preço do produto?");
		preco = Double.parseDouble(leitura);
		produto.setPreco(preco);
		
		produto.setDataAtualizacao(Calendar.getInstance().getTime());
		produto.setDataCriacao(Calendar.getInstance().getTime());
		
		ProdutoDAOJPA produtoDAOJPA = new ProdutoDAOJPA();
		produtoDAOJPA.criar(produto);			
	}

	private static void buscarPorIdJDBC() {
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		
		ProdutoDAOJDBC produtoDAOJDBC = new ProdutoDAOJDBC();
		Collection<Produto> produtoLista = new ArrayList();		
		
		produtoLista = produtoDAOJDBC.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}		
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja buscar: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		
		produto = produtoDAOJDBC.buscar(id);
		
		listaProdutos = produto.toString();
		JOptionPane.showMessageDialog(null, listaProdutos);		
		
	}

	private static void buscarTodosJDBC() {
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		
		ProdutoDAOJDBC produtoDAOJDBC = new ProdutoDAOJDBC();
		Collection<Produto> produtoLista = new ArrayList();		
		
		produtoLista = produtoDAOJDBC.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}		
		JOptionPane.showMessageDialog(null, listaProdutos);
	}

	private static void excluirProdutoJDBC() {
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		
		ProdutoDAOJDBC produtoDAOJDBC = new ProdutoDAOJDBC();
		Collection<Produto> produtoLista = new ArrayList();		
		
		produtoLista = produtoDAOJDBC.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}		
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja excluir: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		produtoDAOJDBC.remover(produto);
		
	}

	private static void alterarProdutoJDBC() {
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		
		ProdutoDAOJDBC produtoDAOJDBC = new ProdutoDAOJDBC();
		Collection<Produto> produtoLista = new ArrayList();		
		
		produtoLista = produtoDAOJDBC.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}		
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja alterar: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		
		leitura = JOptionPane.showInputDialog("Digite o novo nome do produto?");
		nome = leitura;
		produto.setNome(nome);
		
		leitura = JOptionPane.showInputDialog("Digite o novo preço do produto?");
		preco = Double.parseDouble(leitura);
		produto.setPreco(preco);
		
		produtoDAOJDBC.atualizar(produto);
	}

	private static void cadastrarProdutoJDBC() {
		String leitura, nome;
		Long id;
		Double preco;
		
		Produto produto = new Produto();
		leitura = JOptionPane.showInputDialog("Digite seu ID do produto?");
		id = Long.parseLong(leitura);
		produto.setId(id);
		
		leitura = JOptionPane.showInputDialog("Digite seu nome do produto?");
		nome = leitura;
		produto.setNome(nome);
		
		leitura = JOptionPane.showInputDialog("Digite o preço do produto?");
		preco = Double.parseDouble(leitura);
		produto.setPreco(preco);
		
		produto.setDataAtualizacao(Calendar.getInstance().getTime());
		produto.setDataCriacao(Calendar.getInstance().getTime());
		
		ProdutoDAOJDBC produtoDAOJDBC = new ProdutoDAOJDBC();
		produtoDAOJDBC.criar(produto);	
		
	}

	private static void buscarPorIdArray(ProdutoDAOArray produtoDAOArray) {
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		Collection<Produto> produtoLista = new ArrayList();		
		produtoLista = produtoDAOArray.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja buscar: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		
		produto = produtoDAOArray.buscar(id);
		
		listaProdutos = produto.toString();
		JOptionPane.showMessageDialog(null, listaProdutos);
		
	}

	private static void buscarTodosArray(ProdutoDAOArray produtoDAOArray) {
		String listaProdutos = "";
		Collection<Produto> produto = new ArrayList();		
		produto = produtoDAOArray.buscarTodos();
		for (Produto prod : produto){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, listaProdutos);
	}

	private static void excluirProdutoArray(ProdutoDAOArray produtoDAOArray) {
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		Collection<Produto> produtoLista = new ArrayList();		
		produtoLista = produtoDAOArray.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja alterar: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		produtoDAOArray.remover(produto);
	}
	
	private static void alterarProdutoArray(ProdutoDAOArray produtoDAOArray) {
		// TODO Auto-generated method stub
		String listaProdutos = "", mensagem="", leitura, nome;
		Long id;
		Double preco;
		Collection<Produto> produtoLista = new ArrayList();		
		produtoLista = produtoDAOArray.buscarTodos();
		for (Produto prod : produtoLista){
			listaProdutos = listaProdutos + prod.toString() + "\n";
		}
		listaProdutos = listaProdutos + "Digite o ID do produto que deseja alterar: ";
		leitura = JOptionPane.showInputDialog(listaProdutos);
		
		Produto produto = new Produto();
		id = Long.parseLong(leitura);
		produto.setId(id);
		
		leitura = JOptionPane.showInputDialog("Digite o novo nome do produto?");
		nome = leitura;
		produto.setNome(nome);
		
		leitura = JOptionPane.showInputDialog("Digite o novo preço do produto?");
		preco = Double.parseDouble(leitura);
		produto.setPreco(preco);
		
		produtoDAOArray.atualizar(produto);
		
	}

	private static void cadastrarProdutoArray(ProdutoDAOArray produtoDAOArray) {
		String leitura, nome;
		Long id;
		Double preco;
		
		Produto produto = new Produto();
		leitura = JOptionPane.showInputDialog("Digite seu ID do produto?");
		id = Long.parseLong(leitura);
		produto.setId(id);
		
		leitura = JOptionPane.showInputDialog("Digite seu nome do produto?");
		nome = leitura;
		produto.setNome(nome);
		
		leitura = JOptionPane.showInputDialog("Digite o preço do produto?");
		preco = Double.parseDouble(leitura);
		produto.setPreco(preco);
		
		produto.setDataAtualizacao(Calendar.getInstance().getTime());
		produto.setDataCriacao(Calendar.getInstance().getTime());
		
		//ProdutoDAOArray produtoDAOArray = new ProdutoDAOArray();
		produtoDAOArray.criar(produto);		
	}
}
