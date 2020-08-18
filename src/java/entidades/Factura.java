/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author chris
 */
public class Factura {
    
    private String id_factura;
    private String ruc_empresa;
    private String nombre_facturador;
    private String direccion_facturaador;
    private String telefono_facturador;
    private String dni_facturador;
    private String fecha_emision;

    public Factura() {
    }

    public String getId_factura() {
        return id_factura;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public String getRuc_empresa() {
        return ruc_empresa;
    }

    public void setRuc_empresa(String ruc_empresa) {
        this.ruc_empresa = ruc_empresa;
    }

    public String getNombre_facturador() {
        return nombre_facturador;
    }

    public void setNombre_facturador(String nombre_facturador) {
        this.nombre_facturador = nombre_facturador;
    }

    public String getDireccion_facturaador() {
        return direccion_facturaador;
    }

    public void setDireccion_facturaador(String direccion_facturaador) {
        this.direccion_facturaador = direccion_facturaador;
    }

    public String getTelefono_facturador() {
        return telefono_facturador;
    }

    public void setTelefono_facturador(String telefono_facturador) {
        this.telefono_facturador = telefono_facturador;
    }

    public String getDni_facturador() {
        return dni_facturador;
    }

    public void setDni_facturador(String dni_facturador) {
        this.dni_facturador = dni_facturador;
    }
    
    
    
}
