public class Main {
    public static void main(String[] args) {
        Pessoa.PessoaBuilder builder = new Pessoa.PessoaBuilder();
        builder.nome("Loberto")
                .altura(1.85)
                .idade(23)
                .nacionalidade("Brasil");

        Pessoa pessoa = builder.build();

        // Director
        Director diretor = new Director();
        Pessoa senhor = diretor.idosoMexicano(new Pessoa.PessoaBuilder());
        Pessoa crianca = diretor.criancaAlema(new Pessoa.PessoaBuilder());
    }
}