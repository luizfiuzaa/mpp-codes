public class Pessoa {
    private String nome;
    private double altura;
    private int idade;
    private String nacionalidade;

    public Pessoa(PessoaBuilder builder) {
        this.nome = builder.nome;
        this.altura = builder.altura;
        this.idade = builder.idade;
        this.nacionalidade = builder.nacionalidade;
    }

    public static class PessoaBuilder{
        private String nome;
        private double altura;
        private int idade;
        private String nacionalidade;

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            System.out.println(nome);
            return this;
        }

        public PessoaBuilder altura(double altura){
            this.altura = altura;
            System.out.println(altura);
            return this;
        }

        public PessoaBuilder idade(int idade){
            this.idade = idade;
            System.out.println(idade);
            return this;
        }

        public PessoaBuilder nacionalidade(String nacionalidade){
            this.nacionalidade = nacionalidade;
            System.out.println(nacionalidade);
            return this;
        }
        public Pessoa build(){
            return new Pessoa(this);
        }

    }
}
