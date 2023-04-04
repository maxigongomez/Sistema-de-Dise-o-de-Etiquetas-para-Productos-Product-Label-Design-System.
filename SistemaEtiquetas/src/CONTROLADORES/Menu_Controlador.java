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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maxi_
 */
public class Menu_Controlador implements Initializable {

    private Stage stage2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setStage(Stage stage2) {
    
    this.stage2 = stage2 ;
    
    
    }

    @FXML
    private void irMenuTrabajo(ActionEvent event) throws IOException {
        
        // Ir a Menu Trabajos
        
        stage2.close();
                
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

    @FXML
    private void irVerEtiquetasCreadas(ActionEvent event) throws IOException {
        
        // Ir a VER ETIQUETAS CREADAS
        
        stage2.close();
                
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/EtiquetasCreadas_FXML.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage4 = new Stage();

        stage4.setScene(scene);

        CONTROLADORES.EtiquetasCreadas_Controlador controller = loader.getController();
        controller.setStage(stage4);
        
        stage4.show();

        //
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
        
        //
        
        Stage primerStage = new Stage();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Login_FXML.fxml"));
        
        Parent root = loader.load();
        Scene primerscene = new Scene(root);
        
        primerStage.setScene(primerscene);
        
        CONTROLADORES.Login_Controlador controller = loader.getController();
        
        controller.setStage(primerStage);
        
        primerStage.show();
        
        stage2.close();
        
        //
        
        
    }
    
}
