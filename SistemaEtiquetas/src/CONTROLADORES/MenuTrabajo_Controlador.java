/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADORES;

import static CLASES.Conexion.conexion;
import CLASES.Etiqueta;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// imports de la pagina

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableRow;
/**
 * FXML Controller class
 *
 * @author maxi_
 */
public class MenuTrabajo_Controlador implements Initializable {

    private Stage stage3;
    private int tipoEtiqueta;
    public String etNombre,etCodigo,etTipo,etTamaño,etContenido;
    
    
    @FXML
    private MenuItem elegidoPrecio;
    @FXML
    private MenuItem elegidoCartel;
    @FXML
    private MenuItem elegidoInfoProducto;
    @FXML
    private MenuItem elegidoProductoCodigo;
    @FXML
    private MenuItem elegidoNivelCalidad;
    @FXML
    private TextField tipoElegidoField;
    @FXML
    private TextField nombreEtiquetaIngresado;
    @FXML
    private Label precioLabel;
    @FXML
    private TextField precioIngresadoField;
    @FXML
    private Label textoCartelLabel;
    @FXML
    private TextField textoCartelIngresadoField;
    @FXML
    private Label informacionProductoLabel;
    private TextArea informacionProductoIngresadaField;
    @FXML
    private TextArea informacionProductoIngresadoField;
    @FXML
    private Label nombreProductoLabel;
    @FXML
    private TextField nombreProductoIngresadoField;
    @FXML
    private Label codigoProductoLabel;
    @FXML
    private TextField codigoProductoIngresadoField;
    @FXML
    private Label nivelCalidadLabel;
    @FXML
    private TextField nivelCalidadIngresadoField;
    @FXML
    private TextField widField;
    @FXML
    private TextField heiField;
    @FXML
    private Pane etiquetaPrecio;
    @FXML
    private Label precioEtiquetaPrecioLabel;
    @FXML
    private Pane etiquetaCartel;
    @FXML
    private Label textoEtiquetaCartelLabel;
    @FXML
    private Pane etiquetaInfoProd;
    @FXML
    private Label textoEtiquetaInfoProdLabel;
    @FXML
    private Pane etiquetaCodigoProd;
    @FXML
    private Label textoEtiquetaProdLabel;
    @FXML
    private Label textoCodigoLabel;
    @FXML
    private Pane etiquetaNCalidad;
    @FXML
    private Label textoNCalidad;
    private PreparedStatement pst;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setStage(Stage stage3) {
        
        this.stage3 = stage3;
    }
    
    
    public void setFalseVisibles(){
        
        if(tipoEtiqueta!=0){
        if(tipoEtiqueta==1){
            precioLabel.setVisible(false);
            precioIngresadoField.setVisible(false);
            etiquetaPrecio.setVisible(false);
            precioEtiquetaPrecioLabel.setVisible(false);
        }
        if(tipoEtiqueta==2){
            textoCartelLabel.setVisible(false);
            textoCartelIngresadoField.setVisible(false);
            etiquetaCartel.setVisible(false);
            textoEtiquetaCartelLabel.setVisible(false);
        }
        if(tipoEtiqueta==3){
            informacionProductoLabel.setVisible(false);
            informacionProductoIngresadoField.setVisible(false);
            etiquetaInfoProd.setVisible(false);
            textoEtiquetaInfoProdLabel.setVisible(false);
        }
        if(tipoEtiqueta==4){
            nombreProductoLabel.setVisible(false);
            codigoProductoLabel.setVisible(false);
            nombreProductoIngresadoField.setVisible(false);
            codigoProductoIngresadoField.setVisible(false);
            
            etiquetaCodigoProd.setVisible(false);
            textoEtiquetaProdLabel.setVisible(false);
            textoCodigoLabel.setVisible(false);
            
        }
        if(tipoEtiqueta==5){
            nivelCalidadLabel.setVisible(false);
            nivelCalidadIngresadoField.setVisible(false);
            
            etiquetaNCalidad.setVisible(false);
            textoNCalidad.setVisible(false);
        }
   
        }
    }
    
    public Connection conectar(){
            
            String URL = "jdbc:mysql://localhost:3306/bd_etiquetas?characterEncoding=latin1";
            String Usuario = "root";
            String Contraseña = "root123";
                
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,Usuario,Contraseña);
            System.out.println("Conexion a la Base de Datos establecida.");
                        
        }catch(Exception e){
            
            e.printStackTrace();
        
        }
      return conexion;
    }
    

    @FXML
    private void Crear(ActionEvent event) throws IOException, SQLException {
        
        etNombre = nombreEtiquetaIngresado.getText();
        
        etTamaño = widField.getText()+ (" x ") + heiField.getText();
        
        etTipo = tipoElegidoField.getText();
        
        if(tipoEtiqueta!=0){
        if(tipoEtiqueta==1){
            
            etContenido = precioIngresadoField.getText();
            
        }
        if(tipoEtiqueta==2){
            
            etContenido = textoCartelIngresadoField.getText();
            
        }
        if(tipoEtiqueta==3){
            
           etContenido = informacionProductoIngresadoField.getText();
            
        }
        if(tipoEtiqueta==4){
            
            etContenido = "Nombre:" + nombreProductoIngresadoField.getText() + " , Codigo:" + codigoProductoIngresadoField.getText();
            
        }
        if(tipoEtiqueta==5){
            
            etContenido = nivelCalidadIngresadoField.getText();
            
        }
   
        }
        
        conectar();
        
        pst = conexion.prepareStatement("insert into etiquetascreadas(Nombre,Tipo)values(?,?)");
            pst.setString(1, etNombre);
            pst.setString(2, etTipo);
       
            pst.executeUpdate();
        
        
        // Ir a VER ETIQUETAS CREADAS
                
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/EtiquetasCreadas_FXML.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage4 = new Stage();

        stage4.setScene(scene);

        CONTROLADORES.EtiquetasCreadas_Controlador controller = loader.getController();
        controller.setStage(stage4);
        controller.setValoresIngresados(etNombre, etTamaño, etTipo, etContenido);
        
        stage4.show();
        
        stage3.close();

        //
    }
    
    
    

    @FXML
    private void atrasMenu(ActionEvent event) throws IOException {
        
        //
        
        Stage stage2 = new Stage();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Menu_FXML.fxml"));
        
        Parent root = loader.load();
        Scene primerscene = new Scene(root);
        
        stage2.setScene(primerscene);
        
        CONTROLADORES.Menu_Controlador controller = loader.getController();
        
        controller.setStage(stage2);
        
        stage2.show();
        
        stage3.close();
        
        //
    }

    @FXML
    private void elegidoPrecio(ActionEvent event) {
        
        setFalseVisibles();
        
        tipoEtiqueta = 1;
        
        tipoElegidoField.setText("Precio de Producto");
        precioLabel.setVisible(true);
        precioIngresadoField.setVisible(true);
        etiquetaPrecio.setVisible(true);
        precioEtiquetaPrecioLabel.setVisible(true);
        widField.setText("2,5");
        heiField.setText("1");
            
    }

    @FXML
    private void elegidoCartel(ActionEvent event) {
        
        setFalseVisibles();
        
        tipoEtiqueta = 2;        
        
        tipoElegidoField.setText("Cartel Grande");
        textoCartelLabel.setVisible(true);
        textoCartelIngresadoField.setVisible(true);
        etiquetaCartel.setVisible(true);
        textoEtiquetaCartelLabel.setVisible(true);
        
        widField.setText("10");
        heiField.setText("6,5");
       
    }

    @FXML
    private void elegidoInfoProducto(ActionEvent event) {
        
        setFalseVisibles();
        
        tipoEtiqueta = 3;
        
        tipoElegidoField.setText("Informacion de Producto");
        informacionProductoLabel.setVisible(true);
        informacionProductoIngresadoField.setVisible(true);
        etiquetaInfoProd.setVisible(true);
        textoEtiquetaInfoProdLabel.setVisible(true);
        
        widField.setText("5");
        heiField.setText("5,5");
        
    }

    @FXML
    private void elegidoProductoCodigo(ActionEvent event) {
        
        setFalseVisibles();
        
        tipoEtiqueta = 4;
        
        tipoElegidoField.setText("Codigo de Producto");
        nombreProductoLabel.setVisible(true);
        codigoProductoLabel.setVisible(true);
        nombreProductoIngresadoField.setVisible(true);
        codigoProductoIngresadoField.setVisible(true);
        
        etiquetaCodigoProd.setVisible(true);
        textoEtiquetaProdLabel.setVisible(true);
        textoCodigoLabel.setVisible(true);
        
        widField.setText("5");
        heiField.setText("1,5");
        
        
    }

    @FXML
    private void elegidoNivelCalidad(ActionEvent event) {
        
        setFalseVisibles();
        
        tipoEtiqueta = 5;
        
        tipoElegidoField.setText("Nivel de Calidad Producto");
        nivelCalidadLabel.setVisible(true);
        nivelCalidadIngresadoField.setVisible(true);
        
        etiquetaNCalidad.setVisible(true);
        textoNCalidad.setVisible(true);
        
        
        widField.setText("1");
        heiField.setText("1");
        
    }

    @FXML
    private void actualizarEtiqueta(ActionEvent event) {
        
        
        if(tipoEtiqueta!=0){
        if(tipoEtiqueta==1){
            
            precioEtiquetaPrecioLabel.setText("$ " + precioIngresadoField.getText());
            
        }
        if(tipoEtiqueta==2){
            
            textoEtiquetaCartelLabel.setText(textoCartelIngresadoField.getText());
        }
        if(tipoEtiqueta==3){
            
            textoEtiquetaInfoProdLabel.setText(informacionProductoIngresadoField.getText());
        }
        if(tipoEtiqueta==4){
            
            textoEtiquetaProdLabel.setText(nombreProductoIngresadoField.getText());
            textoCodigoLabel.setText(codigoProductoIngresadoField.getText());
            
        }
        if(tipoEtiqueta==5){
            
            textoNCalidad.setText(nivelCalidadIngresadoField.getText());
            
        }
    
        }
        
    }
    
}
