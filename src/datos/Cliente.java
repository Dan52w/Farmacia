/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Compumovil Tech
 */
public class Cliente extends Persona{
    private float puntos;
    private int idCliente;

    public Cliente(float puntos, int idCliente, String nombre, int cedula, String ciudad, int numTelefono) {
        super(nombre, cedula, ciudad, numTelefono);
        this.puntos = puntos;
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return super.toString() + " Cliente{" + "puntos=" + puntos + ", idCliente=" + idCliente + '}';
    }
    
    /**
     * @return the puntos
     */
    public float getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}
