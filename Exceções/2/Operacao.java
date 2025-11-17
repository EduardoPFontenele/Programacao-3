public interface Operacao {
    public static double calculaRaiz(double numero)throws IllegalArgumentException{

        if (numero < 0.0) {
            throw new IllegalArgumentException("ERRO: numero negativo");
        }

        return Math.pow(numero, 0.5);
    }
}