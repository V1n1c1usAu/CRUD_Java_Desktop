package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.UsuarioGrupo;

/**
 *
 * @author aluno
 */
public class UsuarioGrupoDao {

    public int inserir(UsuarioGrupo u) throws Exception {
        int retorno;

        String sql = "insert into usuariogrupo (nome)"
                + "values (?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public List<UsuarioGrupo> buscar(String nome) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from usuariogrupo";

        if (!nome.equals("")) {
            sql += " where nome like ?";
        }

        sql += " order by nome";

        List<UsuarioGrupo> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    UsuarioGrupo u = new UsuarioGrupo();
                    u.setId(rs.getInt("id"));
                    u.setNome(rs.getString("nome"));

                    lista.add(u);
                }

            }

        } catch (Exception e) {
            throw e;
        }

        return lista;
    }

    public UsuarioGrupo getUsuarioGrupo(int id) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from usuariogrupo where id = ?";

        UsuarioGrupo obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new UsuarioGrupo();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));

                }
            }
        } catch (Exception e) {
            throw e;
        }

        return obj;
    }

    public int atualizar(UsuarioGrupo u) throws Exception {
        int retorno;

        String sql = "update usuariogrupo"
                + "      set nome   = ?"
                + "      where   id = ? ";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setInt(2, u.getId());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public void excluir(Integer id) throws Exception {
        int retorno;

        String sql = "DELETE FROM usuariogrupo WHERE id    = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, id);

            retorno = ps.executeUpdate();
        }

    }
}
