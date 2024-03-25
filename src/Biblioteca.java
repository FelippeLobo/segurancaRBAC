import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        inicializarLivros();
    }

    // Método para inicializar os livros
    private void inicializarLivros() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String nome = "Livro " + (i + 1);
            String autor = "Autor " + (i + 1);
            boolean disponivel = true;

            // Sorteando se o livro é para alunos ou professores
            boolean paraAlunos = random.nextBoolean();

            Papel destinado;
            if(paraAlunos){
                destinado = Papel.ALUNO;
            }else{
                destinado = Papel.PROFESSOR;
            }

            Livro livro = new Livro(nome, autor, disponivel, destinado);
            livros.add(livro);
        }
    }

    public List<Livro> pesquisarLivrosPorPapel(Papel papelUsuario) {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            // Verificando se o livro está disponível e se corresponde ao papel do usuário
            if (livro.isDisponivel() && ((papelUsuario == livro.getDestino()))) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public void inserirLivro(Livro novoLivro, Papel papelUsuario) {
        if (papelUsuario == Papel.PROFESSOR) {
            livros.add(novoLivro);
            System.out.println("Novo livro adicionado com sucesso!");
        } else {
            System.out.println("Apenas professores podem adicionar novos livros!");
        }
    }
    
    // Getters e Setters
    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}