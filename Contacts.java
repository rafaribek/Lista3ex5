public class Contacts {
    private String nome;
    private String endereco;
    private String sexo;
    private String telefone;
    private String celular;
    private String email;
    public Contacts(String nome, String endereco, String sexo, String telefone, String celular, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }
}


class ContactBook {
    private static final int MAX_CONTATOS = 100;
    private Contacts[] contatos;
    private int numContatos;


    public ContactBook() {
        contatos = new Contacts[MAX_CONTATOS];
        numContatos = 0;
    }

    public void incluirContato(Contacts contato) {
        if (numContatos < MAX_CONTATOS) {
            contatos[numContatos] = contato;
            numContatos++;
        } else {
            System.out.println("A agenda está cheia. Não é possível adicionar mais contatos.");
        }
    }

    public void visualizarContatos() {
        if (numContatos == 0) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Contatos cadastrados na agenda:");
            for (int i = 0; i < numContatos; i++) {
                System.out.println("Nome: " + contatos[i].getNome());
                System.out.println("Endereço: " + contatos[i].getEndereco());
                System.out.println("Sexo: " + contatos[i].getSexo());
                System.out.println("Telefone: " + contatos[i].getTelefone());
                System.out.println("Celular: " + contatos[i].getCelular());
                System.out.println("E-mail: " + contatos[i].getEmail());
                System.out.println("-----------------------------");
            }
        }
    }

    public void excluirContato(String nome) {
        for (int i = 0; i < numContatos; i++) {
            if (contatos[i].getNome().equals(nome)) {

                for (int j = i; j < numContatos - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                contatos[numContatos - 1] = null;
                numContatos--;
                System.out.println("Contato '" + nome + "' excluído com sucesso.");
                return;
            }
        }
        System.out.println("Contato '" + nome + "' não encontrado na agenda.");
    }
}

