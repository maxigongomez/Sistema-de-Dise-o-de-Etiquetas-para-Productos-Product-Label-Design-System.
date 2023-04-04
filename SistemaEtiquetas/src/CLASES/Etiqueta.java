/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author maxi_
 */
public class Etiqueta {
    
    private String nombreEtiqueta;
    private String codigoEtiqueta;
    
    private int nTipoEtiqueta;
    private String tipoEtiqueta;
    
    private int nEtiqueta;
    
    
    //Constructor
    

    public Etiqueta(String nombreEtiqueta, String codigoEtiqueta, int nTipoEtiqueta, String tipoEtiqueta, int nEtiqueta) {
        this.nombreEtiqueta = nombreEtiqueta;
        this.codigoEtiqueta = codigoEtiqueta;
        this.nTipoEtiqueta = nTipoEtiqueta;
        this.tipoEtiqueta = tipoEtiqueta;
        this.nEtiqueta = nEtiqueta;
    }
    
    
    //Getters y Setters
    

    public String getNombreEtiqueta() {
        return nombreEtiqueta;
    }

    public void setNombreEtiqueta(String nombreEtiqueta) {
        this.nombreEtiqueta = nombreEtiqueta;
    }

    public String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }

    public void setCodigoEtiqueta(String codigoEtiqueta) {
        this.codigoEtiqueta = codigoEtiqueta;
    }

    public int getnTipoEtiqueta() {
        return nTipoEtiqueta;
    }

    public void setnTipoEtiqueta(int nTipoEtiqueta) {
        this.nTipoEtiqueta = nTipoEtiqueta;
    }

    public String getTipoEtiqueta() {
        return tipoEtiqueta;
    }

    public void setTipoEtiqueta(String tipoEtiqueta) {
        this.tipoEtiqueta = tipoEtiqueta;
    }

    public int getnEtiqueta() {
        return nEtiqueta;
    }

    public void setnEtiqueta(int nEtiqueta) {
        this.nEtiqueta = nEtiqueta;
    }
    
}
