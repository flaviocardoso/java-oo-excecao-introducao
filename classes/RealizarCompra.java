package classes;

import classes.excecoes.EstoqueInsuficienteException;

public class RealizarCompra {
	private int totalDeProdutosNoEstoque = -1;
	
	// checked exception
	public RealizarCompra(Produto produto) throws EstoqueInsuficienteException{
		if (this.totalDeProdutosNoEstoque < 0) {
			throw new EstoqueInsuficienteException("Estoque insuficiente");
		}
	}
}
