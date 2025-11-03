public class Pessoa {

    // Construtor default
    public Pessoa() {
        this.nome = "NULL";
        this.idade = null;
    }

    // Construtor parametrizado
    public Pessoa(String umNome, Integer umaIdade) {
        this.nome = umNome;

        if (umaIdade < 0) {
            this.idade = null;
        }

        else {
            this.idade = umaIdade;
        }
    }

    // Getters
    public String getNome() {return this.nome;}
    public Integer getIdade() {return this.idade;}

    // Setters
    public void setNome(String umNome) {
        nome = umNome;
    }

    public void setIdade(Integer umaIdade) {
        if (umaIdade < 0) {
            this.idade = null;
        }
        else {
            this.idade = umaIdade;
        }
    }

    // Dados membro
    private String nome;
    private Integer idade;
}