package classes.excecoes;

public class EstoqueInsuficienteException extends Exception { // checked

	private static final long serialVersionUID = 1L;
	
	public EstoqueInsuficienteException(String msg) {
		super(msg);
	}
}
