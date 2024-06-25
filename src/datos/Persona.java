/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Compumovil Tech
 */
public class Persona {
    private String nombre;
    private int cedula;
    private String ciudad;
    private int numTelefono;

    public Persona(String nombre, int cedula, String ciudad, int numTelefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", ciudad=" + ciudad + ", numTelefono=" + numTelefono + '}';
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the numTelefono
     */
    public int getNumTelefono() {
        return numTelefono;
    }
    
}
