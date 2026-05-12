public class Cliente {
    public int id;

    public String nome;

    public String email;

    public String telefone;

    public String Nif;


    public Cliente(int id, String nome, String email, String telefone, String Nif) {

        this.id = id;

        this.nome = nome;

        this.email = email;

        this.telefone = telefone;
        
        this.Nif = Nif;

    }


    @Override

    public String toString() {

        return nome;

    }
}
