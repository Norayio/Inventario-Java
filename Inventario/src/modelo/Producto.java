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
    
    // constructor para actualizar
    public Producto(int codigo, String nombre, double precio, int inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    // getters & setters
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
    
    
    
    
}
