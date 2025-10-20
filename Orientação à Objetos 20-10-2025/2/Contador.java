public class Contador {

    // Construtor default
    public Contador() {
        totalObjetos ++;
    }

    // Método para imprimir o valor do contador
    public void mostrarTotal() {
        System.out.println("Contador: " + totalObjetos);
    }

    // Dados membro
    private static Integer totalObjetos = 0;
}