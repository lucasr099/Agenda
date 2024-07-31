import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Atualizar Contato");
            System.out.println("4. Remover Contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone, email);
                    break;
                case 2:
                    agenda.listaDeContatos();
                    break;
                case 3:
                    System.out.print("Nome do contato a ser atualizado: ");
                    nome = scanner.nextLine();
                    System.out.print("Novo Telefone: ");
                    telefone = scanner.nextLine();
                    System.out.print("Novo Email: ");
                    email = scanner.nextLine();
                    agenda.atualizarContato(nome, telefone, email);
                    break;
                case 4:
                    System.out.print("Nome do contato a ser removido: ");
                    nome = scanner.nextLine();
                    agenda.removerContato(nome);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
