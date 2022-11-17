package dio;

public class ContaCorrente extends Conta {
  public void imprimirExtrato() {
    System.out.println("Extrato da conta corrente: " + super.getSaldo());
  }
}
