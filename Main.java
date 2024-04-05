public class Main {
    public static void main(String[] args) {
        Contacts contato1 = new Contacts("João", "Rua A, 123", "Masculino", "123456789", "987654321", "joao@example.com");
        Contacts contato2 = new Contacts("Maria", "Rua B, 456", "Feminino", "987654321", "123456789", "maria@example.com");

        ContactBook agenda = new ContactBook();

        agenda.incluirContato(contato1);
        agenda.incluirContato(contato2);

        agenda.visualizarContatos();

        agenda.excluirContato("Maria");

        agenda.visualizarContatos();
    }
}

