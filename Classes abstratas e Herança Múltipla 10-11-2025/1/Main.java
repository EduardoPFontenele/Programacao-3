public class Main {
    public static void main(String args[]) {

        ContaPoupanca c1 = new ContaPoupanca(500.0, 9);
        ContaCorrente c2 = new ContaCorrente(1000.0, 111);

        c1.sacar(100.0);
        System.out.println("Novo saldo de c1 (depois do saque): " + c1.getSaldo());

        c2.sacar(500.0);
        System.out.println("Novo saldo de c2 (depois do saque): " + c2.getSaldo());

        c1.depositar(100.0);
        System.out.println("Novo saldo de c1 (depois do depósito): " + c1.getSaldo());

        c2.depositar(500.0);
        System.out.println("Novo saldo de c2 (depois do depósito): " + c2.getSaldo());
    }
}