package classes.conta;
import classes.conta.excecao.*;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // atributo compartilhado da classe
	
	public Conta() {
		Conta.total++;
	}
	
	// quando abstrato pode ser usado nas classes filhas
	public Conta(int agencia, int numero) throws NaoPodeComValorNegativoException {
		if (agencia <= 0 || numero <= 0) {
			throw new NaoPodeComValorNegativoException("As entradas não podem ser negativas");
		}
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia não pode ser negativa");
			return;
		}
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) throws NaoPodeComValorNegativoException {
		if (numero <= 0) {
			throw new NaoPodeComValorNegativoException("Numero não pode ser negativo");
		}
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public abstract void depositar(double valor);
	
	public void sacar(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente: salado - " + this.saldo + ", valor passado - " + valor);
		}
		this.saldo -= valor;
	}
	public void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	// atributos de instancia não podem ser acessados por métodos estáticos.
	public static int getTotal() { // metodo compartilhado da classe
		// this.saldo e saldo // dentro de um contexto estático não de pode usar variáveis de instância.
		return Conta.total;
	}

}
