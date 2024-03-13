package modelo;

import controlador.ConexioBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Norayio
 */

public class ProductoDAO {

    ConexioBd conexion = new ConexioBd(); // instancia de conexioBd
    Connection con;
    
    PreparedStatement ps;
    ResultSet rs;

    
    public List listar( ) {
    
        String sql= "SELECT * FROM productos;";
        List<Producto> lista = new ArrayList<>();
        
        try {
            
            con = conexion.estableceConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next( ) ) {                
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt(1) );
                producto.setNombre(rs.getString(2) );
                producto.setPrecio(rs.getDouble(3) );
                producto.setInventario(rs.getInt(4) );
                
                lista.add(producto);
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR al listar: "+e);
        }
        
        return lista;
    
    } // fin métdodo listar
    
}