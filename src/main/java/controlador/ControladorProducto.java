/**
 * @author Carlos Andrés Arias Henao | Ciclo 2 Mintic22
 */

package controlador;

import java.util.ArrayList;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import vista.Advertencia_ERROR;
import vista.informeV;
import vista.openActualizar;
import vista.window_IApp;

/**-------------------------------------------- */

public class ControladorProducto {
    ArrayList<Producto> listaProductos;
    @Autowired
    RepositorioProducto rp;
    window_IApp m;
    
    public ControladorProducto(RepositorioProducto rp, window_IApp m){
        this.rp = rp;
        this.m = m;
    }

    
    public void setListaProductos(ArrayList<Producto> listaProductos){
        this.listaProductos = listaProductos;
    }
    
    public Producto agregar(Producto p){
        return rp.save(p);
    }
    
    public Producto actualizar(Producto p){
        return rp.save(p);
    }
      
    public boolean eliminar(Integer id){
        try{
            rp.deleteById(id);
            return true;
        }
        catch(Exception ex) {
            return false;
        }
    }
    public ArrayList<Producto> obtenerProductos(){
        return (ArrayList<Producto>) rp.findAll();
    }
    
    public Optional<Producto> obtenerProducto (Integer id){
        return rp.findById(id);
    }
    
    public double valor_inventarioTotal(){
        double suma =0;
        for (Producto p: listaProductos){
            suma+=p.getPrecio()*p.getInventario();
            }
        return suma;
    }
        
    public String precioMenor(){
        String nombre = listaProductos.get(0).getNombre();
        double precio = listaProductos.get(0).getPrecio();
        for(Producto p: listaProductos){
            if(p.getPrecio() < precio){
            nombre = p.getNombre();
            precio = p.getPrecio();
            }
        }
        return nombre;
    }

       public String precioMayor(){
        String nombre = listaProductos.get(0).getNombre();
        double precio = listaProductos.get(0).getPrecio();
        for(Producto p: listaProductos){
            if(p.getPrecio() > precio){
            nombre = p.getNombre();
            precio = p.getPrecio();
            }
        }
        return nombre;
    
    }
        public double promedio(){
           double suma =0;
           for(Producto p: listaProductos){
               suma+=p .getPrecio();
           }
           return suma/listaProductos.size();

            
    }
        
    public void eventoAgregar() {
        String nombre = m.getInput_name();
        String precio = m.getInput_precio();
        String inventario = m.getInput_inventario();
        if(!m.getInput_name().equals("") && !m.getInput_precio().equals("") && !m.getInput_inventario().equals("")){
             Producto nuevo = new Producto(nombre, Double.parseDouble(precio), Integer.parseInt(inventario));
             listaProductos.add(nuevo);
             //agregar(nuevo);
             DefaultTableModel modelo = (DefaultTableModel) m.getInventario().getModel();
             modelo.insertRow(listaProductos.size()-1, new Object[]{nuevo.getNombre(), nuevo.getPrecio(), nuevo.getInventario()});
             
        }else {
                Advertencia_ERROR me = new Advertencia_ERROR();
                me.setVisible(true);
        }
        
    }    
    
    
    public void eventoEliminar() {
        int filaEliminar = m.getInventario().getSelectedRow();
        listaProductos.remove(filaEliminar);
        DefaultTableModel modelo = (DefaultTableModel) m.getInventario().getModel();
        //eliminar(listaProductos.get(filaEliminar).getCodigo());
        modelo.removeRow(filaEliminar);
 }

    public void openWindowAct() {
        openActualizar a = new openActualizar();
        a.setControlador(this);
        a.setVisible(true);
    
    }
    
    
       /**public void eventoActualizar() {
        int filaActualizar = m.getInventario().getSelectedRow();
        String nombre = m.getInput_name();
        String precio = m.getInput_precio();
        String inventario = m.getInput_inventario();
        if(!nombre.equals("") && !precio.equals("") && !inventario.equals("")){
        
        }
    }*/
    
 
    
    public void eventoActualizar(openActualizar v) {
        //int filaActualizar = m.getInventario().getSelectedRow();
        String nombre = v.getInput_nombre_winact();
        String precio = v.getInput_precio_winact();
        String inventario = v.getInput_inventario_winact();
        if(!nombre.equals("") && !precio.equals("") && !inventario.equals("")){
            int filaActualizar = m.getInventario().getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) m.getInventario().getModel();
            listaProductos.get (filaActualizar).setInventario(Integer.parseInt(inventario));
            listaProductos.get (filaActualizar).setNombre(nombre);
            listaProductos.get (filaActualizar).setPrecio(Double.parseDouble(precio));
            actualizar(listaProductos.get(filaActualizar));
            modelo.setValueAt(nombre, filaActualizar, 0);
            modelo.setValueAt(Double.parseDouble(precio), filaActualizar, 1);
            modelo.setValueAt(Integer.parseInt(inventario), filaActualizar, 2);
            
        }else {
                Advertencia_ERROR me = new Advertencia_ERROR();
                me.setVisible(true);
        }
    }
    
    
    public void eventoInforme(){
        //String mostrar = "Producto precio mayor: "+precioMayor()+ "Producto precio menor: "+precioMenor()+ "Promedio de precios: "+promedio()+ "Valor de Inventario: "+valor_inventarioTotal();
        informeV i = new informeV ();
        i.setVisible(true);
        i.setLabelInventario(i.getLabelInventario()+valor_inventarioTotal());
        i.setLabelMayor(i.getLabelMayor()+precioMayor());
        i.setLabelMenor(i.getLabelMenor()+precioMenor());
        i.setLabelPromedio(i.getLabelPromedio()+String.format("%.1f", promedio()) );
        
        
        
    }
       
    
    
    public void inicializaTabla(){
        DefaultTableModel modelo = (DefaultTableModel) m.getInventario().getModel();
        int ind = 0;
        for(Producto p: listaProductos){
            modelo.insertRow(ind, new Object[]{p.getNombre(), p.getPrecio(), p.getInventario()});
            ind+=1;
        }
    }
    
    
    
}
