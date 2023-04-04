/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADORES;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maxi_
 */
public class Login_Controlador implements Initializable {

    private Stage primerStage;
    private Stage segStage;
    @FXML
    private TextField userIngresado;
    @FXML
    private TextField passIngresado;
    @FXML
    private Label passIncorrecta;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setStage(Stage primerStage) {
    
    this.primerStage = primerStage;
    
    }

    @FXML
    private void loguearse(ActionEvent event) throws IOException {
        
        String usuario = userIngresado.getText();
        String passw = passIngresado.getText();
       
        
        if(usuario.equals("adminnegocio1")){
            
            if(passw.equals("passnegocio1")){
        
            // Ir a Menu

            primerStage.close();
                
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Menu_FXML.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage2 = new Stage();

            stage2.setScene(scene);

            CONTROLADORES.Menu_Controlador controller = loader.getController();
            controller.setStage(stage2);
        
            stage2.show();

            //
            
            }

        }else{
            
            passIncorrecta.setVisible(true);
            userIngresado.setText("");
            passIngresado.setText("");
        }
        
    }
    
}
