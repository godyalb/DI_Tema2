/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciokeyevent;

import javafx.scene.input.KeyEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import static javafx.scene.input.KeyCode.UP;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class EjercicioKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Creamos el objeto de la clase Text
        Text texto = new Text(20, 20, "A");
                
        //Creando el panel y agregando los componentes
        Pane panel = new Pane();
        
        // Para que se pueda mover, hace falta poner el focus a true
        texto.setFocusTraversable(true);
        
        texto.setOnKeyPressed(new EventHandler<KeyEvent>() {
            
            @Override
            public void handle(KeyEvent event) {

                if(event.getCode()==DOWN){
                    texto.setY(texto.getY()+10);
                }
                if(event.getCode()==UP){
                    texto.setY(texto.getY()-10);
                }
                if(event.getCode()==RIGHT){
                    texto.setX(texto.getX()+10);
                }
                if(event.getCode()==LEFT){
                    texto.setX(texto.getX()-10);
                }
                else{
                    texto.setText(texto.getText() + event.getText());
                }
            }
                
            
        });
        
        // Añadimos el Text al Panel.
        panel.getChildren().add(texto);
        
        Scene scene = new Scene(panel, 300, 250);
        
        primaryStage.setTitle("Expresiones Lambda - KeyEvent");
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
