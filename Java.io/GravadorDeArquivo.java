import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class GravadorDeArquivo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final String ARQUIVO_SAIDA = "saida.txt";

        System.out.println("Digite as linhas de texto. (Digite 'FIM' para encerrar)");

        try {

            PrintStream gravador = new PrintStream(ARQUIVO_SAIDA);
            String texto;

            int i = 1;

            while (true) {
                System.out.print(i + "   ");
                texto = input.nextLine();

                if(texto.equals("FIM")) {
                    break;
                }

                else {
                    gravador.println(texto);
                    i++;
                }


            }
        } 
        
        catch (FileNotFoundException e) {

            System.err.println("Erro: O arquivo não pode ser criado ou acessado.");

        } finally {

            input.close();
        }
    }
}