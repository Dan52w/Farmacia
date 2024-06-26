/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Compumovil Tech
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }
    
    public void addProducto(Producto x){
        productos.add(x);
    }
    
    public void venta(Producto x, int cantidad){ //Aqui en vez de pasarle un Producto, tambien se podria pasar el codigo
        Producto aux = buscarCodigoBarra(x.getCodigoBarraUnico());
        if(aux != null){
            if(aux.getStockActual() >= cantidad){
                //Si cantidad es menor al Stock no puede proceder la venta ya que la No puede haber numeros negativos en el stock EXCEPTION NH
                int resta = aux.getStockActual() - cantidad;
                aux.setStockActual(resta); //Cada que se haga una compra se debe actualizar el StockActual del producto
            }
        }
    }
    
    public Producto buscarCodigoBarra(int codigoBarra){ //Buscamos por medio del codigo de barra ya que es "unico por producto"
        for (Producto producto : productos) {
            if(producto.getCodigoBarraUnico() == codigoBarra){
                return producto;
            }
        }
        return null; //En caso de no ser encontrado Se debe hacer una EXCEPTION NH
    }
    
    /**
     * @return the productos
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
