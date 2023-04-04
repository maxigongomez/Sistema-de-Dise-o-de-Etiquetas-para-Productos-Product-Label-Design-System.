/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADORES;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author maxi_
 */
public class FXMain extends Application {
    
    @Override
    public void start(Stage primerStage) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Login_FXML.fxml"));
        
        Parent root = loader.load();
        Scene primerscene = new Scene(root);
        
        primerStage.setScene(primerscene);
        
        CONTROLADORES.Login_Controlador controller = loader.getController();
        
        controller.setStage(primerStage);
        
        primerStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
