/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author student
 */
@WebService
public class ReverseStringService {
    
    @WebMethod
    public String reverse(@WebParam String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
