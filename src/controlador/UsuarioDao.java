package controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Vinicius Augusto
 */
public class UsuarioDao {

    /**
     * Insere um objeto no banco.
     *
     * @param u
     * @return
     * @throws Exception
     */
    public int inserir(Usuario u) throws Exception {
        int retorno;

        String sql = "insert into usuario (nome, email, senha)"
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

    /**
     * Recebe um nome e retorna uma lista.
     *
     * @param nome
     * @return
     * @throws Exception
     */
    public List<Usuario> buscar(String nome) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from usuario";

        if (!nome.equals("")) {
            sql += " where nome like ?";
        }

        sql += " order by nome";

        List<Usuario> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    Usuario u = new Usuario();
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

    /**
     * Função realiza a busca de um único objeto.
     *
     * @param id
     * @return
     * @throws Exception
     */
    public Usuario getUsuario(int id) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from usuario where id = ?";

        Usuario obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new Usuario();
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

    /**
     * Realiza UPDATE de objeto.
     *
     * @param u
     * @return
     * @throws Exception
     */
    public int atualizar(Usuario u) throws Exception {
        int retorno;

        String sql = "update usuario"
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

    /**
     * Realiza o DELETE de objeto.
     *
     * @param id
     * @throws Exception
     */
    public void excluir(Integer id) throws Exception {
        int retorno;

        String sql = "DELETE FROM usuario WHERE id    = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, id);

            retorno = ps.executeUpdate();
        }

    }

}
