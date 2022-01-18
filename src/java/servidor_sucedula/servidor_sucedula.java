/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_sucedula;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author SONY
 */
@WebService(serviceName = "servidor_sucedula")
public class servidor_sucedula {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "datos")
    public String datos(@WebParam(name = "cedula") String cedula, @WebParam(name = "fecha_nacimiento") String fecha_nacimiento) {
        //TODO write your implementation code here:
        return null;
    }
}
