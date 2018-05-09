/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dto.PisicaDto;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import service.PisicaService;

/**
 *
 * @author student
 */
@WebService
public class PisicaWebService {
    
    @WebMethod
    public void adaugaPisica(@WebParam PisicaDto p) {
        PisicaService.getInstance().adaugaPisica(p);
    }
}
