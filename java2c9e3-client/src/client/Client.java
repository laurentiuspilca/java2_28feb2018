/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import dto.PisicaDto;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import ws.PisicaWebService;

/**
 *
 * @author student
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/pisica?wsdl";
        QName qName = new QName("http://ws/", "PisicaWebServiceService");
        Service service = Service.create(new URL(url), qName);
        PisicaWebService webService = service.getPort(PisicaWebService.class);
        
        PisicaDto p = new PisicaDto();
        p.setNume("Tom");
        p.setVarsta(5);
        webService.adaugaPisica(p);
    }
    
}
