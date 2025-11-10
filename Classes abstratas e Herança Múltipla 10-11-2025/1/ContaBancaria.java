public abstract class ContaBancaria {

    // Construtor default
    public ContaBancaria() {
        this.saldo = 0.0;
        this.ID = 0;
    }

    public ContaBancaria(double umSaldo, int umId ) {
        
        if (umSaldo < 0.0) {
            this.saldo = 0.0;
        }

        else {
            this.saldo = umSaldo;
        }

        this.ID = umId;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract boolean sacar(double valor);
    public abstract void depositar(double valor);

    // Dados membro
    protected double saldo;
    private int ID;
}