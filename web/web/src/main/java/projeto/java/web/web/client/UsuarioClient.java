package projeto.java.web.web.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import projeto.java.web.web.model.Usuario;

import java.util.Arrays;
import java.util.List;

@Component
public class UsuarioClient {

    public List<Usuario> findAll() {
        RestTemplate template = new RestTemplate();
        Usuario[] prodArray = template.getForObject("http://localhost:8081/api/v1/usuarios", Usuario[].class);
        List<Usuario> prodList = Arrays.asList(prodArray);
        return prodList;
    } 

    public Usuario findByEmail(String email) {
        RestTemplate template = new RestTemplate();
        return template.getForObject("http://localhost:8081/api/v1/usuarios/{email}", Usuario.class, email);
   }
}
