public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo, int umId) {
        super(saldo,umId);
    }

    @Override
    public boolean sacar(double valor) {
        
        if (valor < 0.0 || valor > saldo) {
            return false;
        }

        else {
            saldo -= valor + taxa_saque;
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

    // Dado membro
    public static final double taxa_saque = 1.00;
    
}