package projeto.java.web.web.model;



import com.fasterxml.jackson.annotation.JsonProperty;

public class PedidoHasProdutoPK {
    @JsonProperty
    private int pedidoId;
    @JsonProperty
    private int produtoId;

    public PedidoHasProdutoPK() {
    }

    public PedidoHasProdutoPK(int pedidoId, int produtoId) {
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pedidoId;
        hash += (int) produtoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PedidoHasProdutoPK)) {
            return false;
        }
        PedidoHasProdutoPK other = (PedidoHasProdutoPK) object;
        if (this.pedidoId != other.pedidoId) {
            return false;
        }
        if (this.produtoId != other.produtoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aws.example.projeto.model.PedidoHasProdutoPK[ pedidoId=" + pedidoId + ", produtoId=" + produtoId + " ]";
    }
    
}

