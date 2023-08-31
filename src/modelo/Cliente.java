package modelo;

/**
 *
 * @author Marcelo Rafael Borth
 */
public class Cliente {

    private Integer id;
    private String nome;
    private int tipoCliente;
    private String cpfCnpj;
    private String telefone;
    private String email;
    private String observacao;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, Integer tipoCliente, String cpfCnpj, String telefone, String email, String observacao) {
        this.id = id;
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;
        this.email = email;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
