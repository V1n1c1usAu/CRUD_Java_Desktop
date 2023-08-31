package controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Marcelo Rafael Borth
 */
public class ClienteDao {

    public int inserir(Cliente u) throws Exception {
        int retorno;

        String sql = "insert into cliente (nome, tipocliente, cpfcnpj, telefone, email, observacao)"
                + "values (?, ?, ?, ?, ?, ?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setInt(2, u.getTipoCliente());
            ps.setString(3, u.getCpfCnpj());
            ps.setString(4, u.getTelefone());
            ps.setString(5, u.getEmail());
            ps.setString(6, u.getObservacao());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public List<Cliente> buscar(String nome) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from cliente";

        if (!nome.equals("")) {
            sql += " where nome like ?";
        }

        sql += " order by nome";

        List<Cliente> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    Cliente u = new Cliente();
                    u.setId(rs.getInt("id"));
                    u.setNome(rs.getString("nome"));
                    u.setTipoCliente(rs.getInt("tipocliente"));
                    u.setCpfCnpj(rs.getString("cpfcnpj"));
                    u.setTelefone(rs.getString("telefone"));
                    u.setEmail(rs.getString("email"));
                    u.setObservacao(rs.getString("observacao"));

                    lista.add(u);
                }

            }

        } catch (Exception e) {
            throw e;
        }

        return lista;
    }

    public Cliente getCliente(int id) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from cliente where id = ?";

        Cliente obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new Cliente();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));
                    obj.setTipoCliente(rs.getInt("tipocliente"));
                    obj.setCpfCnpj(rs.getString("cpfcnpj"));
                    obj.setTelefone(rs.getString("telefone"));
                    obj.setEmail(rs.getString("email"));
                    obj.setObservacao(rs.getString("observacao"));
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return obj;
    }

    public int atualizar(Cliente u) throws Exception {
        int retorno;

        String sql = "update cliente"
                + "      set nome   = ?,"
                + "          tipocliente  = ?,"
                + "          cpfcnpj  = ?,"
                + "          telefone  = ?,"
                + "          email  = ?,"
                + "          observacao = ? "
                + "      where   id = ? ";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setInt(2, u.getTipoCliente());
            ps.setString(3, u.getCpfCnpj());
            ps.setString(4, u.getTelefone());
            ps.setString(5, u.getEmail());
            ps.setString(6, u.getObservacao());
            ps.setInt(7, u.getId());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public void excluir(Integer id) throws Exception {
        int retorno;

        String sql = "DELETE FROM cliente WHERE id    = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, id);

            retorno = ps.executeUpdate();
        }

    }

}
