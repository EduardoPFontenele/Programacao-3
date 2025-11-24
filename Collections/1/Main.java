import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();   
        Scanner input = new Scanner(System.in);
        Integer soma = 0;

        for (int i = 0 ; i < 10; i++) {
            boolean entrada_correta = false;

            while(!entrada_correta) {
                System.out.print("lista" + "[" + i + "]" + "= ");

                try {
                    int numero = input.nextInt();
                    numeros.add(numero);
                    entrada_correta = true;
                }
                
                catch(InputMismatchException erro) {
                        System.err.println("Valor inválido! Tente novamente.");
                        input.next();

                }
            }
        }
        
        input.close();
        System.out.println("LISTA:" + numeros);

        for (Integer num: numeros) {
            soma += num;
        }
        System.out.println("SOMA: " + soma);

        Integer media = soma / 10;
        System.out.println("MÉDIA: "+ media);

        numeros.removeIf(numero -> numero % 2 ==0);

        System.out.println("LISTA ATUALIZADA:" + numeros);

    }
}
