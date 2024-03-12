package modelo;

/**
 *
 * @author Norayio
 */

public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int inventario;

    public Producto() { // constructor vacío
    }

    public Producto(String nombre, double precio, int inventario) { // constructor con parámetros sin código;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }
    
    
    
    
}
