/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.CarteDto;
import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import ws.CarteWebService;

/**
 *
 * @author student
 */
public class ConnectionController {
    
    private CarteWebService carteService;
    
    private ConnectionController() {
        try {
            String url = "http://localhost:8080/carti?wsdl";
            QName qName = new QName("http://ws/", "CarteWebServiceService");
            Service service = Service.create(new URL(url), qName);
            carteService = service.getPort(CarteWebService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ConnectionController SINGLETON = new ConnectionController();
    }
    
    public static ConnectionController getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaCarte(CarteDto carte) {
        carteService.adaugaCarte(carte);
    }
    
    public List<CarteDto> getCarti() {
        return carteService.getCarti();
    }
}
