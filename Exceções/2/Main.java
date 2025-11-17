import java.util.Scanner;

public class Main implements Operacao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe um numero: ");

        double numero = input.nextDouble();

        try {
            double resultado = Operacao.calculaRaiz(numero);
            System.out.println("Resultado = " + resultado);
        }

        catch(IllegalArgumentException erro) {
            System.err.println(erro.getMessage());
        }
        
    }
}