/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import controladores.DetalleFacturaController;
import controladores.FacturaController;
import entidades.DetalleFactura;
import entidades.Factura;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chris
 */
@WebService(serviceName = "FacturaService")
public class FacturaService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "enviarFactura")
    public String enviar_factura(@WebParam(name = "Factura") Factura factura, 
            @WebParam(name = "DetalleFactura") ArrayList<DetalleFactura> detalle) {
        
        FacturaController.insertarFactura(factura); //Insertar Factura
        float suma = 0;
        for (DetalleFactura det: detalle) {
            suma += Float.parseFloat(det.getCantidad())*Float.parseFloat(det.getPrecio());
            DetalleFacturaController.insertarDetalleFactura(det, factura.getId_factura());
        }
        return "Factura: " + factura.getId_factura() + " recibida. " + "Monto total: " + suma;
    }
}



