package aula6.exercicio;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos livros você deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        String [] livros = new String[4];

        while (quantidade!=0){
            System.out.print("Digite o título do livro: ");
            livros[0] = sc.next();
            System.out.print("Digite o nome do autor: ");
            livros[1] = sc.next();
            System.out.print("Digite se ele já foi lançado com true ou false: ");
            livros[2] = sc.next();
            System.out.print("Digite o número de páginas: ");
            livros[3] = sc.next();

            Livro livro = new Livro();
            livro.setAutor(livros[1]);
            livro.setLancamento(Boolean.parseBoolean(livros[2]));
            livro.setPaginas(Integer.parseInt(livros[3]));
            livro.setTitulo(livros[0]);

            System.out.println(livro);

            quantidade--;
        }
    }
}
