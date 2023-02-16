/*Display a cylinder) Write a program that draws a cylinder, as shown in Figure 14.45b.
You can use the following method to set the dashed stroke for an arc:
arc.getStrokeDashArray().addAll(6.0, 21.0); */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class App extends Application {
   @Override
   public void start(Stage primaryStage){

       Group group = new Group();
       GridPane pane = new GridPane();
       pane.setAlignment(Pos.CENTER);
       pane.setPadding(new Insets(10,10,10,10));


       //Draw the top part first
       Arc arcTopOne = new Arc(100,100,100,50,0,180);
       arcTopOne.setType(ArcType.OPEN);
       arcTopOne.setStroke(Color.BLACK);
       arcTopOne.setFill(Color.WHITE);

       Arc arcTopTwo = new Arc(100,100,100,50,0,-180);
       arcTopTwo.setType(ArcType.OPEN);
       arcTopTwo.setStroke(Color.BLACK);
       arcTopTwo.setFill(Color.WHITE);

       //Draw the bottom part
       Arc arcBottomOne = new Arc(100,400,100,50,0,-180);
       arcBottomOne.setType(ArcType.OPEN);
       arcBottomOne.setStroke(Color.BLACK);
       arcBottomOne.setFill(Color.WHITE);

       Arc arcBottomTwo = new Arc(100,400,100,50,0,180);
       arcBottomTwo.setType(ArcType.OPEN);
       arcBottomTwo.setStroke(Color.BLACK);
       arcBottomTwo.setFill(Color.WHITE);
       arcBottomTwo.getStrokeDashArray().addAll(4.5,4.5);

       //Draw the line
        Line lineLeft = new Line(0,100,0,400);
        Line lineRight = new Line(200,100,200,400);

       group.getChildren().addAll(arcTopOne,arcTopTwo,arcBottomOne,arcBottomTwo,lineLeft,lineRight);
       pane.getChildren().add(group);

       Scene scene = new Scene(pane);
       primaryStage.setTitle("DisplayCylinder");
       primaryStage.setScene(scene);
       primaryStage.show();

   }

   public static void main(String[] args) {
    launch(args);
   }
}
