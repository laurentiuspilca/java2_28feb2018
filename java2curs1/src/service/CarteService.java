package service;

import dao.CarteDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import manager.DBManager;
import model.Carte;

/**
 *
 * @author student
 */
public class CarteService {
    public void adaugaCarte(Carte carte) {
        DBManager dbManager = new DBManager();
        Connection con = dbManager.getConnection();
        
        try {
            CarteDao carteDao = new CarteDao(con);
            carteDao.adaugaCarte(carte);

            con.commit();
        } catch(SQLException e) {
            try {
                
                
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CarteService.class.getName()).log(Level.SEVERE, null, ex);
            }
            e.printStackTrace();
        } finally {
            dbManager.closeConnection(con);
        }  
    }
    
    public List<Carte> getCarti() {
        List<Carte> carti = new ArrayList<>();
        
        DBManager dbManager = new DBManager();
        Connection con = dbManager.getConnection();
        
        CarteDao carteDao = new CarteDao(con);
        carti = carteDao.getCarti();

        dbManager.closeConnection(con);

        return carti;
    }
}
