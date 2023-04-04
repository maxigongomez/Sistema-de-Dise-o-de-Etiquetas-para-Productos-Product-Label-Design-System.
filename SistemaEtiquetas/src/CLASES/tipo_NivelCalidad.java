
package CLASES;


public class tipo_NivelCalidad extends Etiqueta{
    
    
    private String nivelCalidad;
    
    //Constructor

    public tipo_NivelCalidad(String nivelCalidad , String nombreEtiqueta, String codigoEtiqueta, int nTipoEtiqueta, String tipoEtiqueta, int nEtiqueta) {
        
        super(nombreEtiqueta, codigoEtiqueta, nTipoEtiqueta, tipoEtiqueta, nEtiqueta);
        
        this.nivelCalidad = nivelCalidad;
        
    }
    
    
    //Getter y Setter
    

    public String getNivelCalidad() {
        return nivelCalidad;
    }

    public void setNivelCalidad(String nivelCalidad) {
        this.nivelCalidad = nivelCalidad;
    }
    
    
}
