package projeto.java.web.web.controller;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import projeto.java.web.web.client.ProdutosClient;
import projeto.java.web.web.model.Produto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ProdutoController {
    private final ProdutosClient produtosClient;

    public ProdutoController(ProdutosClient produtosClient) {
        this.produtosClient = produtosClient;
    }

    @RequestMapping("/show-produtos")
    public String showProdutos(Model model) {
        List<Produto> prodList  =  produtosClient.findAll();
        model.addAttribute("produtos", prodList);

        return "showprodutos";
    }

    @RequestMapping("/create-produto")
    public String showCreateContactPage(Model model) {
        model.addAttribute("command", new Produto());
        return "createproduto";
    }

    @RequestMapping(value = "/delete-produto/{pid}")
    public String deleteProduto(@PathVariable int pid) {
        try {
            String ur = "http://localhost:8082/api/v1/produtos/" + pid;
            URL url = new URL(ur);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("DELETE");
            connection.getResponseCode();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/show-produtos";
    }

    @RequestMapping(value = "/create-produto", method = RequestMethod.POST)
    public String createProduto(@ModelAttribute("produto") Produto produto) {
        try {
            //http://localhost:8082/api/v1/produtos
            String ur = "http://localhost:8082/api/v1/produtos/?nome="+ produto.getNome() +"&descricao=" + produto.getDescricao() +"&preco=" + produto.getPreco();
            String newur= ur.replaceAll(" ","%20");
            URL url = new URL(newur);
            System.out.println(url);         
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.getResponseCode();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/show-produtos";
    }

    @RequestMapping(value = "/update-produto/{pid}")
    public String showUpdateProduto(@PathVariable int pid, Model model) {
        model.addAttribute("id", pid);
        model.addAttribute("command", produtosClient.findByPid(pid));
        return "updateproduto";
    }
    
    @RequestMapping(value = "/update-produto/{pid}", method = RequestMethod.POST)
    public String updateProduto(@PathVariable int pid, @ModelAttribute("produto") Produto produto) {
        try {
            String ur = "http://localhost:8082/api/v1/produtos/" + produto.getPid() + "?nome=" + produto.getNome() + "&descricao=" + produto.getDescricao() + "&preco=" + produto.getPreco();
            String newur= ur.replaceAll(" ","%20");
            URL url = new URL(newur);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("PUT");
            connection.getResponseCode();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/show-produtos";
    }
}
