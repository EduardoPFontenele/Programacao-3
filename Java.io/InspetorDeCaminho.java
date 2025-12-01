import java.io.File;
import java.util.Scanner;

public class InspetorDeCaminho {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o caminho do arquivo: ");
        final String NOME_CAMINHO = input.nextLine();

        File arquivo = new File(NOME_CAMINHO);

        if (arquivo.exists()) {
            if (arquivo.isFile()) {
                System.out.println("TIPO: É um arquivo.");
            }

            else if (arquivo.isDirectory()) {
                System.out.println("TIPO: É um diretório");
            }

            System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
            System.out.println("Tamanho do arquivo em bytes: " + arquivo.length());
        }

        else{
            System.out.println("O arquivo não existe");
        }

        
    }
}