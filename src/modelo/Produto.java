package modelo;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Produto {

    private Integer id;
    private String nome;
    private String unidadeDeMedida;
    private Date datacriacao;

    public Produto() {
    }

    public Produto(Integer id, String nome, String unidadeDeMedida, Date datacriacao) {
        this.id = id;
        this.nome = nome;
        this.unidadeDeMedida = unidadeDeMedida;
        this.datacriacao = datacriacao;
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

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public Date getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(Date datacriacao) {
        this.datacriacao = datacriacao;
    }

    
}
