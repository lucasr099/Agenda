import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Contato> contatos = new HashMap<>();

    public void adicionarContato(String nome, String telefone, String email){
        Contato contato= new Contato(nome, telefone, email);
        contatos.put(nome, contato);
        System.out.println("Contato adicionado com sucesso!");
    }
    public void listaDeContatos(){
        if (contatos.isEmpty()){
            System.out.println("Nenhum contato na agenda.");
            return;
        }
        contatos.forEach((nome, contato) -> System.out.println(contato));
    }
    public void atualizarContato(String nome, String telefone, String email){
        Contato contato = contatos.get(nome);
        if(contato != null){
            contato.setTelefone(telefone);
            contato.setEmail(email);
            System.out.println("Contato atualizado com sucesso!");
        }else {
            System.out.println("Contato não encontrado.");
        }
    }
    public void removerContato(String nome) {
        if (contatos.remove(nome) != null) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
