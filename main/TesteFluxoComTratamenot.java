package main;

// fluxo pilha
public class TesteFluxoComTratamenot {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException ex) {
			String msg = ex.getMessage();
			System.out.println("ArithmeticException: " + msg);
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		
		// catch(ArithmeticException | NullPointerException ex) {
		//   ex.printStackTrace();
		// }
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Inico do metodo1");
//		throw new NullPointerException("Ocorreu um erro!!!!");
		metodo2();
		System.out.println("Fim do metodo1");	
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		
		throw new ArithmeticException("Ocorreu um erro!!!");
		
		//System.out.println("Fim do metodo2");
	}
}

//class Conta {
//	void deposita() {}
//}

// - main
// - main - metodo1
// - main - metodo1 - metodo2
// - main - metodo1 - x
// - main - x
// - x

/**
 * Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo executados.
 * Além do bloco de código a pilha guarda as variáveis e as referências desse bloco.
 * Assim a JVM organiza a execução e sabe exatamente qual método que está sendo executado que é sempre o método no topo da pilha.
 * A JVM também sabe quais outros precisam ser executados ainda, que são justamente os métodos abaixo.
 * 
 */

/**
 * Toda exceção em Java possui um nome que identifica.
 * Exceções não tratadas caem na pilha de execução procurando por alguém que saiba lidar com ela.
 * 
 */

/**
 * try / catch
 * Para tratarmos uma execeção, que pode ocorrer enquanto nosso programa esta sendo executado, 
 * precimos tratá-la antecipadamente com um bloco de código específico.
 * 
 * A lógica de tratamento de erro no bloco catch só é disparada quando uma exececução é lancada dentro de um bloco try.
 */
 
/**
 * Lancamento de exceções
 * 
 * Para lançar uma exceção, além de instanciá-la, é necessário lançá-la através do throw.
 * Além de ser lança por uma variável de referencia. A execeção pode ser lançada diretamente pelo throw.
 * Exception ex = new Exception()
 * throw ex
 * 
 * ou 
 * 
 * throw new Excepction()
 * 
 * Quando ocorre uma exceção. o código para de executar.
 * Podemos atribuir uma mensagem à exceção através do construtor.
 * */


