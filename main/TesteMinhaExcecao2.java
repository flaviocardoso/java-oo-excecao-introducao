package main;

import classes.excecoes.EstoqueInsuficienteException;
import classes.RealizarCompra;
import classes.Produto;

public class TesteMinhaExcecao2 {
	public static void main (String[] args) {
//		System.out.println("Testando minha exceção!!");
		
		Produto p = new Produto();
		// exemplo checked. Precisa ser envolvida por throws e exceção ou try/catch.
		try {
			new RealizarCompra(p);
		} catch (EstoqueInsuficienteException ex) {
			System.out.println(ex.getClass()); 
			System.out.println(ex.toString());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
