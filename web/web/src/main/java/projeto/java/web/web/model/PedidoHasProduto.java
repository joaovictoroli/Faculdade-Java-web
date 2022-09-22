package projeto.java.web.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;



public class PedidoHasProduto {
    @JsonProperty
    protected PedidoHasProdutoPK pedidoHasProdutoPK;
    private int quantidade;
    @JsonProperty
    private Pedido pedido;
    @JsonProperty
    private Produto produto;

    public PedidoHasProduto() {
    }

    public PedidoHasProduto(PedidoHasProdutoPK pedidoHasProdutoPK) {
        this.pedidoHasProdutoPK = pedidoHasProdutoPK;
    }

    public PedidoHasProduto(PedidoHasProdutoPK pedidoHasProdutoPK, int quantidade) {
        this.pedidoHasProdutoPK = pedidoHasProdutoPK;
        this.quantidade = quantidade;
    }

    public PedidoHasProduto(int pedidoId, int produtoId) {
        this.pedidoHasProdutoPK = new PedidoHasProdutoPK(pedidoId, produtoId);
    }

    public PedidoHasProdutoPK getPedidoHasProdutoPK() {
        return pedidoHasProdutoPK;
    }

    public void setPedidoHasProdutoPK(PedidoHasProdutoPK pedidoHasProdutoPK) {
        this.pedidoHasProdutoPK = pedidoHasProdutoPK;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoHasProdutoPK != null ? pedidoHasProdutoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PedidoHasProduto)) {
            return false;
        }
        PedidoHasProduto other = (PedidoHasProduto) object;
        if ((this.pedidoHasProdutoPK == null && other.pedidoHasProdutoPK != null) || (this.pedidoHasProdutoPK != null && !this.pedidoHasProdutoPK.equals(other.pedidoHasProdutoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PedidoHasProduto{" + "pedidoHasProdutoPK=" + pedidoHasProdutoPK + ", quantidade=" + quantidade + '}';
    }
    
}