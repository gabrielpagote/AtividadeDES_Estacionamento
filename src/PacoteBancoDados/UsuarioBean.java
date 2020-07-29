
package PacoteBancoDados;

public class UsuarioBean {
    
    private String nomeUsu;
    private String senhaUsu;

    public UsuarioBean() {
    }

    public UsuarioBean(String nomeUsu, String senhaUsu) {
        this.nomeUsu = nomeUsu;
        this.senhaUsu = senhaUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }
            
}
