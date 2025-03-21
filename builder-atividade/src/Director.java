public class Director {
    public Pessoa idosoMexicano(Pessoa.PessoaBuilder builder){
        return builder.nome("Hernesto")
                .altura(1.90)
                .idade(87)
                .nacionalidade("Mexicano")
                .build();
    }

    public Pessoa criancaAlema(Pessoa.PessoaBuilder builder){
        return builder.nome("Hans")
                .altura(1.50)
                .idade(10)
                .nacionalidade("Alemanha")
                .build();
    }
}
