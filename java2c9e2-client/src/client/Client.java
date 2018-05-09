/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import ws.ReverseStringService;

/**
 *
 * @author student
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/reverse?wsdl";
        QName qName = new QName("http://ws/", "ReverseStringServiceService");
        Service service = Service.create(new URL(url), qName);
        ReverseStringService reverseStringService = service.getPort(ReverseStringService.class);
        System.out.println(reverseStringService.reverse("HELLO WORLD!"));
    }
    
}
