import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage primaryStage){
         //Create a pane to hold the circle
        Pane pane = new StackPane();

        //Create a circle and set its properties
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.5,0.5,0.5,0.1));
        pane.getChildren().add(circle);

        //Create a label and set its properties
        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
        pane.getChildren().add(label);

        //Create a scene and place it in the stage
        Scene scene = new Scene(pane,200,250);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
