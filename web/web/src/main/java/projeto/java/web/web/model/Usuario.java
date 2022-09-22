package projeto.java.web.web.model;


import com.fasterxml.jackson.annotation.JsonProperty;



public class Usuario {
    @JsonProperty
    private String email;
    @JsonProperty
    private String nome;
    @JsonProperty
    private String telefone;
    @JsonProperty
    private Pedido pedido;
    @JsonProperty
    private Endereco endereco;

    public Usuario() {
    }

    public Usuario(String email) {
        this.email = email;
    }

    public Usuario(String email, String nome, String telefone) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aws.example.projeto.model.Usuario[ email=" + email + " ]";
    }
    
}

