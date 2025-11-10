public class Usuario {

    public Usuario() {
        this.nome = "NULL";
        this.nivel_acesso = NivelAcesso.BASICO;
    }

    public Usuario(String umNome, NivelAcesso umNivel) {
        this.nome = umNome;
        this.nivel_acesso = umNivel;
    }

    public void acess() {
        if (this.nivel_acesso == NivelAcesso.BASICO) {
            System.out.println("Nível de Acesso do Usuario " + "'" + this.nome + "'" + ": Básico");
        }

        else if (this.nivel_acesso == NivelAcesso.INTERMEDIARIO) {
            System.out.println("Nível de Acesso do Usuario " + "'" + this.nome + "'" + ": Intermediário");
        }

        else if (this.nivel_acesso == NivelAcesso.ADMIN) {
            System.out.println("Nível de Acesso do Usuario " + "'" + this.nome + "'" + ": Administrador");
        }
    }


    // Dados membro
    private String nome;
    private  NivelAcesso nivel_acesso;
}