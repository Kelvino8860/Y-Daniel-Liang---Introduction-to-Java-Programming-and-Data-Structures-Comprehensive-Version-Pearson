/*(Draw an arrow line) Write a static method that draws an arrow line from a
   starting point to an ending point in a pane using the following method header:
   public static void drawArrowLine(double startX, double startY,
   double endX, double endY, Pane pane)
   Write a test program that randomly draws an arrow line, as shown in Figure 14.49a. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class App extends Application {
    @Override
    public void start(Stage primaryStage){

       Pane pane = new Pane();
       double startX = (int)(Math.random()*400);
       double startY = (int)(Math.random()*400);
       double endX = (int)(Math.random()*400);
       double endY = (int)(Math.random()*400);

       drawArrowLine(startX,startY,endX,endY,pane);

       Scene scene = new Scene(pane,400,400);
       primaryStage.setTitle("Arrow");
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane){

        double endTemp = 0;
        if(endY > 10){
            double temp = endY - startY;
            if(temp > 10)
            {
                endTemp = startY + 30;
            }
        }
        Line arrowLeft = new Line(startX,startY,startX - 20,endTemp);
        Line arrowRight = new Line(startX,startY,startX + 20,endTemp);
        Line line = new Line(startX,startY,startX,endY);
        pane.getChildren().addAll(line,arrowLeft,arrowRight);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
