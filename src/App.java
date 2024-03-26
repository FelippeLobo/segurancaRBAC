import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //Cria um usuario aluno e outro professor
        Usuario usuarioA = new Usuario("Fernando", "aluno123", "aluno123", Papel.ALUNO);
        Usuario usuarioB = new Usuario("Roberto", "professor123", "professor123", Papel.PROFESSOR);
        //Instancia a biblioteca com um conjunto de livros aleatorios
        Biblioteca biblioteca = new Biblioteca();
        //Cria um novo livro para tentar ser inserido pelos usuarios
        Livro novoLivro = new Livro("Novo Livro", "Novo Autor", true, Papel.PROFESSOR);


        if (usuarioA.verificarLogin("aluno123", "aluno123")) {
            // Exemplo de pesquisa de livros para um aluno
            System.out.println("Livros para alunos:");
            //retorna somente os livros que o aluno possui acesso
            List<Livro> livrosParaAlunos = biblioteca.pesquisarLivrosPorPapel(usuarioA.getPapel());
            for (Livro livro : livrosParaAlunos) {
                System.out.println("Nome: " + livro.getNome() + ", Autor: " + livro.getAutor() + ", Disponível: "
                        + livro.isDisponivel() + ", Destino: " + livro.getDestino());
            }
            //Tenta a inserção do novo livro pelo aluno
            System.out.println("\nInserção de novo livro por um aluno:");
            biblioteca.inserirLivro(novoLivro, usuarioA.getPapel());
        }

        if (usuarioB.verificarLogin("professor123", "professor123")) {
            System.out.println("\nLivros para professores:");
            //retorna somente os livros que o professor possui acesso
            List<Livro> livrosParaProfessores = biblioteca.pesquisarLivrosPorPapel(usuarioB.getPapel());
            for (Livro livro : livrosParaProfessores) {
                System.out.println("Nome: " + livro.getNome() + ", Autor: " + livro.getAutor() + ", Disponível: "
                        + livro.isDisponivel() + ", Destino: " + livro.getDestino());
            }
             //Tenta a inserção do novo livro pelo professor
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
