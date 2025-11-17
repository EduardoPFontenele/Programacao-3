import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um texto: ");

        try {
            String texto = input.nextLine();
            int texto_para_int=  Integer.parseInt(texto);
            System.out.println("Conversão bem-sucedida");
        }

        catch(NumberFormatException erro) {
            System.err.println("ERRO: Valor informado inválido.");
        }

        finally {
            System.out.println("Encerrando programa . . .");
        }
    }
}