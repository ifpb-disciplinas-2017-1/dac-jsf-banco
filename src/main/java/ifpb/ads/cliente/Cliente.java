package ifpb.ads.cliente;

import java.io.Serializable;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/06/2017, 16:53:39
 */
public class Cliente implements Serializable{

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
