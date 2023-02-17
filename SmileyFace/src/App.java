/*Paint a smiley face) Write a program that paints a smiley face, as shown in
Figure 14.46a. */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class App extends Application {
 @Override
 public void start(Stage primaryStage){

    Group group = new Group();

    //Draw a head
    Circle circle = new Circle(100,100,100);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.YELLOW);

    //Draw eyes
    Ellipse eyeLeft = new Ellipse(60,50,30,20);
    eyeLeft.setStroke(Color.BLACK);
    eyeLeft.setFill(Color.WHITE);

    Ellipse eyeRight = new Ellipse(140,50,30,20);
    eyeRight.setStroke(Color.BLACK);
    eyeRight.setFill(Color.WHITE);

    //Draw eyeballs
    Circle ballLeft = new Circle(60,50,10);
    ballLeft.setStroke(Color.BLACK);
    ballLeft.setFill(Color.BLACK);

    Circle ballRight = new Circle(140,50,10);
    ballRight.setStroke(Color.BLACK);
    ballRight.setFill(Color.BLACK);

    //Draw a nose
    Line lineOne = new Line(100,80,130,130);
    Line lineTwo = new Line(130,130,90,130);

    //Draw smiley mouth
    Arc arc = new Arc(110,140,50,30,0,-180);
    arc.setStroke(Color.BLACK);
    arc.setFill(Color.YELLOW);
    arc.setType(ArcType.OPEN);

    //Add nodes in the group
    group.getChildren().addAll(circle,eyeLeft,eyeRight,ballLeft,ballRight,lineOne,lineTwo,arc);

    //Initialize a stakpane
    //Add the group to the pane
     StackPane pane = new StackPane();
     pane.getChildren().add(group);

    //Bind group with the pane size
    group.scaleXProperty().bind(pane.widthProperty().divide(300));
    group.scaleYProperty().bind(pane.heightProperty().divide(300));

    //Set a scene and add scene into a stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("SmileyFace");
    primaryStage.setScene(scene);
    primaryStage.show();
 }

 public static void main(String[] args) {
    launch(args);
 }
}
