package projeto.java.web.web.controller;

import projeto.java.web.web.client.UsuarioClient;
import projeto.java.web.web.model.Endereco;
//import projeto.java.web.web.model.Endereco;
import projeto.java.web.web.model.Usuario;
import projeto.java.web.web.model.UsuarioToPost;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsuarioController {
    private final UsuarioClient usuarioClient;

    public UsuarioController(UsuarioClient usuarioClient) {
        this.usuarioClient = usuarioClient;
    }

    @RequestMapping("/show-usuarios")
    public String showUsuarios(Model model) {
        List<Usuario> usuariosList  =  usuarioClient.findAll();
        model.addAttribute("usuarios", usuariosList);
        
        return "showusuarios";
    }

    @RequestMapping("/create-usuario")
    public String showCreateContactPage(Model model) {
        model.addAttribute("command", new UsuarioToPost());
        return "createusuario";
    }

    @RequestMapping(value = "/create-usuario", method = RequestMethod.POST)
    public String createProduto(@ModelAttribute("produto") UsuarioToPost usuario) {
        try {
            String ur = "http://localhost:8081/api/v1/usuarios?email=" + usuario.getEmail() + "&nome=" + usuario.getNome() +"&telefone=" + usuario.getTelefone() + "&CEP=" + usuario.getCEP() +"&numero=" + usuario.getNumero() + "&complemento="  + usuario.getComplemento();
            System.out.println("SADASDASDSADASDAS///"+ ur);
            String newur= ur.replaceAll(" ","%20");
            URL url = new URL(newur);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.getResponseCode();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/show-usuarios";
    }
    
    @RequestMapping("/show-usuario/{email}")
    public String showUsuarioPage(@PathVariable String email, Model model) {
        Usuario usuario = usuarioClient.findByEmail(email);
        model.addAttribute("usuario", usuario);
        return "showusuario";
    }

    @RequestMapping(value = "/delete-usuario/{email}")
    public String deleteUsuario(@PathVariable String email) {
        try {
            String ur = "http://localhost:8081/api/v1/usuarios/" + email;
            URL url = new URL(ur);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("DELETE");
            connection.getResponseCode();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/show-usuarios";
    }

    @RequestMapping(value = "/update-usuario/{email}")
    public String showUpdateProduto(@PathVariable String email, Model model) {
        model.addAttribute("email", email);
        Usuario usuario = usuarioClient.findByEmail(email);
        Endereco endereco = usuario.getEndereco();
        UsuarioToPost usuarioToPost = new UsuarioToPost(email, usuario.getNome(), usuario.getTelefone(), endereco.getCep(), endereco.getNumero(), endereco.getComplemento());
        model.addAttribute("command", usuarioToPost);
        model.addAttribute("endereco", endereco);
        return "updateusuario";
    }

    @RequestMapping(value = "/update-usuario/{email}", method = RequestMethod.POST)
    public String updateProduto(@PathVariable String email, @ModelAttribute("usuario") UsuarioToPost usuario) {
        try {
            String ur = "http://localhost:8081/api/v1/usuarios/" + usuario.getEmail() + "?nome=" + usuario.getNome() + "&telefone=" + usuario.getTelefone() + "&CEP=" + usuario.getCEP() + "&numero=" + usuario.getNumero() +"&complemento=" + usuario.getComplemento();
            String newur= ur.replaceAll(" ","%20");
            URL url = new URL(newur);            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("PUT");
            connection.getResponseCode();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/show-usuarios";
    }
}
