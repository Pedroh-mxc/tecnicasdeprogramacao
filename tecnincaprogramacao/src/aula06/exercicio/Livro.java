package aula6.exercicio;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean lancamento;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas >= 0) {
            this.paginas = paginas;
        } else{
            this.paginas = 0;
        }
    }

    public boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", lancamento=" + lancamento +
                '}';
    }
}
