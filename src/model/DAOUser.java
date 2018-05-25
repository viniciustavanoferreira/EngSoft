package model;

//Sessão de importação.
import java.sql.*;
import javax.swing.*;

/**
 * Classe que define a visão ~ Acesso.
 * @author Vinicius Tavano Ferreira
 * @since Classe criada em 20/08/2017
 */
public class DAOUser {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs = null;
    private String sql;
    final private String url = "jdbc:derby://localhost:1527/EngSoft Process";
    final private String user = "fatec";
    final private String password = "fatec";    

    //Método que estabelece a conexão com o banco de dados.
    private Connection getConnection() throws SQLException{
        Connection con;
        con = DriverManager.getConnection(this.url, this.user, this.password);
        return con;
    }
    
    public ResultSet getCodUserPassUsuario(String codUser, String codPassword) throws SQLException {
        this.conn = this.getConnection();
        this.stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        this.sql = "SELECT * FROM usuario WHERE ( coduser = '" + codUser + "' AND " 
                                              + " codpassword  = '" + codPassword + "' )";
        this.rs = this.stmt.executeQuery(this.sql);
        
        if (!this.rs.first()) {
            JOptionPane.showMessageDialog(null,"Usuário e/ou senha incorreto(s).");
            this.rs = null;
        }
        
        return this.rs;
    }    
    
    //Método para desconectar o banco de dados.
    private void setDisconnect(Connection con){
    
        try{
            con.close();
            //JOptionPane.showMessageDialog(null,"Banco desconectado");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"O banco não conseguiu se desconectar!"); 
          //JOptionPane.showMessageDialog(null,"O banco não conseguiu desconectar " + erroSQL.getMessage()); 
        }
        
    }   

}
      

