package ifpb.ads.cliente;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/06/2017, 16:57:08
 */
public class ClienteService {

    public void salvar(Cliente cliente){
        cliente.setNome("Oi, "+cliente.getNome());
    }
}
