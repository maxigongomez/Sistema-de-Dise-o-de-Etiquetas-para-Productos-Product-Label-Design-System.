
package CLASES;



public class tipo_ProductoCodigo extends Etiqueta{
    
    
    private String nombreProducto;
    private String codigoProducto;
    
    //Constructor

    public tipo_ProductoCodigo(String nombreProducto , String codigoProducto ,String nombreEtiqueta, String codigoEtiqueta, int nTipoEtiqueta, String tipoEtiqueta, int nEtiqueta) {
        super(nombreEtiqueta, codigoEtiqueta, nTipoEtiqueta, tipoEtiqueta, nEtiqueta);
        
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        
    }
    
    
    //Getters y Setters 

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    
    
}
