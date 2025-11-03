public class Aluno extends Pessoa {
    
    // Construtor default
    public Aluno() {
        super("NULL", null);
        this.matricula = null;
    }

    public Aluno(String nome, Integer idade, Integer umaMatricula) {
        super(nome,idade);
        
        if (umaMatricula < 0) {
            this.matricula = 0;
        }

        else {
            this.matricula = umaMatricula;
        }
    }
    // Getters
    public Integer getMatricula() {return this.matricula;}

    // Setters
    public void setMatricula(Integer umaMatricula) {
        if (umaMatricula < 0) {
            this.matricula = 0;
        }

        else {
            this.matricula = umaMatricula;
        }
    }

    // Dados membro
    Integer matricula;
}