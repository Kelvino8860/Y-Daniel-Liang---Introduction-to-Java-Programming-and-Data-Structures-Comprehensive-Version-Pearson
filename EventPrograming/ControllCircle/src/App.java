import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class App extends Application {

      private CirclePane circlePane = new CirclePane();

      @Override
      public void start(Stage primaryStage){

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hbox.getChildren().add(btEnlarge);
        hbox.getChildren().add(btShrink);

        //Register events
        EnlargeHandler enlargeHandler = new EnlargeHandler();
        btEnlarge.setOnAction(enlargeHandler);
        ShrinkHandler shrinkHandler = new ShrinkHandler();
        btShrink.setOnAction(shrinkHandler);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hbox);
        BorderPane.setAlignment(hbox, Pos.CENTER);

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("CircleController");
        primaryStage.setScene(scene);
        primaryStage.show();
      }

      public static void main(String[] args) {
        launch(args);
      }

      class EnlargeHandler implements EventHandler<ActionEvent>{
         
         @Override
         public void handle(ActionEvent e){
            
             circlePane.enlarge();
         }
      }

      class ShrinkHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent e){

            circlePane.shrink();
        }
      }
  }

 class CirclePane extends StackPane{

      private Circle circle = new Circle(50);

    public CirclePane()
    {
          getChildren().add(circle);
          circle.setStroke(Color.BLACK);
          circle.setFill(Color.WHITE);
    }

    public void enlarge(){
        circle.setRadius(circle.getRadius() + 2);
    }
    public void shrink(){
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
    }
}
