package dio;

public class ContaPoupanca extends Conta {
  public void imprimirExtrato() {
    System.out.println("Extrato da conta poupança: " + super.getSaldo());
  }
}
