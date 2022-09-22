package projeto.java.web.web.client;

//import java.util.List;

//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import projeto.java.web.web.model.Produto;
//import projeto.java.web.web.model.ProdutosList;


@Component
public class ProdutosClient {

    public List<Produto> findAll() {
          RestTemplate template = new RestTemplate();
          //template.getForObject("http://localhost:8082/api/v1/produtos", Produtos.class);
          Produto[] prodArray = template.getForObject("http://localhost:8082/api/v1/produtos", Produto[].class);
          List<Produto> prodList = Arrays.asList(prodArray);
          return prodList;
   } 

   public Produto findByPid(Integer pid) {
        RestTemplate template = new RestTemplate();
        return template.getForObject("http://localhost:8082/api/v1/produtos/{pid}", Produto.class, pid);
   }
   
}
