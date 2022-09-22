package projeto.java.web.web.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import projeto.java.web.web.model.Pedido;

@Component
public class PedidoClient {
    public Pedido findByPid(Integer peid) {
        RestTemplate template = new RestTemplate();
        return template.getForObject("http://localhost:8082/api/v1/pedidos/{peid}", Pedido.class, peid);
   }
}
