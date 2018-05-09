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
import ws.HelloService;

/**
 *
 * @author student
 */
public class Client {

    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/hello?wsdl";
        QName qName = new QName("http://ws/", "HelloServiceService");
        Service service = Service.create(new URL(url), qName);
        HelloService helloService = service.getPort(HelloService.class);
        
        String res = helloService.sayHello("John");
        System.out.println(res);
    }
    
}
