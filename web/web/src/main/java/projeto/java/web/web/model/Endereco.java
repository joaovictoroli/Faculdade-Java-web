package projeto.java.web.web.model;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Endereco {

    @JsonProperty
    private Integer id;
    @JsonProperty
    private String cep;
    @JsonProperty
    private String uf;
    @JsonProperty
    private String localidade;
    @JsonProperty
    private String bairro;
    @JsonProperty
    private String logradoro;
    @JsonProperty
    private String numero;
    @JsonProperty
    private String complemento;
    @JsonProperty
    private String ddd;
    @JsonProperty
    private Usuario emailUsuario;

    public Endereco() {
    }

    public Endereco(Integer id) {
        this.id = id;
    }
    
    public Endereco(String cep, String uf, String localidade, String bairro, String logradoro, String numero, String complemento, String ddd, Usuario emailUsuario) {
        this.cep = cep;
        this.uf = uf;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradoro = logradoro;
        this.numero = numero;
        this.complemento = complemento;
        this.ddd = ddd;
        this.emailUsuario = emailUsuario;
    }

    public Endereco(Integer id, String cep, String uf, String localidade, String bairro, String logradoro, String numero, String complemento, String ddd, Usuario emailUsuario) {
        this.id = id;
        this.cep = cep;
        this.uf = uf;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradoro = logradoro;
        this.numero = numero;
        this.complemento = complemento;
        this.ddd = ddd;
        this.emailUsuario = emailUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradoro() {
        return logradoro;
    }

    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
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

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Usuario getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(Usuario emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aws.example.projeto.model.Endereco[ id=" + id + " ]";
    }
    
}
