public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Eduardo", NivelAcesso.ADMIN);
        Usuario u2 = new Usuario("Ronaldo", NivelAcesso.INTERMEDIARIO);
        Usuario u3 = new Usuario("João", NivelAcesso.BASICO);
        u1.acess();
        u2.acess();
        u3.acess();
    }
}