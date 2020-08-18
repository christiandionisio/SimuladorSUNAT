/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import conexionBD.ConexionMySQL;
import entidades.DetalleFactura;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author chris
 */
public class DetalleFacturaController {
    
    public static void insertarDetalleFactura(DetalleFactura detalle, String id_factura){
        ConexionMySQL conexion = new ConexionMySQL("simulador_sunat");
        Connection conn = conexion.obtenerConexion();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO DETALLE_FACTURA (id_factura, nombre_producto, cantidad, precio, tipo_moneda) VALUES (?,?,?,?,?)");
            ps.setString(1, id_factura);
            ps.setString(2, detalle.getNombre_producto());
            ps.setInt(3, Integer.parseInt(detalle.getCantidad()));
            ps.setFloat(4, Float.parseFloat(detalle.getPrecio()));
            ps.setString(5, detalle.getTipo_moneda());
            
            if (ps.executeUpdate() == 1) {
                System.out.println(detalle.getNombre_producto()+ ", INSERTADO EXITOSAMENTE");
            }else{
                System.out.println("Error al insertar: " + detalle.getNombre_producto());
            }
            
            ps.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
