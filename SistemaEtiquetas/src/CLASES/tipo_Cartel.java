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
public class tipo_Cartel extends Etiqueta{
    
    private String textoCartel;
    
    //Constructor

    public tipo_Cartel(String textoCartel , String nombreEtiqueta, String codigoEtiqueta, int nTipoEtiqueta, String tipoEtiqueta, int nEtiqueta) {
        
        super(nombreEtiqueta, codigoEtiqueta, nTipoEtiqueta, tipoEtiqueta, nEtiqueta);
        
        this.textoCartel = textoCartel;
        
    }
    
    
    //Getter y Setter
    

    public String getTextoCartel() {
        return textoCartel;
    }

    public void setTextoCartel(String textoCartel) {
        this.textoCartel = textoCartel;
    }
    
    
}
