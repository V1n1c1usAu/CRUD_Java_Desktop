package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.ProdutoCategoria;

/**
 *
 * @author Vinicius Augusto
 */
public class ProdutoCategoriaDao {

    /**
     * Insere um objeto no banco.
     *
     * @param u
     * @return
     * @throws Exception
     */
    public int inserir(ProdutoCategoria u) throws Exception {
        int retorno;

        String sql = "insert into produtocategoria (nome)"
                + "values (?)";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getNome());

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
    public List<ProdutoCategoria> buscar(String nome) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from produtocategoria";

        if (!nome.equals("")) {
            sql += " where nome like ?";
        }

        sql += " order by nome";

        List<ProdutoCategoria> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    ProdutoCategoria u = new ProdutoCategoria();
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

    /**
     * Função realiza a busca de um único objeto.
     *
     * @param id
     * @return
     * @throws Exception
     */
    public ProdutoCategoria getProdutoCategoria(int id) throws Exception {
        Connection conexao = Conexao.getConexao();
        String sql = "select * from produtocategoria where id = ?";

        ProdutoCategoria obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new ProdutoCategoria();
                    obj.setId(rs.getInt("id"));
                    obj.setNome(rs.getString("nome"));

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
    public int atualizar(ProdutoCategoria u) throws Exception {
        int retorno;

        String sql = "update produtocategoria"
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

    /**
     * Realiza o DELETE de objeto.
     *
     * @param id
     * @throws Exception
     */
    public void excluir(Integer id) throws Exception {
        int retorno;

        String sql = "DELETE FROM produtocategoria WHERE id    = ?";

        Connection conexao = Conexao.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, id);

            retorno = ps.executeUpdate();
        }

    }
}
