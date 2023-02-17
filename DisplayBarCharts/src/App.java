/* (Display a bar chart) Write a program that uses a bar chart to display the per-
    centages of the overall market share represented by Apple, HTC, Samsung, and
Others, as shown in Figure 14.46b. Suppose that Apple takes 20 percent and is
displayed in red, HTC takes 26 percent and is displayed in blue, Samsung takes
28 percent and is displayed in green, and the Others take 26 and are displayed
in orange. Use the Rectangle class to display the bars. Interested readers may
explore the JavaFX BarChart class for further study */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class App extends Application {
    @Override
    public void start(Stage primaryStage){

        Group group = new Group();
        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,5,5));
        group.scaleXProperty().bind(pane.widthProperty().divide(1500));
        group.scaleYProperty().bind(pane.heightProperty().divide(500));

        //Create Apple bar
        Rectangle appleRect = new Rectangle(50,100,100,120);
        appleRect.setStroke(Color.BLACK);
        appleRect.setFill(Color.RED);

        //Create HTC bar
        Rectangle htcRect = new Rectangle(160,80,100,140);
        htcRect.setStroke(Color.BLACK);
        htcRect.setFill(Color.BLUE);

        //Samsung bar
        Rectangle samsungRect = new Rectangle(270,70,100,150);
        samsungRect.setStroke(Color.BLACK);
        samsungRect.setFill(Color.GREEN);

        //Others bar
        Rectangle othersRect = new Rectangle(380,80,100,140);
        othersRect.setStroke(Color.BLACK);
        othersRect.setFill(Color.ORANGE);

        group.getChildren().addAll(new Text(50,95,"Apple -- 20%"),appleRect,
                                   new Text(160,75,"HTC -- 26%"),htcRect,
                                   new Text(270,65,"Samsung -- 28%"),samsungRect,
                                   new Text(380,75,"Others -- 26%"),othersRect);

        pane.getChildren().add(group);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("DisplayBarCharts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
