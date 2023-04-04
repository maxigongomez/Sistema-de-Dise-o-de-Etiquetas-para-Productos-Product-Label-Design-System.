
package CLASES;


public class tipo_InformacionProducto extends Etiqueta{
    
    
    private String informacionProducto;
    
    //Constructor

    public tipo_InformacionProducto(String informacionEtiqueta, String nombreEtiqueta, String codigoEtiqueta, int nTipoEtiqueta, String tipoEtiqueta, int nEtiqueta) {
        super(nombreEtiqueta, codigoEtiqueta, nTipoEtiqueta, tipoEtiqueta, nEtiqueta);
        
        this.informacionProducto = informacionProducto;
        
    }
    
    
    //Getter y Setter

    public String getInformacionProducto() {
        return informacionProducto;
    }

    public void setInformacionProducto(String informacionProducto) {
        this.informacionProducto = informacionProducto;
    }
    
    
}
