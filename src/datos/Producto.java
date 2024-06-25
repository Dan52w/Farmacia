/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Compumovil Tech
 */
public class Producto {
    private String nombre;
    private String principioActvio;
    private int codigoBarraUnico;
    private String unidadMedida;
    private String lote;
    private String fechaVencimiento;
    private int unidadXCaja;
    private int unidadxSobre;

    public Producto(String nombre, String principioActvio, int codigoBarraUnico, String unidadMedida, String lote, String fechaVencimiento, int unidadXCaja, int unidadxSobre) {
        this.nombre = nombre;
        this.principioActvio = principioActvio;
        this.codigoBarraUnico = codigoBarraUnico;
        this.unidadMedida = unidadMedida;
        this.lote = lote;
        this.fechaVencimiento = fechaVencimiento;
        this.unidadXCaja = unidadXCaja;
        this.unidadxSobre = unidadxSobre;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", principioActvio=" + principioActvio + ", codigoBarraUnico=" + codigoBarraUnico + ", unidadMedida=" + unidadMedida + ", lote=" + lote + ", fechaVencimiento=" + fechaVencimiento + ", unidadXCaja=" + unidadXCaja + ", unidadxSobre=" + unidadxSobre + '}';
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
     * @return the principioActvio
     */
    public String getPrincipioActvio() {
        return principioActvio;
    }

    /**
     * @param principioActvio the principioActvio to set
     */
    public void setPrincipioActvio(String principioActvio) {
        this.principioActvio = principioActvio;
    }

    /**
     * @return the codigoBarraUnico
     */
    public int getCodigoBarraUnico() {
        return codigoBarraUnico;
    }

    /**
     * @param codigoBarraUnico the codigoBarraUnico to set
     */
    public void setCodigoBarraUnico(int codigoBarraUnico) {
        this.codigoBarraUnico = codigoBarraUnico;
    }

    /**
     * @return the unidadMedida
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * @param unidadMedida the unidadMedida to set
     */
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    /**
     * @return the lote
     */
    public String getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(String lote) {
        this.lote = lote;
    }

    /**
     * @return the fechaVencimiento
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the unidadXCaja
     */
    public int getUnidadXCaja() {
        return unidadXCaja;
    }

    /**
     * @param unidadXCaja the unidadXCaja to set
     */
    public void setUnidadXCaja(int unidadXCaja) {
        this.unidadXCaja = unidadXCaja;
    }

    /**
     * @return the unidadxSobre
     */
    public int getUnidadxSobre() {
        return unidadxSobre;
    }

    /**
     * @param unidadxSobre the unidadxSobre to set
     */
    public void setUnidadxSobre(int unidadxSobre) {
        this.unidadxSobre = unidadxSobre;
    }
}
