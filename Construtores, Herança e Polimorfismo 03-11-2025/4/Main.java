import java.util.ArrayList;

public class Main{
    public static void main(String args[]) {

        ArrayList<Animal> animais = new ArrayList<>();
        Animal c1 = new Cachorro();
        Animal g1 = new Gato();

        animais.add(c1);
        animais.add(g1);
        
        int i = 0;
        System.out.print("[");

        for (Animal animal:animais) {
            if (i != animais.size() - 1) {
                System.out.print(animal.emitirSom() + ", ");
            }
            
            else {
                System.out.print(animal.emitirSom());
            }
            i++;

        }
        System.out.println("]");
        
    }
}