import java.util.HashSet;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        HashSet<String> palavras = new HashSet<>();
        
        while (true) {
            System.out.print("Digite uma palavra: "); 
            String palavra = input.nextLine();
            
            if (palavra.equals("fim")) {
                break;
            }

            else {
                palavras.add(palavra);
            }
        }
        input.close();

        System.out.println("PALAVRAS =" + palavras);

        if (palavras.contains("Java")) {
            System.out.println("A palavra 'Java' foi digitada.");
        }



    }
}
