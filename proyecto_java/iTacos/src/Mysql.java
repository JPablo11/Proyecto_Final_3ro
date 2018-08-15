
import java.sql.*;

public class Mysql {
    private String db = "itacos";
    private String url = "jdbc:mysql://localhost/" + db;
    private String user = "root";
    private String pass = "";
    Connection con = null;
    
    public Mysql(){
        try{
            con = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println(e);         
        }
    }
    public Connection getConnection(){
        return con;
    }
    public void desconectar(){
        con = null;
    }
}
