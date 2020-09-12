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
    private String password = "lh823zjHJuswsjURzdxA";
    private String url = "jdbc:mysql://bs6kozyeoercv8ybunfk-mysql.services.clever-cloud.com/" + dbname;

    public ConexionMySQL() {
        this.dbname = "bs6kozyeoercv8ybunfk";
        this.user = "uc8cu1tso4vs0mmj";
        this.url = "jdbc:mysql://bs6kozyeoercv8ybunfk-mysql.services.clever-cloud.com/" + this.dbname;
    }

    public ConexionMySQL(String dbname) {
        this.dbname = dbname;
        this.user = "uc8cu1tso4vs0mmj";
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
