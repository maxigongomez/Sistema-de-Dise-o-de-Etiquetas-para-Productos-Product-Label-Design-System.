package CLASES;



public class tipo_Precio extends Etiqueta{
    
    private String precioProducto;
    
    //Constructor

    public tipo_Precio(String precioProducto ,String nombreEtiqueta, String codigoEtiqueta, int nTipoEtiqueta, String tipoEtiqueta, int nEtiqueta) {
        
        super(nombreEtiqueta, codigoEtiqueta, nTipoEtiqueta, tipoEtiqueta, nEtiqueta);
        
        this.precioProducto = precioProducto;
        
    }

    
    //Getter y Setter
    
    
    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
}
