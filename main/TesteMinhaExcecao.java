package main;

import classes.excecoes.PrimeiraExcecao;

public class TesteMinhaExcecao {
	public static void main (String[] args) {
		System.out.println("Testando minha exceção!!");
		// unchecked - não precisa ser envolvido por try/catch.
		try {
			throw new PrimeiraExcecao("Testando exceção!!");
		} catch (PrimeiraExcecao ex) {
			System.out.println(ex.getClass()); 
			System.out.println(ex.toString());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
