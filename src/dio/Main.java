package dio;

public class Main {
  public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    Conta cp = new ContaPoupanca();

    cc.depositar(100);

    cc.imprimirExtrato();
    cp.imprimirExtrato();

    cc.transferir(50, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
  }
}
