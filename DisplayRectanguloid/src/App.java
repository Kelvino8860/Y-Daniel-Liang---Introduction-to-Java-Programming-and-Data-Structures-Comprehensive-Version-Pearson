/*Display a rectanguloid) Write a program that displays a rectanguloid, as
shown in Figure 14.47a. The cube should grow and shrink as the window grows
or shrinks. */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage){

        StackPane pane = new StackPane();
        Group group = new Group();
        group.scaleXProperty().bind(pane.widthProperty().divide(300));
        group.scaleYProperty().bind(pane.heightProperty().divide(300));

        //DrawLines
        //Front face
        Line lineFrontUp = new Line(100,50,200,50);//JointOne
        Line lineFrontBottom = new Line(100,150,200,150);//JointThree
        Line lineFrontLeft = new Line(100,50,100,150);
        Line lineFrontRight = new Line(200,50,200,150);

        //Back face
        Line lineBackUp = new Line(150,10,250,10); //JointOne
        Line lineBackBottom = new Line(150,110,250,110);//JointThree
        Line lineBackLeft = new Line(150,10,150,110);
        Line lineBackRight = new Line(250,10,250,110);

        //Joints
        Line jointOne = new Line(150,10,100,50);
        Line jointTwo = new Line(250,10,200,50);
        Line jointThree = new Line(150,110,100,150);
        Line jointFour = new Line(250,110,200,150);

         group.getChildren().addAll(lineFrontUp,lineFrontBottom,lineFrontLeft,lineFrontRight,
                                    lineBackUp,lineBackBottom,lineBackLeft,lineBackRight,
                                    jointOne,jointTwo,jointThree,jointFour);

         pane.getChildren().add(group);

        Scene scene = new Scene(pane,200,250);
        primaryStage.setTitle("Display Cuboid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
