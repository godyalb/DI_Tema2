/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mueveraton;

import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class MueveRaton extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Text t1 = new Text(100,100,"Programming is fun");
//        t1.setLayoutX(20);
//        t1.setLayoutY(20);
 
        // Evento que lo recoge al arrastrar el botón sobre el texto.
        t1.setOnMouseDragged(event -> {
            
            t1.setX(event.getX());
            t1.setY(event.getY());
                       
        });
        
        // utilizamos la caja más básica, que es el pane
        // si utilizamos el stackpane no te reconoce el evento
        Pane root = new Pane(); 
        root.getChildren().add(t1);

        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Mueve Texto con Ratón");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
