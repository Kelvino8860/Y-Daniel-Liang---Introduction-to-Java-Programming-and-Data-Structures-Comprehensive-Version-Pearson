/*(Color and font) Write a program that displays five texts vertically, as shown in
Figure 14.44a. Set a random color and opacity for each text and set the font of
each text to Times Roman, bold, italic, and 24 pixels. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;

public class App extends Application{
    @Override
    public void start(Stage primaryStage){

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(30,30,30,30));

        Text[] text = {new Text("JavaFX"),new Text("JavaFX"),new Text("JavaFX"),
                       new Text("JavaFX"),new Text("JavaFX")};

        for(int i = 0; i < text.length; ++i)
        {
            text[i].setFont(Font.font("Times Roman",FontWeight.BOLD,FontPosture.ITALIC,24));
            text[i].setRotate(90);
            text[i].setStroke(new Color(Math.random(),Math.random(),Math.random(),Math.random()*1+0));
            pane.getChildren().add(text[i]);
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Color and Font");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}