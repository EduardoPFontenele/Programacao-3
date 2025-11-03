public class ContaBancaria {

    // Construtor default
    public ContaBancaria() {
        this.numero = null;
    }

    // Construtor parametrizado
    public ContaBancaria(Integer umNumero) {
        this.numero = umNumero;
    }

    @Override
    public String toString() {
        return numero.toString();
    }
    
    @Override
    public boolean equals(Object o) {

        if (o == null) {return false;} // Verifica nulidade

        if (o.getClass() == this.getClass()) {return true;} // Verifica se os tipos dos objetos são os mesmo

        ContaBancaria outra = (ContaBancaria) o;
        if (outra.numero.intValue() == this.numero.intValue()) {return true;}

        return false;
    }

    // Dados membro
    private Integer numero;
}