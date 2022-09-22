package projeto.java.web.web.model;

public class UsuarioToPost {
    private String email;
    private String nome;
    private String telefone;
    private String CEP;
    private String numero;
    private String complemento;
    
    public UsuarioToPost() {
    }

    public UsuarioToPost(String email, String nome, String telefone, String cEP, String numero, String complemento) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        CEP = cEP;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
}
