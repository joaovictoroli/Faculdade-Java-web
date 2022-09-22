package projeto.java.web.web.model;

public class ProdutoInPedidoInterface {
    private Integer peid;
    private Integer pid;
    private String nome;
    private float preco;
    private int quantidade;
    private float valortotal;
    
    public ProdutoInPedidoInterface(int peid, Integer pid, String nome, float preco, int quantidade, float valortotal) {
        this.peid = peid;
        this.pid = pid;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valortotal = valortotal;
    }

    public ProdutoInPedidoInterface(Integer pid, String nome, float preco) {
        this.pid = pid;
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoInPedidoInterface(Integer pid, String nome, float preco, int quantidade, float valortotal) {
        this.pid = pid;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valortotal = valortotal;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    
    public int getPeid() {
        return peid;
    }

    public void setPeid(int peid) {
        this.peid = peid;
    } 

}

