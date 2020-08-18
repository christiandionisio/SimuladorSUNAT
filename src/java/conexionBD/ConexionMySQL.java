/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chris
 */
public class ConexionMySQL {
    
    private String dbname;
    private String user;
    private String password = "";
    private String url = "jdbc:mysql://localhost/" + dbname;

    public ConexionMySQL() {
        this.dbname = "simulador_sunat";
        this.user = "root";
        this.url = "jdbc:mysql://localhost/" + this.dbname;
    }

    public ConexionMySQL(String dbname) {
        this.dbname = dbname;
        this.user = "root";
        this.url = "jdbc:mysql://localhost/" + this.dbname;
    }
    
    

    public Connection obtenerConexion() {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Conexión satisfactoria con la BD");
            
            return con; 
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
    
}
