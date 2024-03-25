public class Livro {
    private String nome;
    private String autor;
    private boolean disponivel;
    private Papel destinado;

    public Livro(String nome, String autor, boolean disponivel, Papel destinado) {
        this.nome = nome;
        this.autor = autor;
        this.disponivel = disponivel;
        this.destinado = destinado;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Papel getDestino() {
        return destinado;
    }

    public void setDestino(Papel destinado) {
        this.destinado = destinado;
    }
}