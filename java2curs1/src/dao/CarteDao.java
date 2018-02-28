package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Carte;

/**
 *
 * @author student
 */
public class CarteDao {
    private Connection con;
    
    public CarteDao(Connection con) {
        this.con = con;
    }
    
//    public void adaugaCarte(Carte carte) {
//        String sql = "insert into carte values (null, ?, ?)";
//        PreparedStatement stmt  = null;
//        try {
//         stmt = con.prepareStatement(sql);
//            stmt.setString(1, carte.getTitlu());
//            stmt.setString(2, carte.getAutor());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(CarteDao.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                if(stmt != null) {
//                    stmt.close();
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(CarteDao.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    
    public void adaugaCarte(Carte carte) {
        String sql = "insert into carte values (null, ?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, carte.getTitlu());
            stmt.setString(2, carte.getAutor());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarteDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public List<Carte> getCarti() {
        List<Carte> carti = new ArrayList<>();
        String sql = "select * from carte";
        
        try(PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {
            while(rs.next()) {
                Carte carte = new Carte();
                carte.setIdCarte(rs.getInt(1));
                carte.setTitlu(rs.getString(2));
                carte.setAutor(rs.getString(3));
                carti.add(carte);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return carti;
    }
    
    
    
    
    
}
