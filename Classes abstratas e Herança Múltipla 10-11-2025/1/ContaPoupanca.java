public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo, int umId) {
        super(saldo,umId);
    }

    @Override
    public boolean sacar(double valor) {
        
        if (valor < 0.0 || valor > saldo) {
            return false;
        }

        else {
            saldo -= valor;
            return  true;
        }

    }

    @Override
    public void depositar(double valor) {

        if (valor < 0.0) {
            return;
        }

        else {
            saldo += valor;
        }
    }
    
}