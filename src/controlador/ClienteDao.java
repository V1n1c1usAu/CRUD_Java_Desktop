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

        String sql = "insert into cliente (nome, email, senha)"
                + "values (?, ?, ?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());

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
                    u.setEmail(rs.getString("email"));
                    u.setStatus(rs.getInt("Status"));

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
                    obj.setEmail(rs.getString("email"));
                    obj.setStatus(rs.getInt("status"));
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
                + "          email  = ?,"
                + "          status = ? "
                + "      where   id = ? ";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.setInt(3, u.getStatus());
            ps.setInt(4, u.getId());

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
