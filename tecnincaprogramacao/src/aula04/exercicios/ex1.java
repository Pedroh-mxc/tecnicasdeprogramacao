package aula04.exercicios;

public class ex1 {
    class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println(this.nome);
    }
}

    public class Main {
        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa("Pedro Henrique");
            pessoa.exibirNome();
        }
    }

}
