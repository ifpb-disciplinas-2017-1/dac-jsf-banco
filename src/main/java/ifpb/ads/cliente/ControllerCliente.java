package ifpb.ads.cliente;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/06/2017, 16:14:04
 */
@Named
@SessionScoped
public class ControllerCliente implements Serializable{ //controllerCliente

//    private String nome;
    private Cliente cliente = new Cliente();
    private ClienteService service = new ClienteService();
    
    public String atualizar(){
        //tratar a requisição
        
        //lógica
        this.service.salvar(cliente);
//        this.cliente = new Cliente();
        return "home.xhtml";
//        return "home.xhtml?faces-redirect=true";
//        return null;
        //redirecionar a resposta
    }

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
