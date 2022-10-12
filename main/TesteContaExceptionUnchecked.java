package main;

import classes.conta.*;
import classes.conta.excecao.*;

public class TesteContaExceptionUnchecked {
	public static void main (String[] args) {
		ContaCorrente cc = null;
		// checked
		try {
			// agencia negativa - Ok
			cc = new ContaCorrente(123, 223);
		} catch (NaoPodeComValorNegativoException e) {
			e.getMessage();
		}
		
		// unchecked - Não precisa dp try/catch
		try {
			cc.depositar(200);
			cc.sacar(200);
			System.out.println(cc.getAgencia());
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
			
	}
}
