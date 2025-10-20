public class Carro {

    // Construtor default
    public Carro() {
        this.marca = "NULL";
        this.modelo = "NULL";
        this.ano = null;
    }

    // Construtor parametrizado
    public Carro(String umaMarca, String umModelo, Integer umAno) {
        this.marca = umaMarca;
        this.modelo = umModelo;

        if (umAno < 2000) {
            this.ano = null;
        }
        else {
            this.ano = umAno;
        }
    }

    //Construtor de cópia
    public Carro(Carro umCarro) {
        this.marca = umCarro.marca;
        this.modelo = umCarro.modelo;
        this.ano = umCarro.ano;
    }

    public void exibirInfo() {
        System.out.println("Marca:" + this.marca + "\n" + "Modelo: " + this.modelo + "\n" + "Ano: " + this.ano);
    }

    // Dados membro
    private String marca;
    private String modelo;
    private Integer ano;
}