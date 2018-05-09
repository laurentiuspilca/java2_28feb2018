/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dto.CarteDto;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author student
 */
@WebService
public interface CarteWebService {
    
    @WebMethod
    public void adaugaCarte(@WebParam CarteDto carte);
    
    @WebMethod
    public List<CarteDto> getCarti();
}
