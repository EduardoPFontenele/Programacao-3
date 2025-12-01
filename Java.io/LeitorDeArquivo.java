import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeitorDeArquivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        try {
            
            // Abre o fluxo de bytes do arquivo
            FileInputStream fis = new FileInputStream(nomeArquivo);
            
            // Converte bytes em caracteres
            InputStreamReader isr = new InputStreamReader(fis);
            
            // Armazena caracteres em buffer para leitura eficiente linha a linha
            BufferedReader br = new BufferedReader(isr);

            System.out.println("\n--- Conteúdo do Arquivo ---");
            
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo.");

        } finally {
            scanner.close();
        }
    }
}