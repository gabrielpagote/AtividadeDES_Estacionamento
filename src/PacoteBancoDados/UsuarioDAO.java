package PacoteBancoDados;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    Connection con;

    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public boolean autenticaUsuario(UsuarioBean usuario) {

        boolean autenticado = false;

        String sql = "select nomeUsu, senhaUsu from tbusuario where nomeUsu=? and senhaUsu=?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, usuario.getNomeUsu());
            ps.setString(2, usuario.getSenhaUsu());

            ResultSet rs;

            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
        }

        return true;
    }

    public String cadastrarUsuario(UsuarioBean usuario) {

        String sql = "insert into tbusuario(nomeUsu, senhaUsu) values (?, ?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, usuario.getNomeUsu());
            ps.setString(2, usuario.getSenhaUsu());

            if (ps.executeUpdate() > 0) {
                return "Usuário cadastrado com sucesso!";
            } else {
                return "Erro ao cadastrar usuário";
            }

        } catch (SQLException ex) {
            return ex.getMessage();

        }
    }

    public  List<UsuarioBean> listaUsuario() {
        String sql = "select nomeUse, senhaUsu from tbusuario";

        List<UsuarioBean> listarUsu = new ArrayList<>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    UsuarioBean ub = new UsuarioBean();

                    ub.setNomeUsu(rs.getString(1));
                    ub.setSenhaUsu(rs.getString(2));

                    listarUsu.add(ub);

                }
                return listarUsu;

            } else {
                return null;
            }

        } catch (SQLException ex) {
        }

        return null;
    }
}
