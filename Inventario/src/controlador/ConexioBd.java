
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Norayio
 */

public class ConexioBd {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "norayio";
    String bd = "productos";
    String ip = "localhost:";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+puerto+"/"+bd;
    
    public Connection estableceConexion( ){
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection( cadena, usuario, contrasenia );
            JOptionPane.showMessageDialog(null, "Se conecto a la  base de datos correctamente" );
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se conecto a la  base de datos "+e.toString( ) );
        }
        return conectar;
    }
        
    
    
}
