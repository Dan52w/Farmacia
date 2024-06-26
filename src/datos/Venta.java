/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Compumovil Tech
 */
public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private ArrayList<Float> cantidad;
    private float total;
    private Date fecha;

    public Venta(Cliente cliente, float total, Date fecha) {
        this.cliente = cliente;
        this.total = total;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
        this.cantidad = new ArrayList<>();
    }
    
    public float venta(Producto x, float cantidad){
        return x.getPrecioxUnidad()*cantidad; 
        /*Esto solo va a retornar la cantidad total de un producto,
        La idea que tengo es utilizar Auxiliares en la funcion donde crearemos las ventas.
        Se aceptan sgg sobre esto*/
    }
    
    public void addProducto(Producto x){
        productos.add(x);
    }
    
    public void addCantidad(float x){
        cantidad.add(x);
    }
    
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    /**
     * @return the cantidades
     */
    public ArrayList<Float> getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidades the cantidades to set
     */
    public void setCantidad(ArrayList<Float> cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
