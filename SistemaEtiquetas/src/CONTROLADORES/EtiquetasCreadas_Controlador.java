/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADORES;

import static CLASES.Conexion.conexion;
import CLASES.Etiqueta;
import CLASES.tipo_Precio;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


//imports de la pagina:


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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

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
import static jdk.nashorn.internal.runtime.Debug.id;



/**
 * FXML Controller class
 *
 * @author maxi_
 */
public class EtiquetasCreadas_Controlador implements Initializable {

    private Stage stage4;
   
    @FXML
    private TableColumn<tipo_Precio, String> nombreColumna;
    @FXML
    private TableColumn<tipo_Precio, String> tipoColumna;
    @FXML
    private TableColumn<tipo_Precio, String> precioColumna;
   
    @FXML
    public TableView<tipo_Precio> tabla;
    private String etNombre;
    private String etTamaño;
    private String etTipo;
    private String etContenido;
    @FXML
    private Pane paneFondo1;
    @FXML
    private Pane paneFondo2;
    @FXML
    private Pane paneFondo3;
    @FXML
    private Button botonAceptar;
    @FXML
    private Label labelFondo;
    private PreparedStatement pst;
    
    private String nombre;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setStage(Stage stage4) {
        
        this.stage4 = stage4;
    
    }
    
    public void setValoresIngresados(String etNombre, String etTamaño , String etTipo, String etContenido){
    
        this.etNombre = etNombre;
        this.etTamaño = etTamaño;
        this.etTipo = etTipo;
        this.etContenido = etContenido;
    
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
        
        stage4.close();
        
        //
        
    }

    @FXML
    private void irMenuTrabajo(ActionEvent event) throws IOException {
        
        // Ir a Menu Trabajos
        
        stage4.close();
                
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/MenuTrabajo_FXML.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage3 = new Stage();

        stage3.setScene(scene);

        CONTROLADORES.MenuTrabajo_Controlador controller = loader.getController();
        controller.setStage(stage3);
        
        stage3.show();

        //
    }   
    
    
    //importado del anterior
    
        

    @FXML
    private void Aceptar(ActionEvent event) {
        
        paneFondo1.setVisible(false);
        paneFondo2.setVisible(false);
        paneFondo3.setVisible(false);
        labelFondo.setVisible(false);
        botonAceptar.setVisible(false);
        
        conectar();
        
        table(); //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
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
    
                
    public void table()
      {
          conectar();
          ObservableList<tipo_Precio> etiquetasCreadas = FXCollections.observableArrayList();
       try 
       {
           pst = conexion.prepareStatement("select Nombre,Tipo from etiquetascreadas");  
           ResultSet rs = pst.executeQuery();
          
      {
        while (rs.next())
        {
            tipo_Precio st = new tipo_Precio("","hola","hola",0,"hola",0);
            st.setNombreEtiqueta(rs.getString("Nombre"));
            st.setTipoEtiqueta(rs.getString("Tipo"));
           
            
            etiquetasCreadas.add(st);
            
       }
    }
      
      tabla.setItems(etiquetasCreadas);
      nombreColumna.setCellValueFactory(new PropertyValueFactory<tipo_Precio,String>("nombreEtiqueta"));
      tipoColumna.setCellValueFactory(new PropertyValueFactory<tipo_Precio,String>("tipoEtiqueta"));
      precioColumna.setCellValueFactory(new PropertyValueFactory<tipo_Precio,String>("precioProducto"));

       }
       
       catch (SQLException ex) 
       {
           //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
       }

                tabla.setRowFactory( tv -> {
		     TableRow<tipo_Precio> myRow = new TableRow<>();
		     myRow.setOnMouseClicked (event -> 
		     {
		        if (event.getClickCount() == 1 && (!myRow.isEmpty()))
		        {
                            int myIndex = tabla.getSelectionModel().getSelectedIndex();
		 
                            //Integer id = Integer.parseInt(String.valueOf(tabla.getItems().get(myIndex).getId()));
		           //txtName.setText(tabla.getItems().get(myIndex).getNombre());
		           //txtMobile.setText(tabla.getItems().get(myIndex).getTipoEtiqueta());
                            //txtCourse.setText(tabla.getItems().get(myIndex).getCourse());
                           
                         
                           
		        }
		     });
		        return myRow;
                   });
    
    
      }

    @FXML
    private void Eliminar(ActionEvent event) {
        
        
        int myIndex = tabla.getSelectionModel().getSelectedIndex();
		 
        nombre = String.valueOf(tabla.getItems().get(myIndex).getNombreEtiqueta());
        
        conectar();
                     

        try 
        {
            pst = conexion.prepareStatement("delete from etiquetascreadas where Nombre = ? ");
            pst.setString(1, nombre);
            pst.executeUpdate();
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Base de Etiquetas Creadas");

		
		alert.setHeaderText("Eliminar Etiqueta");
		alert.setContentText("La etiqueta ha sido borrada exitosamente!");

		alert.showAndWait();
                  table();
        } 
        catch (SQLException ex)
        {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    }
        
        
    

