import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class App extends Application {
   @Override
   public void start(Stage primaryStage){
       
      Group group = new Group();
    //  group.getChildren().add(new Octagon());

      Scene scene = new Scene(new StackPane(new MyOctagon()));
      primaryStage.setTitle("Stop Sign");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

  class MyOctagon extends Pane{

           private void paint(){
              
               Polygon polygon = new Polygon();
               polygon.setStroke(Color.BLACK);
               polygon.setFill(Color.WHITE);
               ObservableList<Double> list = polygon.getPoints();


               //Text text = new Text(centerX,centerY,"STOP");
              // text.setFont(Font.font("Arial",FontWeight.BOLD,20));
               getChildren().clear();
               polygon.setRotate(25);
               getChildren().addAll(polygon);
           }

           @Override
           public void setWidth(double width){
               super.setWidth(width);
               paint();
           }
           @Override
           public void setHeight(double height){
              super.setHeight(height);
              paint();
           }
       }

   public static void main(String[] args) {
    launch(args);
   }
}
