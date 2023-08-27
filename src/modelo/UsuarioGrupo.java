package modelo;

/**
 *
 * @author aluno
 */
public class UsuarioGrupo {

    private Integer id;
    private String nome;

    public UsuarioGrupo() {
    }

    public UsuarioGrupo(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
