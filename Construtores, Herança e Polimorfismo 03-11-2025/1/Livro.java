public class Livro {

    // Construtor default
    public Livro() {
        this.titulo = "NULL";
        this.autor = "NULL";
    }

    // Construtor parametrizado
    public Livro(String umTitulo, String umAutor) {
        this.titulo = umTitulo;
        this.autor = umAutor;
    }

    // Getters
    public String getTitulo() {return this.titulo;}
    public String getAutor() {return this.autor;}

    // Setters
    public void setTitulo(String umTitulo) {
        this.titulo = umTitulo;
    }

    public void setAutor(String umAutor) {
        this.autor = umAutor;
    }


    // Dados membro
    private String titulo;
    private String autor;
}