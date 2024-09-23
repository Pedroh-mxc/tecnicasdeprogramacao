package main.java.Ex1;
class Cafe {
    private String tipo;
    private double preco;
    private int quantidade;

    public Cafe(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
        this.quantidade = 0;
    }

    public void adicionarVenda() {
        this.quantidade++;
    }

    public double calcularValorTotal() {
        return this.quantidade * this.preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }
}

class MaquinaDeCafe {
    private Cafe expresso;
    private Cafe capuccino;
    private Cafe leiteComCafe;

    public MaquinaDeCafe() {
        this.expresso = new Cafe("Expresso", 0.75);
        this.capuccino = new Cafe("Capuccino", 1.00);
        this.leiteComCafe = new Cafe("Leite com Café", 1.25);
    }

    public void venderCafe(int opcao) {
        switch (opcao) {
            case 1 -> expresso.adicionarVenda();
            case 2 -> capuccino.adicionarVenda();
            case 3 -> leiteComCafe.adicionarVenda();
            default -> System.out.println("Opção inválida");
        }
    }

    public void exibirRelatorio() {
        double valorTotal = expresso.calcularValorTotal() +
                capuccino.calcularValorTotal() +
                leiteComCafe.calcularValorTotal();

        int totalVendas = expresso.getQuantidade() +
                capuccino.getQuantidade() +
                leiteComCafe.getQuantidade();

        System.out.println("Qde café expresso: " + expresso.getQuantidade() +
                " - valor: " + expresso.calcularValorTotal());
        System.out.println("Qde café capuccino: " + capuccino.getQuantidade() +
                " - valor: " + capuccino.calcularValorTotal());
        System.out.println("Qde leite com café: " + leiteComCafe.getQuantidade() +
                " - valor: " + leiteComCafe.calcularValorTotal());
        System.out.println("Qde cafés vendidos: " + totalVendas +
                " - valor cafés vendidos: " + valorTotal);
    }
}