package dio;

public abstract class Conta implements IConta {
  private int agencia;
  private int numero;
  private double saldo;

  private static final int AGENCIA_PADRAO = 0001;

  private static int SEQUENCIAL = 1;

  protected Conta() {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }
}
