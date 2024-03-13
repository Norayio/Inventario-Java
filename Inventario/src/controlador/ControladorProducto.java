package controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;
import vista.Interfaz;

/**
 *
 * @author Norayio
 */
public class ControladorProducto implements ActionListener {

    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();
    Interfaz vista = new Interfaz();
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public ControladorProducto(Interfaz vista) {
        this.vista = vista;
        vista.setVisible(true);
        
        agregarEventos();
        listarTabla();
        
    }

    private void agregarEventos() {
        vista.getBtnAgregar().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnBorrar().addActionListener(this);
        vista.getBtnLimpiar().addActionListener(this);

        vista.getTblTabla().addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    llenarCampos(e);
                }
        });
    }
    
    private void listarTabla() {
        String[] titulos = new String[] {"Codigo", "Nombre", "Precio", "Inventario"};
        
        modeloTabla = new DefaultTableModel(titulos, 0);
        
        List<Producto> listaProductos = productoDAO.listar();
        
        for (Producto i : listaProductos){
            modeloTabla.addRow(new Object[]{producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getInventario() } );
        }
        vista.getTblTabla().setModel(modeloTabla);
        vista.getTblTabla().setPreferredSize(new Dimension(350, modeloTabla.getRowCount()*16 ) );
    }
    
    
    private void llenarCampos(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        vista.getTxtNombre().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 1).toString() );
        vista.getTxtPrecio().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 2).toString() );
        vista.getTxtInventario().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 3).toString() );
    }
    
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
