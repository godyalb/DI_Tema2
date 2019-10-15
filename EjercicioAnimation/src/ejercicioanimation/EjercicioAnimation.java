/*
 * Alberto Godino Berrocal - 2º DAM
    Ejercicio PathTransition in Animation.
 */
package ejercicioanimation;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class EjercicioAnimation extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Creamos el objeto círculo
        Circle circle = new Circle(300,225,125,Color.AQUAMARINE);
        circle.setStroke(Color.BLACK);
        
        // Creamos un rectángulo
        Rectangle rectangle = new Rectangle(50,100,Color.CADETBLUE);
        rectangle.setStroke(Color.BLACK);
        
        // Create a path transition
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play(); // Start animation
        circle.setOnMousePressed(e -> pt.pause());
        circle.setOnMouseReleased(e -> pt.play());

       
        //Creando el panel y agregando los componentes
        Pane panel = new Pane();
        
        panel.getChildren().add(circle);
        panel.getChildren().add(rectangle);
        
        Scene scene = new Scene(panel, 600, 450);
        
        primaryStage.setTitle("Ejercicio Animation");
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
