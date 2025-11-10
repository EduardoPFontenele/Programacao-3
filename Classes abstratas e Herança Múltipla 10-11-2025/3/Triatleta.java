public class Triatleta implements Ciclista, Corredor, Nadador {

    public Triatleta() {
        this.nome = "NULL";
    }

    public Triatleta(String Nome) {
        this.nome = Nome;
    }

    @Override
    public void pedalar() {
        System.out.println("🚴");
    }

    @Override
    public void nadar() {
        System.out.println("🏊");
    }

    @Override
    public void correr() {
        System.out.println("🏃‍♂️");
    }

    private String nome;
}