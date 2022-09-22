package projeto.java.web.web.model;



import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;



public class Pedido  {
    @JsonProperty
    private Integer peid;
    @JsonProperty
    private Date data;
    @JsonProperty
    private float valorTotal;
    @JsonProperty
    private Usuario usuarioEmail;
    @JsonProperty
    private List<PedidoHasProduto> pedidoHasProdutoList;

    public Pedido() {
    }

    public Pedido(Integer peid) {
        this.peid = peid;
    }

    public Pedido(Date data, float valorTotal, Usuario usuarioEmail) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.usuarioEmail = usuarioEmail;
    }

    public Pedido(Integer peid, Date data, float valorTotal) {
        this.peid = peid;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Integer getPeid() {
        return peid;
    }

    public void setPeid(Integer peid) {
        this.peid = peid;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Usuario getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(Usuario usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
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
        hash += (peid != null ? peid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.peid == null && other.peid != null) || (this.peid != null && !this.peid.equals(other.peid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aws.example.projeto.model.Pedido[ peid=" + peid + " pedidoHasProdutoList=" + pedidoHasProdutoList + "]";
    }
    
}
