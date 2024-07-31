public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email, String telefone){
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = this.email;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = this.telefone;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
