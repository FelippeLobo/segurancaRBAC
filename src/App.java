import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuarioA = new Usuario("Fernando", "aluno123", "aluno123", Papel.ALUNO);
        Usuario usuarioB = new Usuario("Roberto", "professor123", "professor123", Papel.PROFESSOR);
        Biblioteca biblioteca = new Biblioteca();
        Livro novoLivro = new Livro("Novo Livro", "Novo Autor", true, Papel.PROFESSOR);

        if (usuarioA.verificarLogin("aluno123", "aluno123")) {
            // Exemplo de pesquisa de livros para um aluno
            System.out.println("Livros para alunos:");
            List<Livro> livrosParaAlunos = biblioteca.pesquisarLivrosPorPapel(usuarioA.getPapel());
            for (Livro livro : livrosParaAlunos) {
                System.out.println("Nome: " + livro.getNome() + ", Autor: " + livro.getAutor() + ", Disponível: "
                        + livro.isDisponivel() + ", Destino: " + livro.getDestino());
            }

            System.out.println("\nInserção de novo livro por um aluno:");
            biblioteca.inserirLivro(novoLivro, usuarioA.getPapel());
        }

        if (usuarioB.verificarLogin("professor123", "professor123")) {
            System.out.println("\nLivros para professores:");
            List<Livro> livrosParaProfessores = biblioteca.pesquisarLivrosPorPapel(usuarioB.getPapel());
            for (Livro livro : livrosParaProfessores) {
                System.out.println("Nome: " + livro.getNome() + ", Autor: " + livro.getAutor() + ", Disponível: "
                        + livro.isDisponivel() + ", Destino: " + livro.getDestino());
            }

            System.out.println("\nInserção de novo livro por um professor:");
            biblioteca.inserirLivro(novoLivro, usuarioB.getPapel());
        }

        // Exibindo os detalhes dos livros na lista atualizada
        System.out.println("\nLista atualizada de livros:");
        List<Livro> listaDeLivros = biblioteca.getLivros();
        for (Livro livro : listaDeLivros) {
            System.out.println("Nome: " + livro.getNome() + ", Autor: " + livro.getAutor() + ", Disponível: "
                    + livro.isDisponivel() + ", Destino: " + livro.getDestino());
        }
    }

}
