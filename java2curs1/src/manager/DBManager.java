package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class DBManager {
    private String url;
    private String user;
    private String password;
    
    public DBManager(){
        this.url = "jdbc:mysql://localhost/mydb";
        this.user = "root";
        this.password = "";
    }
    
    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;            
    }
    
    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
