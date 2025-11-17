import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numerador da operação: ");
        int numerador = input.nextInt();

        System.out.print("Informe o denominador da operação: ");
        int denominador = input.nextInt();

        input.close();

        try {

            int resultado = Divisao.quociente(numerador,denominador);
            System.out.println("Resultado: " + resultado);
        }

        catch(ArithmeticException erro) {
            System.err.println("ERRO: Divisão por zero.");
        }
        

    }

}