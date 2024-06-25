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
    
    public void addProducto(Producto x){
        productos.add(x);
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
