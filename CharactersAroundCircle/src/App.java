/*14.5 (Characters around circle) Write a program that displays a string Learning
JavaFX around the circle, as shown in Figure 14.44b. Hint: You need to display
each character in the right location with appropriate rotation using a loop. */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.layout.Pane;

public class App extends Application{
    @Override
    public void start(Stage primaryStage){
        
        Pane pane = new Pane();
        double centerX = 100;
        double centerY = 100;
        double radius = 50;

        String[] str = {" ","J","a","v","a","F","X"," ","L","e","a","r","n","i","n","g"," "};

        for(int i = 0; i < str.length; ++i)
        {
            double locationX = centerX + radius * Math.sin(i * (2 * Math.PI/str.length));
            double locationY = centerY - radius * Math.cos(i * (2 * Math.PI/str.length));
            Text text = new Text(locationX,locationY,str[i]);
            pane.getChildren().add(text);
        }

          
        Scene scene = new Scene(pane,200,250);
        primaryStage.setTitle("CharctersAroundCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
