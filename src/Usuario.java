

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private Papel papel;
    private boolean logado;
    
    public Usuario(String nome, String login, String senha, Papel papel) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.papel = papel;
        this.logado = false;
    }

    // Método para verificar login
    public boolean verificarLogin(String login, String senha) {
        if(this.login.equals(login) && this.senha.equals(senha)){
            this.logado = true;
            return this.logado;
        }
        return this.logado;
    }

    // Getters e Setters (mantidos para referência)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
}