public class Main {
    public static void main(String[] args) {
        
        ContaBancaria b1 = new ContaBancaria(1);
        ContaBancaria b2 = new ContaBancaria(1);

        System.out.println("B1: " + b1.toString());
        System.out.println("B2: " + b2.toString());

        if (b1.equals(b2)) {
            System.out.println("O numero das duas contas são iguais");
        }
    }
}