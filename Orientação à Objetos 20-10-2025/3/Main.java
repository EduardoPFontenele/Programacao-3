public class Main {
    public static void main(String[] args) {

        CadastrarAluno alunos = new CadastrarAluno();

        System.out.println("Lista de alunos original: ");

        alunos.insereAluno("Eduardo");
        alunos.insereAluno("João");
        alunos.insereAluno("Roberto");
        alunos.insereAluno("Mario");
        alunos.insereAluno("Maria");

        alunos.listarAlunos();

        alunos.removeAluno("Eduardo");
        
        System.out.println("\nLista de alunos depois de remover 'Eduardo':\n ");
        alunos.listarAlunos();

    }
}