package projeto.java.web.web.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Produto {
    @JsonProperty
    private Integer pid;
    @JsonProperty
    private String nome;
    @JsonProperty
    private String descricao;
    @JsonProperty
    private float preco;
    @JsonProperty
    private List<PedidoHasProduto> pedidoHasProdutoList;

    public Produto() {
    }

    public Produto(Integer pid) {
        this.pid = pid;
    }

    public Produto(String nome, String descricao, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(Integer pid, String nome, String descricao, float preco) {
        this.pid = pid;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public List<PedidoHasProduto> getPedidoHasProdutoList() {
        return pedidoHasProdutoList;
    }

    public void setPedidoHasProdutoList(List<PedidoHasProduto> pedidoHasProdutoList) {
        this.pedidoHasProdutoList = pedidoHasProdutoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", nome=" + nome + ", pedidoHasProdutoList=" + pedidoHasProdutoList
                + ", pid=" + pid + ", preco=" + preco + "]";
    }

    
    
}