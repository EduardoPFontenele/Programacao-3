public class Main {
    public static void main(String[] args) {
        
        Livro l1 = new Livro();
        Livro l2 = new Livro("A metamorfose", "Franz Kafka");

        System.out.println("Autor do livro:" + l1.getAutor());
        System.out.println("Título do livro:" + l1.getTitulo() + "\n");

        System.out.println("Autor do livro:" + l2.getAutor());
        System.out.println("Título do livro:" + l2.getTitulo());

    }
}