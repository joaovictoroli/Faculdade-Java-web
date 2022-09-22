package projeto.java.web.web.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.RequestMethod;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestParam;
import projeto.java.web.web.client.ProdutosClient;
import projeto.java.web.web.client.UsuarioClient;
import projeto.java.web.web.model.Pedido;
import projeto.java.web.web.model.PedidoHasProduto;
import projeto.java.web.web.model.Produto;
import projeto.java.web.web.model.ProdutoInPedidoInterface;
import projeto.java.web.web.model.Usuario;


@Controller
public class PedidoController {
    //private final PedidoClient pedidoClient;
    private final UsuarioClient usuarioClient;
    private final ProdutosClient produtoClient;

    public PedidoController(UsuarioClient usuarioClient, ProdutosClient produtoClient) {
        //this.pedidoClient = pedidoClient;
        this.usuarioClient = usuarioClient;
        this.produtoClient = produtoClient;
    }

    @RequestMapping("/usuario/{email}/show-produtos")
    public String showProdutos
        (@PathVariable String email,
        Model model) {
        Usuario usuario = usuarioClient.findByEmail(email); 
        model.addAttribute("usuario", usuario);
        model.addAttribute("produtos", produtoClient.findAll());
        return "showprodutostouser";
    }

    @RequestMapping(value = "/usuario/{email}/show-produtos", method = RequestMethod.POST)
    public String createPedido(@PathVariable String email,
    @RequestParam(value="produtoId") Integer produtoId,
    @RequestParam(value="quantidade") Integer quantidade) {
        
        addProdutoInPedido(email, produtoId, quantidade);
        
        return "redirect:/usuario/" + email +"/show-produtos";                   
    }

    public void addProdutoInPedido(String email, Integer pid, int quantidade) {
        try {
            String ur = "http://localhost:8082/api/v1/pedidos?emailUsuario=" + email + "&idproduto=" + pid + "&quantidade=" + quantidade;
            URL url = new URL(ur);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.getResponseCode();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @RequestMapping("/usuario/{email}/pedido")
    public String showPedidoUser(@PathVariable String email, Model model){
        model.addAttribute("userEmail", email);

        Usuario user = usuarioClient.findByEmail(email);
        List<PedidoHasProduto> pedidos = user.getPedido().getPedidoHasProdutoList();

        Pedido pedidoshow = user.getPedido();
        model.addAttribute("valortotal", pedidoshow.getValorTotal());
        List<ProdutoInPedidoInterface> produtoList = new ArrayList<ProdutoInPedidoInterface>();
        for (PedidoHasProduto pedido : pedidos) {
            Produto prod = produtoClient.findByPid(pedido.getPedidoHasProdutoPK().getProdutoId());
            float precoTotalProd = prod.getPreco() * pedido.getQuantidade();
            ProdutoInPedidoInterface produoInPedido = new ProdutoInPedidoInterface(pedidoshow.getPeid(), prod.getPid(), prod.getNome(), prod.getPreco(), pedido.getQuantidade(), precoTotalProd);
            produtoList.add(produoInPedido);
        }
        model.addAttribute("produtos", produtoList);

        return "showpedidouser";
    }

    @RequestMapping(value="/usuario/{email}/pedido/{peid}/{pid}")
    public String deleteProdutoInPedido(@PathVariable String email, @PathVariable int peid, @PathVariable int pid) {
        //http://localhost:8082/api/v1/pedidos/3/produto/3
        try {
            String ur = "http://localhost:8082/api/v1/pedidos/" + peid + "/produto/" + pid;
            URL url = new URL(ur);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("DELETE");
            connection.getResponseCode();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/usuario/" + email + "/pedido";
    }

    public boolean checkWUserHasPedido(Usuario user) {
        Pedido pedido = user.getPedido();
        if (pedido != null) {
            return true;
        } else {
            return false;
        }
    }
}
