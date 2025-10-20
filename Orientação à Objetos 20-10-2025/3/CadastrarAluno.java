import java.util.ArrayList;
import java.util.Iterator;

public class CadastrarAluno {

    // Construtor default
    public CadastrarAluno() {
        this.alunos = new ArrayList<String>();
    }

    // Construtor parametrizado
    public CadastrarAluno(ArrayList<String> outra_lista) {
        this.alunos = outra_lista;
    }

    // Construtor de cópia
    public CadastrarAluno(CadastrarAluno outra_lista) {
        this.alunos = outra_lista.alunos;
    }

    // Método para inserir o nome de um aluno
    public void insereAluno(String umNome) {
        alunos.add(umNome);
    }

    // Método para remover um aluno
    public void removeAluno(String umNome) {
        alunos.remove(umNome);
    }

    public void listarAlunos() {
        Iterator i = alunos.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }

    // Dados-membro
    private ArrayList<String> alunos;

}