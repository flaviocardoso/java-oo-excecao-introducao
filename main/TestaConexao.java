package main;

import classes.Conexao;


public class TestaConexao {
	public static void main (String[] args) {
//		try {
//		Conexao con = new Conexao();
//		con.leDados();
//		con.fecha();
//	} catch(IllegalStateException ex) {
//		System.out.println("Deu erro na conexão");
//	}
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		}
	}
}
