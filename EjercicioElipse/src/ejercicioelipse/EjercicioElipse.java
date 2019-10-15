/*
 * ALBERTO GODINO BERROCAL 2º DAM
EJERCICIO FadeTransition.
 */
package ejercicioelipse;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author usuario
 */
public class EjercicioElipse extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Creamos el objeto círculo
        Ellipse elipse = new Ellipse(300, 200, 100, 50);
        elipse.setStroke(Color.BLACK);
        elipse.setFill(Color.RED);
        
        
        // Applica una fade transition a elipse
        FadeTransition ft = new FadeTransition(Duration.millis(3000), elipse);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play(); // Start animation
        // Control animation
        elipse.setOnMousePressed(e -> ft.pause());
        elipse.setOnMouseReleased(e -> ft.play());

       
        //Creando el panel y agregando los componentes
        Pane panel = new Pane();
        
        panel.getChildren().add(elipse);
       
        Scene scene = new Scene(panel, 600, 450);
        
        primaryStage.setTitle("Ejercicio FadeTransition");
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
