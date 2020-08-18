/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import conexionBD.ConexionMySQL;
import entidades.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author chris
 */
public class FacturaController {
    
    public static void insertarFactura(Factura factura){
        ConexionMySQL conexion = new ConexionMySQL("simulador_sunat");
        Connection conn = conexion.obtenerConexion();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO FACTURA VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, factura.getId_factura());
            ps.setString(2, factura.getRuc_empresa());
            ps.setString(3, factura.getNombre_facturador());
            ps.setString(4, factura.getDireccion_facturaador());
            ps.setString(5, factura.getTelefono_facturador());
            ps.setString(6, factura.getDni_facturador());
            ps.setString(7, factura.getFecha_emision());
            
            if (ps.executeUpdate() == 1) {
                System.out.println(factura.getId_factura()+ ", INSERTADO EXITOSAMENTE");
            }else{
                System.out.println("Error al insertar: " + factura.getId_factura());
            }
            
            ps.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
