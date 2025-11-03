public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Eduardo",19,111);
        System.out.println("Nome: " + a1.getNome() + "\n" +
                           "Idade: " + a1.getIdade() + "\n" +
                           "Matrícula: " + a1.getMatricula() + "\n");
    
    }
}