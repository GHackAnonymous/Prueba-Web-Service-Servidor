/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author futpilari
 */
@WebService(serviceName = "RecibirMensaje")
public class RecibirMensaje {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        System.out.println("Hello " + txt + " !");
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        System.out.println("Hello " + name + " !");
        return "Hello " + name + " !";
    }
}
