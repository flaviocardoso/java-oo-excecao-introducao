package classes.excecoes;

// unchecked
public class PrimeiraExcecao extends RuntimeException { // primeira exceção usando RuntimeException. Existe outros tipo de exceções no Java que pode ser utilizadas.
	private static final long serialVersionUID = 1350039094222407531L;
	
	public PrimeiraExcecao(String msg) {
		super(msg);
	}
}
