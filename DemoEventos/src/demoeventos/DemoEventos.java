/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoeventos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ailla
 */
public class DemoEventos extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        EventHandler<MouseEvent> handler1 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("handler1...procede del manejador registrado");
            }
        };

        EventHandler<MouseEvent> handler2 = (MouseEvent event) -> {
            System.out.println("handler2...procede del filtro registrado");
        };
        
        Button btn = new Button();
        btn.setText("Botón");
        /*btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, handler1);
        
        StackPane root = new StackPane();
        
        root.getChildren().add(btn);
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, handler2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("JavaFX Manejo de Eventos");
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
