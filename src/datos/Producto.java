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
    private int stockActual;
    private int unidadXCaja;
    private int unidadxSobre;
    private float precioCosto;
    private float precioxUnidad;
    private float precioxSobre;
    private float precioxCaja;
    private float utilidad;

    public Producto(String nombre, String principioActvio, int codigoBarraUnico, String unidadMedida, String lote, String fechaVencimiento, int stockActual, 
    int unidadXCaja, int unidadxSobre, float precioCosto, float precioxUnidad, float precioxSobre, float precioxCaja, float utilidad) {
        this.nombre = nombre;
        this.principioActvio = principioActvio;
        this.codigoBarraUnico = codigoBarraUnico;
        this.unidadMedida = unidadMedida;
        this.lote = lote;
        this.fechaVencimiento = fechaVencimiento;
        this.stockActual = stockActual; //Hay que hacer una Exception que no puede ser un valor negativo EXCEPTION NH
        this.unidadXCaja = unidadXCaja;
        this.unidadxSobre = unidadxSobre;
        this.precioCosto = precioCosto;
        this.precioxUnidad = precioxUnidad; // NO PUEDE SER MENOR A PRECIOCOSTO EXCEPTION NH
        this.precioxSobre = precioxSobre; // NO PUEDE SER MENOR A PRECIOCOSTO EXCEPTION NH
        this.precioxCaja = precioxCaja; // NO PUEDE SER MENOR A PRECIOCOSTO EXCEPTION NH
        this.utilidad = utilidad;
    }

    public Producto(String nombre, String principioActvio, int codigoBarraUnico, String unidadMedida, String lote, String fechaVencimiento, float precioxUnidad, float precioxSobre, float precioxCaja) {
        this.nombre = nombre;
        this.principioActvio = principioActvio;
        this.codigoBarraUnico = codigoBarraUnico;
        this.unidadMedida = unidadMedida;
        this.lote = lote;
        this.fechaVencimiento = fechaVencimiento;
        this.precioxUnidad = precioxUnidad;
        this.precioxSobre = precioxSobre;
        this.precioxCaja = precioxCaja;
        /*En vez de crear otro objeto, mejor un constructor de lo que necesitamos para ventas*/
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", principioActvio=" + principioActvio + ", codigoBarraUnico=" + codigoBarraUnico + ", unidadMedida=" + unidadMedida + ", lote=" + lote + ", fechaVencimiento=" + fechaVencimiento + ", unidadXCaja=" + unidadXCaja + ", unidadxSobre=" + unidadxSobre + ", precioCosto=" + precioCosto + ", precioxUnidad=" + precioxUnidad + ", precioxSobre=" + precioxSobre + ", precioxCaja=" + precioxCaja + ", utilidad=" + utilidad + '}';
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

    /**
     * @return the precioCosto
     */
    public float getPrecioCosto() {
        return precioCosto;
    }

    /**
     * @param precioCosto the precioCosto to set
     */
    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    /**
     * @return the precioxUnidad
     */
    public float getPrecioxUnidad() {
        return precioxUnidad;
    }

    /**
     * @param precioxUnidad the precioxUnidad to set
     */
    public void setPrecioxUnidad(float precioxUnidad) {
        this.precioxUnidad = precioxUnidad;
    }

    /**
     * @return the precioxSobre
     */
    public float getPrecioxSobre() {
        return precioxSobre;
    }

    /**
     * @param precioxSobre the precioxSobre to set
     */
    public void setPrecioxSobre(float precioxSobre) {
        this.precioxSobre = precioxSobre;
    }

    /**
     * @return the precioxCaja
     */
    public float getPrecioxCaja() {
        return precioxCaja;
    }

    /**
     * @param precioxCaja the precioxCaja to set
     */
    public void setPrecioxCaja(float precioxCaja) {
        this.precioxCaja = precioxCaja;
    }

    /**
     * @return the utilidad
     */
    public float getUtilidad() {
        return utilidad;
    }

    /**
     * @param utilidad the utilidad to set
     */
    public void setUtilidad(float utilidad) {
        this.utilidad = utilidad;
    }

    /**
     * @return the stockActual
     */
    public int getStockActual() {
        return stockActual;
    }

    /**
     * @param stockActual the stockActual to set
     */
    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }
}
