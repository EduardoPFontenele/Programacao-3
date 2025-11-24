
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> dados = new HashMap<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            boolean entrada_valida = false;
            System.out.print("Informe o nome (Digite 'fim' para encerrar): ");
            String nome = input.nextLine();

            if (nome.equals("fim")){
                    break;
            }

            while(!entrada_valida) {
                try {

                    System.out.print("Informe a idade: ");
                    Integer idade = input.nextInt();    
                    input.nextLine();

                    entrada_valida = true;
                    dados.put(nome, idade);

                }

                catch (InputMismatchException erro) {
                    System.err.println("Entrada inválida! Tente novamente");
                    input.next();
                }

            }

        }

        System.out.println("HashMap = " + dados);

        System.out.print("Informe um Nome para realizar a busca: ");
        String nome = input.nextLine();

        if (dados.containsKey(nome)) {
            System.out.println("Pessoa encontrada!\n" + "Nome: " + nome + "\n" + "Idade: " + dados.get(nome));
            dados.remove(nome);

            System.out.println("Pessoa removida do HashMap");
        }

        else {
            System.out.println("Pessão não encontrada.\n");
        }

        System.out.println("HashMap (Atualizado) = " + dados);

    }
}